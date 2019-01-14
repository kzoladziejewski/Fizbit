package com.example.kacper.fizbit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kacper on 14.01.2019.
 */

public class Points extends RecyclerView.Adapter {
    private ArrayList<Punkty> kolor = new ArrayList<Punkty>();
    private RecyclerView mRecyclerView;

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView questionPoints;

        public MyViewHolder(View pItem) {
            super(pItem);
            questionPoints = (TextView) pItem.findViewById(R.id.question_points);
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
        ((MyViewHolder) holder).questionPoints.setBackgroundColor(art);
    }

    @Override
    public int getItemCount() {
        return kolor.size();
    }
}
