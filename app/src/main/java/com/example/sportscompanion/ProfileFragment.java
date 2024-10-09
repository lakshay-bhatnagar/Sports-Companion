package com.example.sportscompanion;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    private TextView userName;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        userName = view.findViewById(R.id.user_name);

        // adding gradient to the user name
        TextPaint paint = userName.getPaint();
        float width = paint.measureText(userName.getResources().getString(R.string.user_name_profile_page));
        Shader textShader = new LinearGradient(0,0,width,userName.getTextSize(),
                new int[]{
                        Color.parseColor("#FF5CCC"),
                        Color.parseColor("#DC52BF"),
                        Color.parseColor("#B947B1"),
                        Color.parseColor("#973DA4"),
                        Color.parseColor("#743296"),
                        Color.parseColor("#512889")
                }, null, Shader.TileMode.CLAMP);

        userName.getPaint().setShader(textShader);
        return view;
    }
}