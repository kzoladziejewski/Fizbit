package com.example.kacper.fizbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class Settings extends AppCompatActivity {
    TextView mUstawiania, mPoziomTrudnosci;
    Switch mDzwieki;
    Button mLatwy, mSredni, mTrudny, mPowrot;
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

    }
}
