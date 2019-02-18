package com.example.kacper.fizbit;

import android.graphics.Color;

/**
 * Created by Kacper on 14.01.2019.
 */

public class Punkty {
    int colors;

    public Punkty(int color) {
        this.colors = color;
    }

    public void changeColor(int kolo) {

        colors = kolo;
    }

    public int getColors() {
        return colors;
    }
}
