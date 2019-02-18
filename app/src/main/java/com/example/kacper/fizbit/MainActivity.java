package com.example.kacper.fizbit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mGraj, mUstawienia, mWyjscie;
    Intent gra, ustawienia;
    SharedPreferences sharedPreferences;
    boolean dzwieki;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGraj = (Button) findViewById(R.id.mGraj);
        mUstawienia = (Button) findViewById(R.id.mUstawienia);
        mWyjscie = (Button) findViewById(R.id.mWyjscie);
        this.gra = new Intent(this, Category.class);
        this.ustawienia = new Intent(this, Settings.class);
        sharedPreferences = getSharedPreferences("fizbit", Context.MODE_PRIVATE);
        dzwieki = sharedPreferences.getBoolean("sound", false);
        Log.e("DZWIEKI MAINA", String.valueOf(dzwieki));
        mp = MediaPlayer.create(this, R.raw.klik);
        final MediaPlayer ustawienia_s = MediaPlayer.create(this, R.raw.klik);
        mGraj.setBackgroundResource(R.drawable.guzik_graj);
        mUstawienia.setBackgroundResource(R.drawable.guzik_ustawienia);
        mWyjscie.setBackgroundResource(R.drawable.guzik_wyjscie);
        mGraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dzwieki) {
                    mp.start();
                }
                startActivityForResult(gra, 1);
            }
        });

        mUstawienia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dzwieki) {
                    Log.e("DZWIEKOWIEC", String.valueOf(dzwieki));
                    ustawienia_s.start();
                }
                startActivityForResult(ustawienia, 1);
            }
        });

        mWyjscie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        dzwieki = sharedPreferences.getBoolean("sound", false);
        Log.e("DZWIEKI MAINA", String.valueOf(dzwieki));

    }
}
