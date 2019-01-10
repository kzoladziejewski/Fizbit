package com.example.kacper.fizbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class Question extends AppCompatActivity {
    TextView pytanie;
    ProgressBar timer;
    Button mA,mB,mC,mD, dobry;
    RecyclerView punkty;
    int indeks_pytania = 0;
    ArrayList<Questions> pyty = new ArrayList<Questions>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        BankPytan bankPytan = new BankPytan();
        pytanie = (TextView) findViewById(R.id.mPytanie);
        timer = (ProgressBar) findViewById(R.id.mTimer);
        mA = (Button) findViewById(R.id.mAanswer);
        mB = (Button) findViewById(R.id.mBanswer);
        mC = (Button) findViewById(R.id.mCanswer);
        mD = (Button) findViewById(R.id.mDanswer);
        punkty  = (RecyclerView) findViewById(R.id.mRecycle);

        mA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mA.setBackgroundColor(0xFFFF0000);
                String answer = String.valueOf(mA.getText());
                Log.e("ODP",answer);
                checkAnswer(answer);
            }
        });

        mB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mB.setBackgroundColor(0xFFFF0000);
                String answer = String.valueOf(mA.getText());
                Log.e("ODP",answer);
                checkAnswer(answer);
            }
        });
        mC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mC.setBackgroundColor(0xFFFF0000);
                String answer = String.valueOf(mA.getText());
                Log.e("ODP",answer);
                checkAnswer(answer);
            }
        });
        mD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mD.setBackgroundColor(0xFFFF0000);
                String answer = String.valueOf(mA.getText());
                Log.e("ODP",answer);
                checkAnswer(answer);
            }
        });




        Log.e("Question",getIntent().getStringExtra("temat"));
        String dziedzina = getIntent().getStringExtra("temat");
        int i = 0;
        while (i!=10)
        {
Random r = new Random();
int random = r.nextInt(bankPytan.getSize());

        if (!pyty.contains(bankPytan.getPytania().get(random))) {
            Log.e("HA",bankPytan.getPytania().get(random).getDziedzina());
            Log.e("HAHA",dziedzina);

            if (bankPytan.getPytania().get(random).getDziedzina().equals(dziedzina)) {
                pyty.add(bankPytan.getPytania().get(random));
                Log.e("Pytanie:", bankPytan.getPytania().get(random).getPytanie());
                i++;
            }
        }
        }
NextQuest();
        }

        public void NextQuest()
        {
            pytanie.setText(pyty.get(indeks_pytania).getPytanie());
            pytanie.setGravity(Gravity.CENTER);
            pytanie.setTextSize(40);
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

while (guziki.size()!=0)
{
    Random r = new Random();
    int a = r.nextInt(guziki.size());
    int b = r.nextInt(odpowiedzi.size());

    guziki.get(a).setText(odpowiedzi.get(odpowiedzi.size()-1));
    if (odpowiedzi.size() ==4 )
    {
        Log.e("dupa","a?");
        dobry = guziki.get(a);
    }
    guziki.remove(a);
    odpowiedzi.remove(odpowiedzi.size()-1);
}
        }

        public void checkAnswer(String answer)
        {
            String pol = (String) dobry.getText();
            Log.e("DUPA",String.valueOf(dobry.getText()));
            if(pol.equals(answer));
            {
                Log.e("ODP_1", String.valueOf(dobry.getText()));
                Log.e("ODP_2",answer);
                dobry.setBackgroundColor(0xFF00FF00);
            }
            indeks_pytania++;

            reset();
            NextQuest();
        }

        public void reset()
        {
            mA.setBackgroundColor(0xFFFFFFFF);
            mB.setBackgroundColor(0xFFFFFFFF);
            mC.setBackgroundColor(0xFFFFFFFF);
            mD.setBackgroundColor(0xFFFFFFFF);
        }
    }

