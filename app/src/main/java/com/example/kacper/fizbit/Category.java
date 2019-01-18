package com.example.kacper.fizbit;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Category extends AppCompatActivity {
    Button mFizyka, mAstronomia, mPowrot;
    Intent subject;
    ImageView mLogo;
    TextView mPodkategoria;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    subject = new Intent(this,Subject.class);
    mFizyka = (Button) findViewById(R.id.mFizyka);
    mAstronomia = (Button) findViewById(R.id.mAstronomia);
    mPowrot = (Button) findViewById(R.id.mPowrot);
    mPodkategoria = (TextView) findViewById(R.id.mKategoria);
    mPodkategoria.setGravity(Gravity.CENTER | Gravity.BOTTOM);
    mPodkategoria.setTextSize(30);

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
