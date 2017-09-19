package ru.geekbrains.fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import layout.FragmentCount;

public class MainActivity extends AppCompatActivity {

    private FragmentTime fragment1;
    private FragmentCount fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFragment1 = (Button) findViewById(R.id.buttonFragment1);
        Button buttonFragment2 = (Button) findViewById(R.id.buttonFragment2);

        buttonFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
                if (fragment2 != null && fragment2.isAdded()) fTrans.remove(fragment2);
                if (fragment1 == null) fragment1 = new FragmentTime();
                if (!fragment1.isAdded()) fTrans.add(R.id.frgmCont, fragment1);
                fTrans.commit();
            }
        });

        buttonFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
                if (fragment1 != null && fragment1.isAdded()) fTrans.remove(fragment1);
                if (fragment2 == null) fragment2 = new FragmentCount();
                if (!fragment2.isAdded()) fTrans.add(R.id.frgmCont, fragment2);
                fTrans.commit();
            }
        });
    }
}
