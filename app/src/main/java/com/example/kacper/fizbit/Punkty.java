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

    public void changeColor(int kolor) {
        colors = kolor;
    }

    public int getColors() {
        return colors;
    }
}
