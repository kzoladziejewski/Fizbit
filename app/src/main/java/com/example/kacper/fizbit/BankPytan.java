package com.example.kacper.fizbit;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kacper on 10.01.2019.
 */

public class BankPytan {
    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytan(String kategoria, String temat, String level) {
        String dzial, dziedzina, poziom;
        Log.e("temat",temat);
        Log.e("temat",kategoria);
        Log.e("temat",level);
//        CALOSC
//ELEKTRYKA
        //LATWA

        if (kategoria.equals("Fizyka") && (temat.equals("Elektrycznosc") || temat.equals("Całość") )) {
            if (level.equals("Latwy")) {
                pytania.add(new Questions("Co przedstawia ponizszy wzor", "Prawo ohma", "Prawo Keplera", "Prawo Pitagorasa", "1 zasade dynamiki", true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions("Czym jest U w poniższym wzorze", "Napięciem", "Natężeniem", "Iloczynem napięcia i natężenia", "Rezystancją",  true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions("Czym jest I w poniższym wzorze", "Natężeniem", "Napięciem", "Iloczynem napięcia i natężenia", "Rezystancją",  true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions("Czym jest R w poniższym wzorze", "Oporem", "Napięciem", "Iloczynem napięcia i natężenia", "Napiecia", true, R.drawable.prawoohmapodstawa));
                pytania.add(new Questions( "Jaka jednostka będzie na wyjściu podanego wzoru (jednostka U)", "Wolt", "Sekunda", "Metr", "Amper", true, R.drawable.prawoohmapodstawa));
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
            if (level.equals("Sredni")) {
            }
            //TRUDNA
            if (level.equals("Trudny")) {
//                poziom="Trudny";
                pytania.add(new Questions("Kim jest osoba na obrazku?","William Gilbert","Heinrich Herz","Isaac Newton","Rober Boyle",true,R.drawable.williamgillber));
            }
            }


//        DYNAMIKA

//        OPTYKA
        if (kategoria.equals("Fizyka") && (temat.equals("Optyka") || temat.equals("Całość")) ) {
            //LATWY
            if (level.equals("Latwy")) {
                pytania.add(new Questions("Światło widzialne to:","Fala elektromagnetyczna","Fala magnetyczna","Fala elektryczna","Fala dzwiękowa",false,0));
                pytania.add(new Questions("Pola elektryczne i magnetyczne są do siebie","Prostopadłe","Równoległe","Symetryczne","Pod kątem 45 stopni",false,0));
                pytania.add(new Questions("Prędkość światła w próżni wynosi","299 792 km/s","300 000 km/h","300 000 m/s","299 792 m/s",false,0));
                pytania.add(new Questions("Jak nazywają się cząsteczki tworzące światło?","Fotony","Elektrony","Protony","Atomy", false,0));
                pytania.add(new Questions("Światło może posiadać natury w ilości:","Dwóch","Jednej","Trzech","W zależności od eksperymentu", false,0));
                pytania.add(new Questions("Co znaczy że światło ma dwuistą naturę?","Może być albo falą albo cząsteczkami","Jest albo nie ma go","Jest kobietą albo facetem","Światło ma jedną naturę", false,0));
                pytania.add(new Questions("Umowna linia wzdłuż której rozchodzi się światło to","Promień świetlny","Latarka","Laser","", false,0));
                pytania.add(new Questions("Czoło fali to powierzhcnia przechodząca przez punkty w których fala ma fazę i amplitudę","Taką samą","Różną","Mniejszą od zera","Równą zeru", false,0));
                pytania.add(new Questions("Na jakiej powierzchni następuje odbicie zwierciadlane","Gładkiej","Chropowatej","Krzywej","Uszkodzonej", false,0));
                pytania.add(new Questions("Odbite promienie są do siebie:","Równoległe","Prostopadłe","Nie występują","Zależy od sytuacji", false,0));
                pytania.add(new Questions("Kąt padania i odbicia promieni mierzy się względem","Normalnej do powierzchni","Równoległej do powierzchni","Nie można zmierzyć tych kątów","Zależy od sytuacji", false,0));
                pytania.add(new Questions("Na jakiej powierzchni następuje odbicie rozproszone?","Szorskiej","Gładkiej","Krzywej","Nie istnieje takie odbicie", false,0));
                pytania.add(new Questions("W przypadku odbicia rozproszonego odbite promienie świetle","Poruszają się w różnych kierunkach","Poruszają się w tym samym kierunku","Tracą prędkość","Nie istnieje takie odbicie", false,0));
                pytania.add(new Questions("Linia prostopadła do powierzchni umieszczona w punkcie w którym promień pada na powierzchnie to","Normalna","Krzywa","Falista","Nie ma takiego punktu", false,0));
                pytania.add(new Questions("Normalna do powierzchni tworzą z nią kąt:","90 stopni","180 stopni","45 stopni","60 stopni", false,0));
                pytania.add(new Questions("Kąt padania równa się","kątowi odbicia","kątowi podzielonemu przez normalną","45 stopniom","60 stopniom", false,0));
                pytania.add(new Questions("Powietrze jest przeroczystym ośrodkiem przez które biegnie światło tak jak:","Czysta woda","Węgiel","Drzewo","Zanieczyszona woda", false,0));
                pytania.add(new Questions("Światło biegnące przez dwa ośrodki zaginane jest na ich granicy. Nazywa się to:","Załamaniem światła","Interferencją światła","Odbiciem światła","Światłem", false,0));
                pytania.add(new Questions("Droga światła w danym ośrodku jest","Odwracalna","Nie możliwa do odtworzenia","Kończy się po stracie energii","Niezniszczalna", false,0));
                pytania.add(new Questions("Dlaczego światło załamuje się?","Z powodu różnic prędkości","Ma depresje","Napotyka opór np powietrze","Światło nie może się załamać", false,0));
                pytania.add(new Questions("Poniższy wzór przedstawia:","Współczynnik załamania się światła","Liczba naturalną","Wzór na ilość światła","Obliczenie prędkości światła w ośrodku", true,R.drawable.wspolczynnikzalamania));
                pytania.add(new Questions("Ile wynosi współczynnik załamania się światła w próżni?","1","2","3","4", false,0));
                pytania.add(new Questions("Ile wynosi współczynnik załamania się światła w innych ośrodkach?","Więcej niż 1","1","Mniej niż 1","Światło nie łamie się",false, 0));
                pytania.add(new Questions("W jakich jednostkach przedstawiony jest współczynnik załamania się światła?","Jest bezwymiarowy","W Voltach", "W dżulach","W m/s",false,0));
                pytania.add(new Questions("Kąt krytyczny to taki kąt padania dla którego kąt odbicia wynosi","90 stopni","30 stopni","45 stopni","0 stopni",false,0));
                pytania.add(new Questions("Gdy światło biegnie z jednego ośrodka do drugiego to jego częstosć","nie ulega zmianie","ulega zmianie","potęguje","zeruje się",false,0));
                pytania.add(new Questions("Gdy światło biegnie z jednego ośrodka do drugiego to jego prędkość","zmienia się","światło nie ma prędkości","jest taka sama","nie ulega zmianie",false,0));
                pytania.add(new Questions("Ile czasu (około) potrzeba by światło emitowane przez słońce dotarło na Ziemie?","8 minut","1 nanosekundę","Cały dzień","Godzinę",false,0));
                pytania.add(new Questions("Jak nazywa się proces gdy elektrony na które pada światło mogą pochłaniać i ponownie emitować część światła?","Rozpraszanie","Skupianie","Interferencja","Nie ma takiego procesu",false,0));
                pytania.add(new Questions("Jak nazywa się nakładanie się na siebie fal światła?","Interfencja","Dyfrakcja","Zasada Younga","Polaryzacja",false,0));

            }
            //SREDNIA
            if (level.equals("Sredni"))
            {
                pytania.add(new Questions("Prędkość światła jest wykorzystywana do definicja","Metra","Sekundy","Lumenów","Masy", false,0));
                pytania.add(new Questions("Podany poniżej wzór przedstawia zależność","Częstotliwościa i długością fal elektromagnetycznych","Prędkością światła i masy","Masy i czasu","Częstotliwością fal elektromagnetycznych i masą", true,R.drawable.czestotliwoscidlugoscifalzaleznosc));
                pytania.add(new Questions("W polach elektrycznych i magnetycznych fali przechowywana jest","Energia fali","Kolor fali","Ładunek elektryczny","Magnes", false,0));
                pytania.add(new Questions("Czego jednostkami sa poniższe wartości?","Natężenia fali","Napięcia fali","Koloru fali","Częstotliwości fali",true,R.drawable.jednstkanatezeniafali));
                pytania.add(new Questions("Natężenie promieniowania słonecznego na powierzchni Ziemi wynosi","1000 W/m^2","2000 W/m^2","3000W/m^2","100W/m^2", false,0));
                pytania.add(new Questions("Co przenoszą fale elektromagnetyczne","Pęd","Wysokość","Prąd","Wszystko z powyższych", false,0));
                pytania.add(new Questions("Jakiemu ciśnieniu promieniowania odpowiada poniższy wzór","Minimalnemu","Maksymalnemu","Najczęstszemu","Średniemu", true,R.drawable.minimalnecisnieniepromieniowania));
                pytania.add(new Questions("Jakiemu ciśnieniu promieniowania odpowiada poniższy wzór","Maksymalnemu","Minimalnemu","Najczęstszemu","Średniemu", true,R.drawable.maksymalnecisnieniepromieniowania));
                pytania.add(new Questions("Pierwsza teoria czym jest światło sugerowała że:","Światło to cząsteczki","Światło to fale","Światło to fale cząsteczek","Światło to cząsteczki fali",false,0));
                pytania.add(new Questions("Kto pierwszy wykorzystał model cząsteczkowy do wyjaśnienia zjawisk odbicia i załamania światła?","Newton","Maxwell","Young","Huyghens", false,0));
                pytania.add(new Questions("Kto pierwszy pokazał interfencje światła?","Young","Maxwell","Newton","Einstein", false,0));
                pytania.add(new Questions("Kto jako pierwszy założył że światło to fala?","Huyghens","Maxwell","Newton","Einstein", false,0));
                pytania.add(new Questions("Kto uznał że promienie elektromagnetyczne jest skwantowane?","Planck","Einstein","Maxwell","Huyghens", false,0));
                pytania.add(new Questions("Jak nazywa się poniższa stała?","Stała Plancka","Stała Bohra","Stała Enisteina","Stała Newtona", true,R.drawable.stalaplancka));
                pytania.add(new Questions("Czym jest h w poniższym wzorze na energię fotonu?","Stala Plancka","Wysokością","Głębokością","Częstotliwością", true,R.drawable.energiafotonu));
                pytania.add(new Questions("Czym jest f w poniższym wzorze na energię fotonu?","Częstotliwością","Wysokością","Głębokością","Stala Plancka", true,R.drawable.energiafotonu));
                pytania.add(new Questions("Odległość pomiędzy przedmiotem a zwierciadłem/soczewką to?","Odległość przedmiotu","Odległość obrazu","Różnica w prędkości świateł w obu miejscach","Nie istnieje",false,0));
                pytania.add(new Questions("Odległość pomiędzy obrazem a zwierciadłem/soczewką to","Odległość obrazu","Odległość przedmiotu","Nie istnieje żadna odległość","Logarytm odległości przedmiotu a soczewki",false,0));
                pytania.add(new Questions("Jak nazywa się obraz przez którego punkty przechodzą promienie świetlne?","Rzeczywisty","Pozorny","Fikcyjny","Modernistyczny",false,0));
                pytania.add(new Questions("Jakie zwierciadło ma kształt wycinka sfery?","Kuliste","Wklęsłe","Wypukłe","Żadne",false,0));
                pytania.add(new Questions("Jakie zwierciadło ma odbijającą powierzchnie po wklęsłej stronie powierzchni?","Wklęsłe","Kuliste","Wypukłe","Żadne",false,0));
                pytania.add(new Questions("Jakie zwierciadło ma odbijającą powierzchnie po wypukłej stronie powierzchni?","Wypukłe","Kuliste","Wklęsłe","Żadne",false,0));
                pytania.add(new Questions("Jak nazywa się obraz przez którego punkty nie przechodzą promienie świetlne?","Pozorny","Rzeczywisty","Fikcyjny","Modernistyczny",false,0));

            }
            //TRUDNY
        }
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
