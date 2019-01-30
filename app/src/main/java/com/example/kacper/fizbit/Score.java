package com.example.kacper.fizbit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Score extends AppCompatActivity {
    TextView mTwojWynik, mX10;
    Button mJeszczeRaz, mPowrot;
    Intent jeszczeRaz, Powrot;
    int wynik;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        this.jeszczeRaz = new Intent(this, Question.class);
        this.Powrot = new Intent(this,Category.class);
        mTwojWynik = (TextView) findViewById(R.id.mWynik);
        mX10 = (TextView) findViewById(R.id.mx10);
        mJeszczeRaz = (Button) findViewById(R.id.mJeszczeRaz);
        mPowrot = (Button) findViewById(R.id.mPowrot);
        sharedPreferences = getSharedPreferences("fizbit", Context.MODE_PRIVATE);
        Log.e("Problemy psychiczne są tutaj:", String.valueOf(sharedPreferences.getInt("score",0)));
        wynik = sharedPreferences.getInt("score",0);
        Log.e("aaaa", String.valueOf(wynik));



        mPowrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                startActivityForResult(Powrot,1);
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
