package com.davis.healthyliving;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private static final String TAG = "RecyclerAdapter";
    private ArrayList<String> mCalories = new ArrayList<>();
    private ArrayList<String> mFeatures= new ArrayList<>();
    private ArrayList<String> mSource = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private Context mContext;

    public RecyclerAdapter(Context mContext, ArrayList<String> mCalories, ArrayList<String> mFeatures, ArrayList<String> mSource, ArrayList<String> mImageUrls) {
        this.mCalories = mCalories;
        this.mFeatures = mFeatures;
        this.mSource = mSource;
        this.mImageUrls = mImageUrls;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrls.get(position))
                .into(holder.mImageview);

        holder.mFeatureView.setText(mFeatures.get(position));
        holder.mSourceView.setText(mSource.get(position));
        holder.mCalories.setText(mCalories.get(position));

        holder.mImageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on an image: " + mSource.get(position));
                Toast.makeText(mContext, mSource.get(position), Toast.LENGTH_SHORT).show();
            }

        });

    }

    @Override
    public int getItemCount() {
        return mSource.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageview;
        TextView mSourceView;
        TextView mFeatureView;
        TextView mCalories;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageview = itemView.findViewById(R.id.foodImage);
            mFeatureView = itemView.findViewById(R.id.feature);
            mCalories = itemView.findViewById(R.id.calorieCount);
            mSourceView = itemView.findViewById(R.id.sourceName);
        }
    }
}
