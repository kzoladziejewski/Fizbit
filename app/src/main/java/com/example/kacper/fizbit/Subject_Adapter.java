package com.example.kacper.fizbit;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kacper on 10.01.2019.
 */

public class Subject_Adapter extends RecyclerView.Adapter {
    private ArrayList<String> kategoria = new ArrayList<String>();

    private RecyclerView mRecyclerView;

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView kategoriaText;

        public MyViewHolder(View pItem) {
            super(pItem);
            kategoriaText = (TextView) pItem.findViewById(R.id.subject_title);
        }
    }

    public Subject_Adapter(ArrayList<String> kategoria, RecyclerView temats) {
        Log.e("Udalo sie","aa");
        this.kategoria=kategoria;
        Log.e("Udalo sie", String.valueOf(kategoria));
        this.mRecyclerView=temats;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.subject_adapter, parent, false);
        Log.e("Kategoria","ej");
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int wybrana_kategoria = mRecyclerView.getChildAdapterPosition(v);
                    Intent pytania = new Intent(v.getContext(), Question.class);
                    pytania.putExtra("temat",kategoria.get(wybrana_kategoria));
                    v.getContext().startActivity(pytania);
                }
            });
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String article = kategoria.get(position);
        Log.e("Kategoria",article);
        ((MyViewHolder) holder).kategoriaText.setText(article);
    }

    @Override
    public int getItemCount() {
        return kategoria.size();
    }
}
