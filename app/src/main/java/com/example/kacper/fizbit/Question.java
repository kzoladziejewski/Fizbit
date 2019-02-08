package com.example.kacper.fizbit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
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
import android.text.Html;
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
    TextView pytanie, mLicznik;
    CountDownTimer mDownTimer, mPokazPoprawna, PoznajPytanieTimer;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    ImageView mObrazek;
    ProgressBar timer;
    BankPytan bankPytan;
    Button mA, mB, mC, mD, dobry;
    RecyclerView punkty;
    int indeks_pytania, i, wynik = 0;
    Boolean checked = false;
    ArrayList<Questions> pyty = new ArrayList<Questions>();
    ArrayList<Punkty> punkties = new ArrayList<Punkty>();
    RecyclerView punkciki;
    Boolean firststart = true;
    int mLicznik_czasu=6;
    MediaPlayer mp;
    boolean dzwieki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mp = MediaPlayer.create(this, R.raw.odpowiedz);

        pyty = new ArrayList<Questions>();
        punkties = new ArrayList<Punkty>();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_question);

        for (int i = 0; i < 10; i++) {
            punkties.add(new Punkty(Color.GRAY));
        }

        punkciki = (RecyclerView) findViewById(R.id.mRecycle);
        punkciki.setHasFixedSize(true);
        punkciki.setLayoutManager(new GridLayoutManager(this, 5));
        punkciki.setItemAnimator(new DefaultItemAnimator());
        points();

        sharedPreferences = getSharedPreferences("fizbit", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        String kategoria = sharedPreferences.getString("kategoria", "Fizyka");
        String dziedzina = sharedPreferences.getString("dziedzina", "None");
        String level = sharedPreferences.getString("level", "Latwy");
        dzwieki = sharedPreferences.getBoolean("sound", false);

        sharedPreferences.edit().putString("dziedzina", dziedzina);

        bankPytan = new BankPytan(kategoria, dziedzina, level);
        int a = 0;
        while (a != 10) {
            Random r = new Random();
            int random = r.nextInt(bankPytan.getSize());

            if (!pyty.contains(bankPytan.getPytania().get(random))) {
                pyty.add(bankPytan.getPytania().get(random));
                a++;
            }
        }

        pytanie = (TextView) findViewById(R.id.mPytanie);

        mObrazek = (ImageView) findViewById(R.id.mObraz);
        mObrazek.setVisibility(View.INVISIBLE);
        mObrazek.setImageResource(0);

        mLicznik = (TextView) findViewById(R.id.mLicznik);
        timer = (ProgressBar) findViewById(R.id.mTimer);
        timer.setProgress(0);

        timer_1();
        PoznajPytanie();
        PokazPoprawna();

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
                checkAnswer(answer, mC);
            }
        });
        mD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mD.setBackgroundColor(Color.RED);
                String answer = String.valueOf(mD.getText());
                checkAnswer(answer, mD);
            }
        });

        NextQuest();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        PoznajPytanieTimer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDownTimer.cancel();
        PoznajPytanieTimer.cancel();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDownTimer.cancel();
        PoznajPytanieTimer.cancel();
        finish();
    }

    public void NextQuest() {
        checked = false;
        if (!firststart)
        {
            mDownTimer.cancel();
    }
        firststart = false;
        mLicznik.setVisibility(View.VISIBLE);
        PoznajPytanieTimer.start();
        hideButton();
        mObrazek.setVisibility(View.INVISIBLE);
        mObrazek.setBackgroundResource(0);
        if (indeks_pytania < 10) {
//            timer_1();
            if (pyty.get(indeks_pytania).getImg()) {
                mObrazek.setVisibility(View.VISIBLE);
                mObrazek.setBackgroundResource(pyty.get(indeks_pytania).getSciezka());
            } else {
                pytanie.setHeight(pytanie.getHeight() + mObrazek.getMaxHeight());

            }
            pytanie.setText(Html.fromHtml(pyty.get(indeks_pytania).getPytanie()));
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
                guziki.get(a).setText(Html.fromHtml(odpowiedzi.get(odpowiedzi.size() - 1)));

                if (odpowiedzi.size() == 4) {
                    dobry = guziki.get(a);
                }
                guziki.remove(a);
                odpowiedzi.remove(odpowiedzi.size() - 1);
            }
        } else {
            editor.putInt("score", wynik);
            editor.apply();
            Intent score = new Intent(this, Score.class);
            mDownTimer.cancel();
            PoznajPytanieTimer.cancel();
            startActivityForResult(score, 1);
        }
    }


    public void blocker() {
        mA.setEnabled(false);
        mB.setEnabled(false);
        mC.setEnabled(false);
        mD.setEnabled(false);
    }

    public void checkAnswer(String answer, Button correct) {
        checked = true;
        mDownTimer.cancel();
        mPokazPoprawna.start();
        blocker();

        if (answer.equals(pyty.get(indeks_pytania).getPoprawna())) {
            correct.setBackgroundColor(Color.GREEN);
            if (dzwieki) {

                mp.start();
            }            punkties.get(indeks_pytania).changeColor(Color.GREEN);
            Log.e("PYTANIE", String.valueOf(wynik));
            wynik++;
            Log.e("PYTANIE W CZYM JEST RZECZ", String.valueOf(wynik));
        } else {
            Log.e("ZLA ODPOWIEDZ KTORA MA PUNKTY", String.valueOf(wynik));

            correct.setBackgroundColor(Color.RED);
            dobry.setBackgroundColor(Color.GREEN);
            punkties.get(indeks_pytania).changeColor(Color.RED);
        }
        points();
        indeks_pytania++;

    }

    public void reset() {
        timer.setProgress(0);
        i = 0;

        mA.setEnabled(true);
        mA.setBackgroundColor(Color.LTGRAY);

        mB.setEnabled(true);
        mB.setBackgroundColor(Color.LTGRAY);

        mC.setEnabled(true);
        mC.setBackgroundColor(Color.LTGRAY);

        mD.setEnabled(true);
        mD.setBackgroundColor(Color.LTGRAY);

        NextQuest();
    }
    public void showButton()
    {
        mA.setVisibility(View.VISIBLE);
        mB.setVisibility(View.VISIBLE);
        mC.setVisibility(View.VISIBLE);
        mD.setVisibility(View.VISIBLE);
    }
    public void hideButton()
    {
        mA.setVisibility(View.INVISIBLE);
        mB.setVisibility(View.INVISIBLE);
        mC.setVisibility(View.INVISIBLE);
        mD.setVisibility(View.INVISIBLE);
    }

    public void timer_1() {
        mDownTimer = new CountDownTimer(5000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {
                i++;
                timer.setProgress((int) i * 100 / (5000 / 100));
            }

            @Override
            public void onFinish() {
                timer.setProgress(100);
                if (!checked) {
                    checkAnswer("zadnaZNich", dobry);
                }

            }
        };
        mDownTimer.cancel();
    }

    public void PoznajPytanie() {
        PoznajPytanieTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mLicznik.setText(String.valueOf(mLicznik_czasu));
                mLicznik.setTextSize(40);
                mLicznik_czasu = mLicznik_czasu-1;
                if (mLicznik_czasu < 0) { mLicznik_czasu=0; }
                Log.e("Licznik cza", String.valueOf(mLicznik_czasu));
            }
            @Override
            public void onFinish() {
                mDownTimer.start();
                showButton();
                mLicznik_czasu = 5;
                mLicznik.setVisibility(View.INVISIBLE);
            }
        };
        PoznajPytanieTimer.cancel();
    }

    public void PokazPoprawna() {
        mPokazPoprawna = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }
            @Override
            public void onFinish() {
                reset();

            }
        };
        PoznajPytanieTimer.cancel();
    }

    public void points() {
        punkciki.setAdapter(new Points(punkties, punkciki));
    }


}

