package ru.geekbrains.cycleactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "[CycleActivity]";
    private TextView firstRunTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstRunTextView = (TextView) findViewById(R.id.textViewInfo);
        if (savedInstanceState == null){
            firstRunTextView.setText("Первый запуск!");
        }
        else{
            firstRunTextView.setText("Повторный запуск!");
        }
        makeMessage("onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        makeMessage("onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        firstRunTextView.setText("Повторный запуск!!");
        makeMessage("onRestoreInstanceState()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeMessage("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeMessage("onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        makeMessage("onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeMessage("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeMessage("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeMessage("onDestroy()");
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonExit:
                finish();
                break;
            default:
                break;
        }
    }

    private void makeMessage(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.i(TAG, message);
    }
}