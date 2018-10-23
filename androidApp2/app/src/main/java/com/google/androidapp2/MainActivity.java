package com.google.androidapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "andreMessage";
    static final String STATE_SCORE = "playerScore";
    static final String STATE_LEVEL = "playerLevel";
    private int ClickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        Button btnStart = (Button)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(

                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        ClickCount+=1;

                        TextView lblResult = (TextView)findViewById(R.id.lblResult);
                        lblResult.setText("Click Action: " + ClickCount);

                    }
                }

        );

        btnStart.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        TextView lblResult = (TextView)findViewById(R.id.lblResult);
                        lblResult.setText("Looong Click Action....");

                        //Onclick will be triggered
                        //return false;

                        //Onclick will NOT be triggered
                        return true;
                    }
                }

        );







    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        // Save the user's current game state
        //savedInstanceState.putInt(STATE_SCORE, "1");
        //savedInstanceState.putInt(STATE_LEVEL, "2");

        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");
    }
}
