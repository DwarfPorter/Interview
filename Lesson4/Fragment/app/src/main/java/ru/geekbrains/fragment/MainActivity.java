package ru.geekbrains.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import layout.FragmentCount;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment1;
    private Fragment fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFragment1 = (Button) findViewById(R.id.buttonFragment1);
        Button buttonFragment2 = (Button) findViewById(R.id.buttonFragment2);

        buttonFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment1 = changeFragments(fragment1, fragment2, new CreatorFragmentCount());
            }
        });

        buttonFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment2 = changeFragments(fragment2, fragment1, new CreatorFragmentTime());
            }
        });
    }

    private Fragment changeFragments(Fragment fragmentA, Fragment fragmentB, CreatorFragment creatorFragment){
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
        if (fragmentB != null && fragmentB.isAdded()) fTrans.remove(fragmentB);
        if (fragmentA == null) fragmentA = creatorFragment.create();
        if (!fragmentA.isAdded()) fTrans.add(R.id.frgmCont, fragmentA);
        fTrans.commit();
        return fragmentA;
    }

    interface CreatorFragment{
        Fragment create();
    }

    class CreatorFragmentTime implements CreatorFragment{
        public Fragment create(){
            return new FragmentTime();
        }
    }

    class CreatorFragmentCount implements CreatorFragment{
        public Fragment create(){
            return new FragmentCount();
        }
    }
}
