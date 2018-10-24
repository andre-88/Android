package com.google.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment{

    private static TextView textViewTop;
    private static TextView textViewBottom;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        textViewTop = view.findViewById(R.id.textViewTop);
        textViewBottom = view.findViewById(R.id.textViewBottom);

        return view;
    }

    public void setPictureText(String top, String bottom){

        textViewTop.setText(top);
        textViewBottom.setText(bottom);

    }
}
