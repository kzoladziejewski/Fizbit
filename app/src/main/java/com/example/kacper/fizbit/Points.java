package com.example.kacper.fizbit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kacper on 14.01.2019.
 */

public class Points extends RecyclerView.Adapter {
    private ArrayList<Punkty> kolor = new ArrayList<Punkty>();
    private RecyclerView mRecyclerView;

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView questionPoints;

        public MyViewHolder(View pItem) {
            super(pItem);
            questionPoints = (ImageView) pItem.findViewById(R.id.question_points);
        }
    }

    public Points(ArrayList<Punkty> punkties, RecyclerView temats)
    {
        this.kolor = punkties;
        mRecyclerView = temats;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.question_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int art = kolor.get(position).getColors();
        if (art == 0) {
            ((MyViewHolder) holder).questionPoints.setBackgroundResource(R.drawable.dobrze);
        }
        if (art == 1) {
            ((MyViewHolder) holder).questionPoints.setBackgroundResource(R.drawable.zle);
        }
        if (art == 2) {
            ((MyViewHolder) holder).questionPoints.setBackgroundResource(R.drawable.szaro);
        }
    }

    @Override
    public int getItemCount() {
        return kolor.size();
    }
}
