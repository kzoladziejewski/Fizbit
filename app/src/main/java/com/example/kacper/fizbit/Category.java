package com.example.kacper.fizbit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {
    Button mFizyka, mAstronomia, mPowrot;
    Intent subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    subject = new Intent(this,Subject.class);
    mFizyka = (Button) findViewById(R.id.mFizyka);
    mAstronomia = (Button) findViewById(R.id.mAstronomia);
    mPowrot = (Button) findViewById(R.id.mPowrot);

    mFizyka.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            subject.putExtra("kategoria","fizyka");
            startActivityForResult(subject,1);
        }
    });

    mAstronomia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            subject.putExtra("kategoria","astronomia");
            startActivityForResult(subject,1);
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
