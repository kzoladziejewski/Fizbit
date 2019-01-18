package com.example.kacper.fizbit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class Question extends AppCompatActivity {
    TextView pytanie;
    CountDownTimer mDownTimer, mDownTimer_2;
    SharedPreferences sharedPreferences;
    ImageView mObrazek;
    ProgressBar timer;
    BankPytan bankPytan;
    Button mA,mB,mC,mD, dobry;
    RecyclerView punkty;
    int indeks_pytania=0;
    int i=0;
    int wynik = 0;
    ArrayList<Questions> pyty = new ArrayList<Questions>();
    ArrayList<Punkty> punkties = new ArrayList<Punkty>();
    RecyclerView punkciki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        pyty = new ArrayList<Questions>();
        punkties = new ArrayList<Punkty>();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_question);

        for (int i = 0; i < 10; i++)
        {
punkties.add(new Punkty(Color.GRAY));
        }

        punkciki = (RecyclerView) findViewById(R.id.mRecycle);
        punkciki.setHasFixedSize(true);
        punkciki.setLayoutManager(new GridLayoutManager(this,5));
        punkciki.setItemAnimator(new DefaultItemAnimator());

        sharedPreferences = getSharedPreferences("fizbit", Context.MODE_PRIVATE);
        String kategoria = sharedPreferences.getString("kategoria","Fizyka");
        String dziedzina = sharedPreferences.getString("dziedzina","None");
        String level = sharedPreferences.getString("level","Latwy");
      sharedPreferences.edit().putString("dziedzina",dziedzina);
//        sharedPreferences.edit().putInt("score",0);
        sharedPreferences.edit().apply();

        bankPytan = new BankPytan(kategoria,dziedzina,level);

        pytanie = (TextView) findViewById(R.id.mPytanie);

        mObrazek = (ImageView) findViewById(R.id.mObraz);
        mObrazek.setVisibility(View.INVISIBLE);
        mObrazek.setImageResource(0);

        timer = (ProgressBar) findViewById(R.id.mTimer);
        timer.setProgress(0);
        timer_1();
        timer_2();

        mA = (Button) findViewById(R.id.mAanswer);
        mB = (Button) findViewById(R.id.mBanswer);
        mC = (Button) findViewById(R.id.mCanswer);
        mD = (Button) findViewById(R.id.mDanswer);

        mA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mA.setBackgroundColor(Color.RED);
                String answer = String.valueOf(mA.getText());
                checkAnswer(answer, mA);
            }
        });

        mB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mB.setBackgroundColor(Color.RED);
                String answer = String.valueOf(mB.getText());
                checkAnswer(answer, mB);
            }
        });
        mC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mC.setBackgroundColor(Color.RED);
                String answer = String.valueOf(mC.getText());
                checkAnswer(answer,mC);
            }
        });
        mD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mD.setBackgroundColor(Color.RED);
                String answer = String.valueOf(mD.getText());
                checkAnswer(answer,mD);
            }
        });


        int a = 0;
        while (a!=10)
        {
Random r = new Random();
int random = r.nextInt(bankPytan.getSize());

        if (!pyty.contains(bankPytan.getPytania().get(random))) {
            pyty.add(bankPytan.getPytania().get(random));
                a++;
            }
        }

NextQuest();
        }

    public void NextQuest() {
        mObrazek.setVisibility(View.INVISIBLE);
        mObrazek.setBackgroundResource(0);
        mDownTimer.cancel();

        if (indeks_pytania < 10){
            timer_1();
            if (pyty.get(indeks_pytania).getImg())
            {
                mObrazek.setVisibility(View.VISIBLE);
                mObrazek.setBackgroundResource(pyty.get(indeks_pytania).getSciezka());
            }
            else
            {
                pytanie.setHeight(pytanie.getHeight()+mObrazek.getMaxHeight());
            }
            pytanie.setText(pyty.get(indeks_pytania).getPytanie());
            pytanie.setGravity(Gravity.CENTER | Gravity.BOTTOM);

            ArrayList<Button> guziki = new ArrayList<>();

            guziki.add(mA);
            guziki.add(mB);
            guziki.add(mC);
            guziki.add(mD);

            ArrayList<String> odpowiedzi = new ArrayList<>();

            odpowiedzi.add(pyty.get(indeks_pytania).getBledna_1());
            odpowiedzi.add(pyty.get(indeks_pytania).getBledna_2());
            odpowiedzi.add(pyty.get(indeks_pytania).getBledna_3());
            odpowiedzi.add(pyty.get(indeks_pytania).getPoprawna());

            while (guziki.size() != 0) {
                Random r = new Random();
                int a = r.nextInt(guziki.size());
                guziki.get(a).setText(odpowiedzi.get(odpowiedzi.size() - 1));

                if (odpowiedzi.size() == 4) {
                    dobry = guziki.get(a);
                }
                guziki.remove(a);
                odpowiedzi.remove(odpowiedzi.size() - 1);
            }
        }
        else {
                Intent score = new Intent(this, Score.class);
                score.putExtra("score",wynik);
                finish();
                startActivity(score);
            }
        }

        public void checkAnswer(String answer, Button correct)
        {
            mA.setEnabled(false);
            mB.setEnabled(false);
            mC.setEnabled(false);
            mD.setEnabled(false);


            if(answer.equals(pyty.get(indeks_pytania).getPoprawna()))
            {
correct.setBackgroundColor(Color.GREEN);
punkties.get(indeks_pytania).changeColor(Color.GREEN);
                wynik++;
                sharedPreferences.edit().putInt("score",wynik);
                sharedPreferences.edit().apply();
            }
            else
            {
                sharedPreferences.edit().putInt("score",wynik);
                sharedPreferences.edit().apply();
                correct.setBackgroundColor(Color.RED);
                dobry.setBackgroundColor(Color.GREEN);
                punkties.get(indeks_pytania).changeColor(Color.RED);
            }
            points();
            indeks_pytania++;
            mDownTimer_2.start();

        }

        public void reset()
        {
            timer.setProgress(0);
            i = 0;
            mA.setEnabled(true);
            mB.setEnabled(true);
            mC.setEnabled(true);
            mD.setEnabled(true);
            mA.setBackgroundColor(Color.LTGRAY);
            mB.setBackgroundColor(Color.LTGRAY);
            mC.setBackgroundColor(Color.LTGRAY);
            mD.setBackgroundColor(Color.LTGRAY);
            NextQuest();
        }

        public void timer_1()
        {
            mDownTimer = new CountDownTimer(5000,1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    i++;
                    timer.setProgress((int)i*100/(5000/1000));
                }
                @Override
                public void onFinish() {
                    timer.setProgress(100);
                    checkAnswer("zadnaZNich", dobry);
                }
            };
            mDownTimer.start();
        }
        public void timer_2()
        {
            mDownTimer_2 = new CountDownTimer(1000,1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                }
                @Override
                public void onFinish() {
                reset();

                }
            };
            mDownTimer_2.cancel();
        }

        public void points()
        {

            punkciki.setAdapter(new Points(punkties, punkciki));

        }
    }

