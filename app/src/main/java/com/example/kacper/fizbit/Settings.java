package com.example.kacper.fizbit;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {
    TextView mUstawiania, mPoziomTrudnosci;
    Switch mDzwieki;
    Button mLatwy, mSredni, mTrudny, mPowrot;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
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
        editor = sharedPreferences.edit();
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.poziom_trudnosci);
        final boolean dzwieki = sharedPreferences.getBoolean("sound", false);

        mDzwieki.setChecked(dzwieki);
        String kolorek = sharedPreferences.getString("level","Latwy");
        koloruj(kolorek);
        mLatwy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dzwieki){
                    mp.start();}                Toast toast = Toast.makeText(getApplicationContext(),"Wybrano latwy poziom",Toast.LENGTH_SHORT);
                toast.show();
                zapis("Latwy");
            }
        });

        mSredni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dzwieki){
                    mp.start();}
                Toast toast = Toast.makeText(getApplicationContext(),"Wybrano średni poziom",Toast.LENGTH_SHORT);
                toast.show();
                zapis("Sredni");

            }
        });

        mTrudny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dzwieki){
                    mp.start();}
                Toast toast = Toast.makeText(getApplicationContext(),"Wybrano trudny poziom",Toast.LENGTH_SHORT);
                toast.show();
                zapis("Trudny");

            }
        });

        mPowrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mDzwieki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("sound",mDzwieki.isChecked());
                Log.e("DZWIEKI", String.valueOf(mDzwieki.isChecked()));
            }
        });
    }

    @Override
    protected void onDestroy()
    {
        editor.commit();
        super.onDestroy();
    }

    public void zapis(String poziom)
    {
//        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("level",poziom);
        koloruj(poziom);
    }


    public void koloruj(String kolor)
    {
        if (kolor.equals("Latwy"))
        {
            mLatwy.setBackgroundColor(0xFF00DD00);
            mSredni.setBackgroundColor(0xFFCCCCCC);
            mTrudny.setBackgroundColor(0xFFCCCCCC);
        }
        if (kolor.equals("Sredni"))
        {
            mSredni.setBackgroundColor(0xFF00DD00);
            mLatwy.setBackgroundColor(0xFFCCCCCC);
            mTrudny.setBackgroundColor(0xFFCCCCCC);
        }
        if (kolor.equals("Trudny"))
        {
            mTrudny.setBackgroundColor(0xFF00DD00);
            mSredni.setBackgroundColor(0xFFCCCCCC);
            mLatwy.setBackgroundColor(0xFFCCCCCC);
        }

    }
}
