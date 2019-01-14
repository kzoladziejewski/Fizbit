package com.example.kacper.fizbit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kacper on 10.01.2019.
 */

public class BankPytan {
    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytan(String kategoria, String temat, String level) {
        String dzial, dziedzina, poziom;

//        CALOSC

//ELEKTRYKA

        //LATWA
        if (kategoria.equals("Fizyka") && temat.equals("Elektrycznosc")) {
//            dzial = "Fizyka";
//            dziedzina = "Elektrycznosc";
            if (level.equals("Latwy")) {
                poziom = "Latwy";
                pytania.add(new Questions("Co przedstawia ponizszy wzor", "Prawo ohma", "Prawo Keplera", "Prawo Pitagorasa", "1 zasade dynamiki", true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions("Czym jest U w poniższym wzorze", "Napięciem", "Natężeniem", "Iloczynem napięcia i natężenia", "Rezystancją",  true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions("Czym jest I w poniższym wzorze", "Natężeniem", "Napięciem", "Iloczynem napięcia i natężenia", "Rezystancją",  true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions("Czym jest R w poniższym wzorze", "Oporem", "Napięciem", "Iloczynem napięcia i natężenia", "Napiecia", true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions( "Jaka jednostka będzie na wyjściu podanego wzoru (jednostka U)", "Metr", "Sekunda", "Wolt", "Amper", true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions("Podany poniżej schemat obrazuje:", "Prawo ohma", "Prawo Keplera", "Prawo Pitagorasa", "1 zasade dynamiki", true, R.drawable.prawoohma));
                pytania.add(new Questions( "Ile jest praw Kirchoffa?", "2", "1", "3", "0",  false, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions( "Co poruszane jest w celu 'przepływu prądu'", "Elektrony", "Protony", "Neutrony", "Fotony",  false, 0));
                pytania.add(new Questions("Co mierzone jest w amperach?", "Natężęnie", "Napięcie", "Opór", "Moc",  false, 0));
                pytania.add(new Questions( "Co przedstawia poniższy wzór", "Wzór na moc", "Wzór na napięcie", "Wzór na natężenie", "Wzór na opór", true, R.drawable.moc));
                pytania.add(new Questions( "W jakiej jednostce jest P w poniższym wzorze", "W Watach", "W woltach", "W amperach", "W ohmach",  true, R.drawable.moc));
                pytania.add(new Questions( "Jakim typem elektroczności jest piorun?", "Naturalnym", "Mechanicznym", "Optycznym", "Żadnym w powyższych",  false, 0));
                pytania.add(new Questions( "Ile wynosi standardowe napięcie w polskim gniazdku elektrycznym?", "230V", "12V", "23 000V", "Około miliona voltów",  false, 0));
                pytania.add(new Questions( "Jaki prąd jest jednokierunkowy, którego natęzenie nie ulega zmianie w czasie?", "Stały", "Zmienny", "Trójfazowy", "Przemienny",  false, 0));
                pytania.add(new Questions( "Jaki prąd zmienia zwrot i natężenie w funkcji czasu", "Zmienny", "Stały", "Trójfazowy", "Przemienny",  false, 0));
                pytania.add(new Questions( "Jak nazywamy obszar w którym działają siły elektryczne?", "Polem elektrycznym", "Dworem elektrycznym", "Elektrownią", "Miejscem prądu",  false, 0));
                pytania.add(new Questions( "Pole elektrostatyczne występuje gdy...", "...ładunki nie poruszają się", "...ładunki są dynamiczne", "...jest prąd", "...wszystkie ładunku są takie same",  false, 0));
                pytania.add(new Questions( "Uporządkowany ruch elektronów to inaczej?", "Prąd elektryczny", "Napięcie", "Natęzenie", "Prąd dynamiczny",  false, 0));
                pytania.add(new Questions( "Jak nazywają się materiały dobrze przwodzące prąd?", "Przewodnik", "Izolator", "Nielubiany kolega", "Półprzewodnik",  false, 0));
            }

            //SREDNIA

            //TRUDNA
            if (level.equals("Trudny")) {
//                poziom="Trudny";
                pytania.add(new Questions("Kim jest osoba na obrazku?","William Gilbert","Heinrich Herz","Isaac Newton","Rober Boyle",true,R.drawable.williamgillber));
            }
            }
//        DYNAMIKA

//        OPTYKA

//        FIZYKA JĄDROWA

//        MECHANIKA

//        ASTRO CALOSC

//        PLANETY

//        HELIOCENTRYZM
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
