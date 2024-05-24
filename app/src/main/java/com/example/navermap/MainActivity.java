package com.example.navermap;


import android.os.Bundle;
import android.widget.FrameLayout;
//import android.support.annotation.NonNull;
//import android.support.annotation.UiThread;
//import android.support.v4.app.FragmentActivity;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment_NaverMap fragment_naverMap =new Fragment_NaverMap();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, fragment_naverMap).commit();



    }

}

