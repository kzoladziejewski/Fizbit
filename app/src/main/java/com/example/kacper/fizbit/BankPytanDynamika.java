package com.example.kacper.fizbit;

import java.util.ArrayList;

/**
 * Created by Kacper on 16.02.2019.
 */

public class BankPytanDynamika {

    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytanDynamika(String level) {

        if (level.equals("Latwy")) {
        }
        if (level.equals("Sredni")) {
        }
        if (level.equals("Trudny")) {
        }

    }

    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
