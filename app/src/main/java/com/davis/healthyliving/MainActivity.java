package com.davis.healthyliving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mCalories = new ArrayList<>();
    private ArrayList<String> mFeatures= new ArrayList<>();
    private ArrayList<String> mSource = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void initimageBitmaps(){
        mImageUrls.add("https://images.mid-day.com/images/2019/mar/Bacon-Venue-a_l.jpg");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS4SOmIk0pfHTDJIPfD_QxqJ7apsGLiOVjQgYP5aQSbjtn8Sq9x");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQQAJiCgenllJUFVwfyslBQUn2j7wqccWFb160sAbqm7UTdBXjx");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSnvbQ-gdZukXtF-K5c4uDAOcASosKZuLD_6_uxbLgphsK2OiFv");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ6YJ9nwlcL-KfiUcFLWmvvpMX4VVyNpe9VduhEyOndjLKMP2YT");
        mImageUrls.add("https://images.mid-day.com/images/2019/mar/Bacon-Venue-a_l.jpg");
    }
}
