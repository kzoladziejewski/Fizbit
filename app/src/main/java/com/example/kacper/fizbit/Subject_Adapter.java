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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kacper on 10.01.2019.
 */

public class Subject_Adapter extends RecyclerView.Adapter {
    private ArrayList<String> kategoria = new ArrayList<String>();
    String przedmiot;
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

    public Subject_Adapter(ArrayList<String> kategoria, String przedmiot, RecyclerView temats, Context context) {
        Log.e("Udalo sie", "aa");
        this.kategoria = kategoria;
        this.mRecyclerView = temats;
        this.ctx = context;
        this.przedmiot = przedmiot;
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
                final MediaPlayer mp = MediaPlayer.create(v.getContext(), R.raw.klik);
                if (dzwieki) {
                    mp.start();
                }
                int wybrana_kategoria = mRecyclerView.getChildAdapterPosition(v);
                Intent pytania = new Intent(v.getContext(), Question.class);
                Log.e("wybrane kato:", String.valueOf(kategoria.get(wybrana_kategoria)));
                editor.putString("kategoria", przedmiot);
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
        if (article.equals("Całość")) {
            ((MyViewHolder) holder).kategoriaText.setBackgroundResource(R.drawable.guzik_calosc);
        }
        if (article.equals("Elektrycznosc")) {
            ((MyViewHolder) holder).kategoriaText.setBackgroundResource(R.drawable.guzik_elektrycznosc);
        }
        if (article.equals("Mechanika")) {
            ((MyViewHolder) holder).kategoriaText.setBackgroundResource(R.drawable.guzik_mechanika);
        }
        if (article.equals("Optyka")) {
            ((MyViewHolder) holder).kategoriaText.setBackgroundResource(R.drawable.guzik_optyka);
        }
        if (article.equals("Dynamika")) {
            ((MyViewHolder) holder).kategoriaText.setBackgroundResource(R.drawable.guzik_termodynamika);
        }
        if (article.equals("Fizyka jądrowa")) {
            ((MyViewHolder) holder).kategoriaText.setBackgroundResource(R.drawable.guzik_fizyka_jadrowa);
        }
        if (article.equals("Planety")) {
            ((MyViewHolder) holder).kategoriaText.setBackgroundResource(R.drawable.guzik_planety);
        }
//        if (article.equals("Słońce")){((MyViewHolder) holder).kategoriaText.setBackgroundColor(R.drawable.);}

    }

    @Override
    public int getItemCount() {
        return kategoria.size();
    }
}
