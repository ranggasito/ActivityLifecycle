package com.bekup2.lesson.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    private static final String LOG_TAG = "bekup2-activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d(LOG_TAG, "onCreate \n This is the first callback and called when the activity is first created.");
    }

    public void btn_handler(View btn){
        switch (btn.getId()){
            case R.id.btn_back:
                finish();
                break;
            default : break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart() \n This callback is called when the activity becomes visible to the user.\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume() \n This is called when the user starts interacting with the application.");
    }

    @Override
    protected void onPause() {
        Log.d(LOG_TAG, "onPaused() \n The paused activity does not receive user input and cannot execute any code and called when the current activity is being paused and the previous activity is being resumed");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(LOG_TAG, "onStop() \n This callback is called when the activity is no longer visible.");
        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Log.d(LOG_TAG, "onDestroy() \n This callback is called before the activity is destroyed by the system.");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(LOG_TAG, "onRestart() \n This callback is called when the activity restarts after stopping it.");
        super.onRestart();
    }
}
