package com.google.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    private TextView lblActionMessage;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblActionMessage = findViewById(R.id.lblActionMessage);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    //////////// START GESTURES  ///////////////////////////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        lblActionMessage.setText("Single Tap confirmed action");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        lblActionMessage.setText("Double Tap action");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        lblActionMessage.setText("Double Tap Event action");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        lblActionMessage.setText("Down action");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        lblActionMessage.setText("Show Press action");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        lblActionMessage.setText("Single Tap up action");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        lblActionMessage.setText("Scroll action");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        lblActionMessage.setText("Long Press action");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        lblActionMessage.setText("Fling action");
        return true;
    }

    //////////// END GESTURES  ///////////////////////////////

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //Handle Gesture First before call base class
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
