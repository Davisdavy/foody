package com.davis.healthyliving;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ArrayList<String> mCalories = new ArrayList<>();
    private ArrayList<String> mFeatures= new ArrayList<>();
    private ArrayList<String> mSource = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();

    }

    private void getImages(){
        mImageUrls.add("https://images.mid-day.com/images/2019/mar/Bacon-Venue-a_l.jpg");
        mSource.add("Kenya");
        mFeatures.add("High Sucrose");
        mCalories.add("100");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS4SOmIk0pfHTDJIPfD_QxqJ7apsGLiOVjQgYP5aQSbjtn8Sq9x");
        mSource.add("Kenya");
        mFeatures.add("High Sucrose");
        mCalories.add("100");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQQAJiCgenllJUFVwfyslBQUn2j7wqccWFb160sAbqm7UTdBXjx");
        mSource.add("Kenya");
        mFeatures.add("High Sucrose");
        mCalories.add("100");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSnvbQ-gdZukXtF-K5c4uDAOcASosKZuLD_6_uxbLgphsK2OiFv");
        mSource.add("Kenya");
        mFeatures.add("High Sucrose");
        mCalories.add("100");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ6YJ9nwlcL-KfiUcFLWmvvpMX4VVyNpe9VduhEyOndjLKMP2YT");
        mSource.add("Kenya");
        mFeatures.add("High Sucrose");
        mCalories.add("100");
        mImageUrls.add("https://images.mid-day.com/images/2019/mar/Bacon-Venue-a_l.jpg");
        mSource.add("Kenya");
        mFeatures.add("High Sucrose");
        mCalories.add("100");

        initRecyclerView();
    }
    private  void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init RecyclerView");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, mCalories,mFeatures,mSource,mImageUrls);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
