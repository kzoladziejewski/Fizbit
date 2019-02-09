package com.example.kacper.fizbit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
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
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context ctx;

    private RecyclerView mRecyclerView;

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView kategoriaText;

        public MyViewHolder(View pItem) {
            super(pItem);
            kategoriaText = (TextView) pItem.findViewById(R.id.subject_title);
        }
    }

    public Subject_Adapter(ArrayList<String> kategoria, RecyclerView temats, Context context) {
        Log.e("Udalo sie", "aa");
        this.kategoria = kategoria;
        this.mRecyclerView = temats;
        this.ctx = context;
        preferences = ctx.getSharedPreferences("fizbit", Activity.MODE_PRIVATE);
        editor = preferences.edit();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.subject_adapter, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean dzwieki = preferences.getBoolean("sound", false);
                final MediaPlayer mp = MediaPlayer.create(v.getContext(), R.raw.poziom_kategoria);
                if (dzwieki) {
                    mp.start();
                }
                int wybrana_kategoria = mRecyclerView.getChildAdapterPosition(v);
                Intent pytania = new Intent(v.getContext(), Question.class);
                Log.e("wybrane kato:", String.valueOf(kategoria.get(wybrana_kategoria)));
                editor.putString("dziedzina", kategoria.get(wybrana_kategoria));
                editor.apply();
                v.getContext().startActivity(pytania);
            }
        });
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String article = kategoria.get(position);
        Log.e("Kategoria", article);
        ((MyViewHolder) holder).kategoriaText.setText(article);
    }

    @Override
    public int getItemCount() {
        return kategoria.size();
    }
}
