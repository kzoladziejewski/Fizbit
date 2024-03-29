package com.example.kacper.fizbit;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Subject extends AppCompatActivity {

    TextView podkategoria;
    RecyclerView temats;
    ArrayList<String> kategoria_magazyn = new ArrayList<>();
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        podkategoria = (TextView) findViewById(R.id.mPodkategoria);
        podkategoria.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        podkategoria.setTextSize(25);

        temats = (RecyclerView) findViewById(R.id.subject);
        temats.setHasFixedSize(true);
        temats.setLayoutManager(new LinearLayoutManager(this));
        temats.setItemAnimator(new DefaultItemAnimator());
        String kategoria = getIntent().getStringExtra("kategoria");
        sharedPreferences = getSharedPreferences("fizbit", Context.MODE_PRIVATE);
        Log.e("SUBJECT___________________", kategoria);
        sharedPreferences.edit().putString("kategoria", kategoria);
        sharedPreferences.edit().apply();

        if (kategoria.contains("Fizyka")) {
            kategoria_magazyn.add("Całość");
            kategoria_magazyn.add("Mechanika");
            kategoria_magazyn.add("Elektrycznosc");
            kategoria_magazyn.add("Dynamika");
            kategoria_magazyn.add("Optyka");
            kategoria_magazyn.add("Fizyka jądrowa");

        }
        if (kategoria.contains("Astronomia")) {
            kategoria_magazyn.add("Całość");
            kategoria_magazyn.add("Planety");
//            kategoria_magazyn.add("Heliocentryzm");


        }
        Log.e("kategoria_1", kategoria);
        Log.e("kategoria_1", String.valueOf(kategoria_magazyn));
        temats.setAdapter(new Subject_Adapter(kategoria_magazyn, kategoria, temats, getApplicationContext()));

    }
}
