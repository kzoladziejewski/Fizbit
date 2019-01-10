package com.example.kacper.fizbit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mGraj, mUstawienia, mWyjscie;
    Intent gra, ustawienia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGraj = (Button) findViewById(R.id.mGraj);
        mUstawienia = (Button) findViewById(R.id.mUstawienia);
        mWyjscie  = (Button) findViewById(R.id.mWyjscie);
        this.gra = new Intent(this, Category.class);
        this.ustawienia = new Intent(this, Settings.class);

        mGraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(gra, 1);
            }
        });

        mUstawienia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(ustawienia,1);
            }
        });
    }
}
