package com.example.kacper.fizbit;

/**
 * Created by Kacper on 10.01.2019.
 */

public class Questions {
    String pytanie, poprawna, bledna_1, bledna_2, bledna_3;
    int sciezka;
    boolean img;

    public Questions(

            String pytanie,
            String poprawna,
            String bledna_1,
            String bledna_2,
            String bledna_3,
            boolean img,
            int sciezka) {
//        this.kategoria=kategoria;
//        this.dziedzina=dziedzina;
        this.poprawna = poprawna;
        this.pytanie = pytanie;
        this.bledna_1 = bledna_1;
        this.bledna_2 = bledna_2;
        this.bledna_3 = bledna_3;
//    this.poziom = poziom;
        this.img = img;
        this.sciezka = sciezka;
    }

    public String getPytanie() {
        return pytanie;
    }

    public String getPoprawna() {
        return poprawna;
    }

    public String getBledna_1() {
        return bledna_1;
    }

    public String getBledna_2() {
        return bledna_2;
    }

    public String getBledna_3() {
        return bledna_3;
    }

    //    public String getPoziom()
//    {
//        return poziom;
//    }
    public boolean getImg() {
        return img;
    }
//    public String getKategoria()
//    {
//        return kategoria;
//    }

    //    public String getDziedzina()
//    {
//        return dziedzina;
//    }
    public int getSciezka() {
        return sciezka;
    }

}
