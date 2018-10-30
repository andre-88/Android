package com.google.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.transition.TransitionManager;


public class MainActivity extends AppCompatActivity {

    ViewGroup layout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);

        layout = (ViewGroup)findViewById(R.id.layout);
        layout.setOnTouchListener(
                new RelativeLayout.OnTouchListener()
                {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        moveButton();
                        return true;
                    }
                }
        );
    }

    public void moveButton() {
        TransitionManager.beginDelayedTransition(layout);

        // Change the position
        RelativeLayout.LayoutParams positionRules = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);

        button.setLayoutParams(positionRules);

        // Change the size
        ViewGroup.LayoutParams sizeRules = button.getLayoutParams();

        sizeRules.width = 450;
        sizeRules.height = 300;

        button.setLayoutParams(sizeRules);
    }
}
