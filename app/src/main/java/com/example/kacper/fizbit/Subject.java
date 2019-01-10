package com.example.kacper.fizbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Subject extends AppCompatActivity {

    TextView podkategoria;
    RecyclerView temats;
    ArrayList<String> kategoria_magazyn = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        podkategoria = (TextView) findViewById(R.id.mKategoria);
        temats = (RecyclerView) findViewById(R.id.subject);
        temats.setHasFixedSize(true);
        temats.setLayoutManager(new LinearLayoutManager(this));
        temats.setItemAnimator(new DefaultItemAnimator());
        String kategoria = getIntent().getStringExtra("kategoria");
        if (kategoria.contains("fizyka"))
        {
            kategoria_magazyn.add("Całość");
            kategoria_magazyn.add("Elektrycznosc");
            kategoria_magazyn.add("Dynamika");
            kategoria_magazyn.add("Optyka");
            kategoria_magazyn.add("Fizyka jądrowa");
            kategoria_magazyn.add("Mechanika");

        }
        if (kategoria.contains("astronomia"))
        {
            kategoria_magazyn.add("Całość");
            kategoria_magazyn.add("Planety");
            kategoria_magazyn.add("Heliocentryzm");


        }
        Log.e("kategoria",kategoria);
        Log.e("kategoria", String.valueOf(kategoria_magazyn));
        temats.setAdapter(new Subject_Adapter(kategoria_magazyn, temats));

    }
}
