package com.google.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


//https://www.youtube.com/watch?v=MHHXxWbSaho&list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl&index=28
public class MainActivity extends AppCompatActivity implements ITopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This get called by ITopFragment
    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setPictureText(top,bottom);

    }
}
