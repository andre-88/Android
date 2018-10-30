package com.google.sendbroadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

//https://www.youtube.com/watch?v=htU_Rd-DW2U&index=38&list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendOutBroadcast(View view){
        Intent i = new Intent();
        i.setAction("com.google.sendbroadcast");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}
