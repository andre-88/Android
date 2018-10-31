package com.google.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Handler;
import android.os.Message;

//https://www.youtube.com/watch?v=1TiEQ0WhvSU&list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl&index=39
public class MainActivity extends AppCompatActivity {

    int counter = 0;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            TextView text = findViewById(R.id.text);
            text.setText("Click Thread Action "+counter);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
        TextView text = findViewById(R.id.text);

        //Simulate looong calculation
        long futureTime = System.currentTimeMillis() + 3000;
        while(System.currentTimeMillis() < futureTime){
            synchronized(this) {
                try {
                    wait(futureTime - System.currentTimeMillis());
                } catch(Exception e){}
            }
        }
        text.setText("Click Linear Action");
    }

    public void buttonThreadClick(View view){

        Runnable r = new Runnable() {
            @Override
            public void run() {
                //Simulate looong calculation
                long futureTime = System.currentTimeMillis() + 3000;
                while(System.currentTimeMillis() < futureTime){
                    synchronized (this){
                        try{
                            wait(futureTime - System.currentTimeMillis());
                        }catch(Exception e){}
                    }

                }
                counter++;
                handler.sendEmptyMessage(0);
            }
        };

        Thread myThread  = new Thread(r);
        myThread.start();
    }
}
