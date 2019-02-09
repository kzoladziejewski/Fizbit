package com.example.kacper.fizbit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    TextView mTwojWynik, mX10;
    Button mJeszczeRaz, mPowrot;
    Intent jeszczeRaz, Powrot;
    ImageView score;
    int wynik;
    private int[] imageArray;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        this.jeszczeRaz = new Intent(this, Question.class);
        this.Powrot = new Intent(this, Category.class);

        mJeszczeRaz = (Button) findViewById(R.id.mJeszczeRaz);
        mPowrot = (Button) findViewById(R.id.mPowrot);
        sharedPreferences = getSharedPreferences("fizbit", Context.MODE_PRIVATE);
        Log.e("Problemy psychiczne są tutaj:", String.valueOf(sharedPreferences.getInt("score", 0)));
        wynik = sharedPreferences.getInt("score", 0);
        Log.e("aaaa", String.valueOf(wynik));

        imageArray = new int[11];
        imageArray[0] = R.drawable.corgi_0;
        imageArray[1] = R.drawable.corgi_1;
        imageArray[2] = R.drawable.corgi_2;
        imageArray[3] = R.drawable.corgi_3;
        imageArray[4] = R.drawable.corgi_4;
        imageArray[5] = R.drawable.corgi_5;
        imageArray[6] = R.drawable.corgi_6;
        imageArray[7] = R.drawable.corgi_7;
        imageArray[8] = R.drawable.corgi_8;
        imageArray[9] = R.drawable.corgi_9;
        imageArray[10] = R.drawable.corgi_10;
        score = (ImageView) findViewById(R.id.mCorgiScore);
        score.setImageResource(imageArray[wynik]);


        mPowrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                startActivityForResult(Powrot, 1);
            }
        });

        mJeszczeRaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(jeszczeRaz);
            }
        });

    }
}
