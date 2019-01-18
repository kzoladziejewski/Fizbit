package com.example.kacper.fizbit;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class Settings extends AppCompatActivity {
    TextView mUstawiania, mPoziomTrudnosci;
    Switch mDzwieki;
    Button mLatwy, mSredni, mTrudny, mPowrot;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mUstawiania = (TextView) findViewById(R.id.mUstawienia);
        mPoziomTrudnosci = (TextView) findViewById(R.id.mPoziom);
        mDzwieki = (Switch) findViewById(R.id.mDzwieki);
        mLatwy = (Button) findViewById(R.id.mLatwy);
        mSredni = (Button) findViewById(R.id.mSredni);
        mTrudny = (Button) findViewById(R.id.mTrudny);
        mPowrot = (Button) findViewById(R.id.mPowrot);

        sharedPreferences = getSharedPreferences("fizbit", Context.MODE_PRIVATE);
//        String level = sharedPreferences.getString("level","Latwy");
//        sharedPreferences.edit().putString("level");

        mLatwy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences.edit().putString("level","Latwy");
                sharedPreferences.edit().apply();
            }
        });

        mSredni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences.edit().putString("level","Sredni");
                sharedPreferences.edit().apply();
            }
        });

        mTrudny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences.edit().putString("level","Trudny");
                sharedPreferences.edit().apply();
            }
        });

        mPowrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
