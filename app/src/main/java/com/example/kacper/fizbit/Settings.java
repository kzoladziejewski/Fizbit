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
    Button mLatwy, mSredni, mTrudny, mPowrot, mOn, mOff;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Boolean dzwieki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mUstawiania = (TextView) findViewById(R.id.mUstawienia);
//        mPoziomTrudnosci = (TextView) findViewById(R.id.mPoziom);
        mOff = (Button) findViewById(R.id.off);
        mOn = (Button) findViewById(R.id.on);
        mLatwy = (Button) findViewById(R.id.mLatwy);
        mSredni = (Button) findViewById(R.id.mSredni);
        mTrudny = (Button) findViewById(R.id.mTrudny);
        mPowrot = (Button) findViewById(R.id.mPowrot);
        sharedPreferences = getSharedPreferences("fizbit", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.klik);
        dzwieki = sharedPreferences.getBoolean("sound", false);

        String kolorek = sharedPreferences.getString("level", "Latwy");
        koloruj(kolorek);
        if (dzwieki) {
            mOn.setBackgroundResource(R.drawable.guzik_on_wcisniety);
            mOff.setBackgroundResource(R.drawable.guzik_off_niewcisniety);
        }
        if (!dzwieki) {
            mOn.setBackgroundResource(R.drawable.guzik_on_niewcisniety);
            mOff.setBackgroundResource(R.drawable.guzik_off_wcisniety);
        }
        mLatwy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dzwieki) {
                    mp.start();
                }
                Toast toast = Toast.makeText(getApplicationContext(), "Wybrano latwy poziom", Toast.LENGTH_SHORT);
                toast.show();
                zapis("Latwy", 5000);
            }
        });

        mSredni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dzwieki) {
                    mp.start();
                }
                Toast toast = Toast.makeText(getApplicationContext(), "Wybrano średni poziom", Toast.LENGTH_SHORT);
                toast.show();
                zapis("Sredni", 7500);

            }
        });

        mTrudny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dzwieki) {
                    mp.start();
                }
                Toast toast = Toast.makeText(getApplicationContext(), "Wybrano trudny poziom", Toast.LENGTH_SHORT);
                toast.show();
                zapis("Trudny", 10000);

            }
        });

        mPowrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                finish();
            }
        });

        mOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzwieki = true;
                mOff.setBackgroundResource(R.drawable.guzik_off_niewcisniety);
                mOn.setBackgroundResource(R.drawable.guzik_on_wcisniety);
            }
        });

        mOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzwieki = false;
                mOff.setBackgroundResource(R.drawable.guzik_off_wcisniety);
                mOn.setBackgroundResource(R.drawable.guzik_on_niewcisniety);
            }
        });
    }

    @Override
    protected void onDestroy() {
        editor.putBoolean("sound", dzwieki);

        editor.commit();
        super.onDestroy();
    }

    public void zapis(String poziom, int czas) {
        editor.putString("level", poziom);
        editor.putInt("time", czas);

        koloruj(poziom);
    }


    public void koloruj(String kolor) {
        if (kolor.equals("Latwy")) {
            mLatwy.setBackgroundResource(R.drawable.guzik_latwy_wcisniety);
            mSredni.setBackgroundResource(R.drawable.guzik_sredni_nie_wcisniety);
            mTrudny.setBackgroundResource(R.drawable.guzik_trudny_nie_wcisniety);
        }
        if (kolor.equals("Sredni")) {
            mLatwy.setBackgroundResource(R.drawable.guzik_latwy_nie_wcisniety);
            mSredni.setBackgroundResource(R.drawable.guzik_sredni_wcisniety);
            mTrudny.setBackgroundResource(R.drawable.guzik_trudny_nie_wcisniety);
        }
        if (kolor.equals("Trudny")) {
            mLatwy.setBackgroundResource(R.drawable.guzik_latwy_nie_wcisniety);
            mSredni.setBackgroundResource(R.drawable.guzik_sredni_nie_wcisniety);
            mTrudny.setBackgroundResource(R.drawable.guzik_trudny_wcisniety);
        }

    }
}
