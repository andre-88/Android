package com.google.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout main_view = (RelativeLayout) findViewById(R.id.main_view);

        switch (item.getItemId()){
            case R.id.menu_red:
                item.setChecked(item.isChecked());
                main_view.setBackgroundColor(Color.RED);
                break;

            case R.id.menu_green:
                item.setChecked(item.isChecked());
                main_view.setBackgroundColor(Color.GREEN;
                break;

            case R.id.menu_yellow:
                item.setChecked(item.isChecked());
                main_view.setBackgroundColor(Color.YELLOW);
                break;
            default: return super.onOptionsItemSelected(item);
        }


        return true;
    }
}
