package com.example.kacper.fizbit;

import android.support.v4.content.res.TypedArrayUtils;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Kacper on 10.01.2019.
 */

public class BankPytan {
    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytan(String kategoria, String temat, String level) {
        if (kategoria.equals("Fizyka") && (temat.equals("Elektrycznosc"))) {
            BankPytanElektryka bankPytanElektryka = new BankPytanElektryka(level);
            pytania = bankPytanElektryka.getPytania();
        }

        if (kategoria.equals("Fizyka") && (temat.equals("Dynamika"))) {
            BankPytanDynamika bankPytanDynamika = new BankPytanDynamika(level);
            pytania = bankPytanDynamika.getPytania();
        }

        if (kategoria.equals("Fizyka") && (temat.equals("Mechanika"))) {
            BankPytanMechanika bankPytanMechanika = new BankPytanMechanika(level);
            pytania = bankPytanMechanika.getPytania();
        }

        if (kategoria.equals("Fizyka") && (temat.equals("Optyka"))) {
            BankPytanOptyka bankPytanOptyka = new BankPytanOptyka(level);
            pytania = bankPytanOptyka.getPytania();

        }
        if (kategoria.equals("Fizyka") && (temat.equals("Fizyka jądrowa"))) {
            BankPytanFizykaJadrowa bankPytanFizykaJadrowa = new BankPytanFizykaJadrowa(level);
            pytania = bankPytanFizykaJadrowa.getPytania();
        }

        if (kategoria.equals("Astronomia") && (temat.equals("Planety"))) {
            BankPytanPlanety bankPytanPlanety = new BankPytanPlanety(level);
            pytania = bankPytanPlanety.getPytania();
        }

        if (kategoria.equals("Astronomia") && (temat.equals("Całość"))) {
            BankPytanPlanety bankPytanPlanety = new BankPytanPlanety(level);
            pytania.addAll(bankPytanPlanety.getPytania());

        }
        if (kategoria.equals("Astronomia") && (temat.equals("Słońce"))) {

        }
        if (kategoria.equals("Fizyka") && (temat.equals("Całość"))) {
            BankPytanOptyka bankPytanOptyka = new BankPytanOptyka(level);
            BankPytanElektryka bankPytanElektryka = new BankPytanElektryka(level);
            BankPytanFizykaJadrowa bankPytanFizykaJadrowa = new BankPytanFizykaJadrowa(level);
            BankPytanDynamika bankPytanDynamika = new BankPytanDynamika(level);
            BankPytanMechanika bankPytanMechanika = new BankPytanMechanika(level);
            pytania.addAll(bankPytanElektryka.getPytania());
            pytania.addAll(bankPytanFizykaJadrowa.getPytania());
            pytania.addAll(bankPytanOptyka.getPytania());
            pytania.addAll(bankPytanDynamika.getPytania());
            pytania.addAll(bankPytanMechanika.getPytania());
        }
    }

    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
