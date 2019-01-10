package com.example.kacper.fizbit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kacper on 10.01.2019.
 */

public class BankPytan {
    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytan()
    {
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic1?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic2?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic3?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic4?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic5?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic6?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic7?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic8?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic9?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic10?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic11?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic12?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic13?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
        pytania.add(new Questions("Fizyka", "Całość", "Czy fizyka da sie lubic14?", "Tak", "Nie", "Moze", "Na pewno nie", "Latwe", false));
    }

    public ArrayList<Questions> getPytania()
    {
        return pytania;
    }
    public int getSize()
    {
        return pytania.size();
    }
}
