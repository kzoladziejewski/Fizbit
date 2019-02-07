package com.example.kacper.fizbit;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        String kolorek = sharedPreferences.getString("level","Latwy");
        koloruj(kolorek);
        mLatwy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Wybrano latwy poziom",Toast.LENGTH_SHORT);
                toast.show();
                zapis("Latwy");
            }
        });

        mSredni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Wybrano średni poziom",Toast.LENGTH_SHORT);
                toast.show();
                zapis("Sredni");

            }
        });

        mTrudny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

    }

    @Override
    protected void onDestroy()
    {

        super.onDestroy();

    }

    public void zapis(String poziom)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("level",poziom);

        koloruj(poziom);
        editor.commit();

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
