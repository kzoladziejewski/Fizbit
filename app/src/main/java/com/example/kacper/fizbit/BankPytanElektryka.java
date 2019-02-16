package com.example.kacper.fizbit;

import java.util.ArrayList;

/**
 * Created by Kacper on 16.02.2019.
 */

public class BankPytanElektryka {
    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytanElektryka(String level) {
        if (level.equals("Latwy")) {
            pytania.add(new Questions("Co przedstawia ponizszy wzor", "Prawo ohma", "Prawo Keplera", "Prawo Pitagorasa", "1 zasade dynamiki", true, R.drawable.prawoohmapodstawa));
            pytania.add(new Questions("Czym jest U w poniższym wzorze", "Napięciem", "Natężeniem", "Iloczynem napięcia i natężenia", "Rezystancją", true, R.drawable.prawoohmapodstawa));
            pytania.add(new Questions("Czym jest I w poniższym wzorze", "Natężeniem", "Napięciem", "Iloczynem napięcia i natężenia", "Rezystancją", true, R.drawable.prawoohmapodstawa));
            pytania.add(new Questions("Czym jest R w poniższym wzorze", "Oporem", "Napięciem", "Iloczynem napięcia i natężenia", "Napiecia", true, R.drawable.prawoohmapodstawa));
            pytania.add(new Questions("Jaka jednostka będzie na wyjściu podanego wzoru (jednostka U)", "Wolt", "Sekunda", "Metr", "Amper", true, R.drawable.prawoohmapodstawa));
            pytania.add(new Questions("Podany poniżej schemat obrazuje:", "Prawo ohma", "Prawo Keplera", "Prawo Pitagorasa", "1 zasade dynamiki", true, R.drawable.prawoohma));
            pytania.add(new Questions("Ile jest praw Kirchoffa?", "2", "1", "3", "0", false, R.drawable.prawoohmapodstawa));
            pytania.add(new Questions("Co poruszane jest w celu 'przepływu prądu'", "Elektrony", "Protony", "Neutrony", "Fotony", false, 0));
            pytania.add(new Questions("Co mierzone jest w amperach?", "Natężęnie", "Napięcie", "Opór", "Moc", false, 0));
            pytania.add(new Questions("Co przedstawia poniższy wzór", "Wzór na moc", "Wzór na napięcie", "Wzór na natężenie", "Wzór na opór", true, R.drawable.moc));
            pytania.add(new Questions("W jakiej jednostce jest P w poniższym wzorze", "W Watach", "W woltach", "W amperach", "W ohmach", true, R.drawable.moc));
            pytania.add(new Questions("Jakim typem elektroczności jest piorun?", "Naturalnym", "Mechanicznym", "Optycznym", "Żadnym w powyższych", false, 0));
            pytania.add(new Questions("Ile wynosi standardowe napięcie w polskim gniazdku elektrycznym?", "230V", "12V", "23 000V", "Około miliona voltów", false, 0));
            pytania.add(new Questions("Jaki prąd jest jednokierunkowy, którego natęzenie nie ulega zmianie w czasie?", "Stały", "Zmienny", "Trójfazowy", "Przemienny", false, 0));
            pytania.add(new Questions("Jaki prąd zmienia zwrot i natężenie w funkcji czasu", "Zmienny", "Stały", "Trójfazowy", "Przemienny", false, 0));
            pytania.add(new Questions("Jak nazywamy obszar w którym działają siły elektryczne?", "Polem elektrycznym", "Dworem elektrycznym", "Elektrownią", "Miejscem prądu", false, 0));
            pytania.add(new Questions("Pole elektrostatyczne występuje gdy...", "...ładunki nie poruszają się", "...ładunki są dynamiczne", "...jest prąd", "...wszystkie ładunku są takie same", false, 0));
            pytania.add(new Questions("Uporządkowany ruch elektronów to inaczej?", "Prąd elektryczny", "Napięcie", "Natęzenie", "Prąd dynamiczny", false, 0));
            pytania.add(new Questions("Jak nazywają się materiały dobrze przewodzące prąd?", "Przewodnik", "Izolator", "Nielubiany kolega", "Półprzewodnik", false, 0));
            pytania.add(new Questions("Elektroda dodatnia to", " Anoda", " Katoda", " Moda", " Broda", false, 0));
            pytania.add(new Questions("Co się dzieje z napięciem, kiedy zwiększy się opór", " Zwiększy sie", " Zmniejszy sie", " Zostanie stałe", " Nie można zwiększyć oporu", false, 0));
            pytania.add(new Questions(" Jak oblicza się rezystancję zastępczą rezystorów w połączeniu szeregowym", " R1+R2", " R1-R2", " (R1+R2) *1/3", " 100 * (R1+R2) – 32", false, 0));
            pytania.add(new Questions(" Jak oblicza się rezystancję zastępczą w połączeniu równoległym", " (R1*R2) : (R1+R2)", " R1+R2", " R1-R2", " (R1+R2) *1/3", false, 0));
            pytania.add(new Questions(" Do jakiej grupy należą rezystory", " Elementy bierne", " Elementy czynne", " Elementy pozorne", " Elementy naturalne", false, 0));
            pytania.add(new Questions(" Polaryzacja to", " Nadanie biegunowości", " Obszar o podwyższonej rezystancji", " Opór", " Metoda całkowania", false, 0));
            pytania.add(new Questions(" Elektryzowanie ciał przez indukcję polega na", " Swobodnym poruszaniu się cząsteczek wewnątrz ciała", " Przemieszczenie się elektronów pierwszego ciała na drugie ciała", " Podpalenie dwóch ciał", " Dotknięcie się dwóch ciał", false, 0));
        }
        if (level.equals("Sredni")) {
            pytania.add(new Questions("W którym typie tranzystora do kolektora zapodaje się dodatni biegun źródła napięcia?", " NPN", " PNP", " PPN", " NNP", false, 0));
            pytania.add(new Questions("Kreska w symbolu elektronicznym diody to:", " Katoda", " Anoda", " Moda", " Dioda", false, 0));
            pytania.add(new Questions(" Urządzeniem odpowiedzialnym za zmianę sposobu transmisji równoległej na transmisję szeregową sygnału cyfrowego jest?", " Multiplekser", " Dekoder", " Enkoder", " Demultiplekser", false, 0));
            pytania.add(new Questions(" Co to jest fotorezystor?", " Element, którego rezystancja zależy od światła", " Rodzaj diody", " Kamerka", " Rezystor, który robi zdjęcie", false, 0));
            pytania.add(new Questions(" Czy w parametrach rezystora występuje współczynnik szumów?", " Tak", " Nie", " Zależy od rezystora", " Różnie bywa", false, 0));
            pytania.add(new Questions(" Która z poniższych wielkości nie jest przewodnością elektryczną?", " Reaktancj", " Konduktancj", " Admitancj", " Susceptancj", false, 0));
            pytania.add(new Questions(" Linie siła pola elektrostatycznego są to linie wzdłuż których poruszałby się ładunek dodatni:", " Gdyby miał swobodę ruchu", " Gdyby był wiotki", " Gdyby był lekki", " Gdyby był ciężki", false, 0));
            pytania.add(new Questions(" Napięcie między punktami A i B w polu elektrostatycznym określa:", " Pracę przeniesienia ładunku jednostkowego miedzy tymi punktami", " Pracę podniesienia ładunku jednostkowego", " Słabe pole", " Silne pole", false, 0));
            pytania.add(new Questions(" Zwrot linii sił pola jest taki jak zwrot :", " Siły działającej na ładunek dodatni", " Siły działającej na ładunek ujemny", " Siły działającej na ładunek obojętny", " Żadna odpowiedź nie jest prawidłowa", false, 0));

        }
        if (level.equals("Trudny")) {
            pytania.add(new Questions("Kim jest osoba na obrazku?", "William Gilbert", "Heinrich Herz", "Isaac Newton", "Rober Boyle", true, R.drawable.williamgillber));
            pytania.add(new Questions("Jaki prąd popłynie przez przewodnik w którym znajduje się rezystor o oporności 100ohm przy napięciu 100V?", " 1 A", " 100 A", " 10 A", " 0,1 A", false, 0));
            pytania.add(new Questions("Czy guma przewodzi prąd?", " Nie", " Tak", " Zależy od natężenia prądu", " Zależy od napięcia prądu", false, 0));
            pytania.add(new Questions("Sprawny kondensator elektrolityczny:", " Nie przewodzi prądu", " Przewodzi prąd", " W zależności od ustawień przewodzi prąd lub nie", " Służy do zmiany natężenia prądu", false, 0));
            pytania.add(new Questions("Kiedy transformator podwyższa napięcie?", " kiedy liczba zwojów po stronie uzwojenia pierwotnego jest mniejsza niż po stronie uzwojenia wtórnego", " kiedy liczba zwojów po stronie uzwojenia pierwotnego jest większa niż po stronie uzwojenia wtórnego", " kiedy liczba zwojów po stronie uzwojenia pierwotnego jest taka sama jak po stronie uzwojenia wtórnego", " nigdy", false, 0));
            pytania.add(new Questions("Transformator działa z prądem", " Zmiennym", " Stałym", " Półstałym", " Żadnym", false, 0));
            pytania.add(new Questions(" Jeżeli mikroprocesor taktowany jest zegarem o częstotliwości 2,5 MHz to oznacza że w czasie sekundy jest w stanie wykonać...", " 2 500 000 operacji logicznych", " 5 000 000 operacji logicznych", " 2 500 operacji logicznych", " 25 operacji logicznych", false, 0));
            pytania.add(new Questions(" Stosunek ilości zwojów uzwojenia pierwotnego do ilości zwojów uzwojenia wtórnego w transformatorze nazywa się:", " Przekładnią", " Przełożeniem", " Modułem transformatora", " Transformatą", false, 0));
            pytania.add(new Questions(" Jak nazywa się element półprzewodnikowy wykorzystujący zjawisko przebicia lawinowego?", " Dioda Zenera", " Dioda LED", " Dioda prostowniczą", " Lampa elektronową", false, 0));
            pytania.add(new Questions(" Podstawową parą pierwiastków z których wykonywane są elementy półprzewodnikowe są:", " Krzem (Si) i german (Ge)", " Żelazo (Fe) i srebro (Ag)", " German (Ge) i żelazo (Fe)", " Krzem (Si) i srebro (Ag)", false, 0));
            pytania.add(new Questions(" W praktyce rezystor bardziej stawia opór gdy jest:", " Cienki", " Gruby", " Kolorowy", " Czarny", false, 0));
            pytania.add(new Questions(" Rezystancja liniowego rezystora zależy również od:", " Temperatury", " Światła", " Ciśnienia atmosferycznego", " Hałasu", false, 0));
            pytania.add(new Questions("Która z poniższych wielkości NIE JEST oporem elektrycznym?", " Susceptancja", " Impedancja", " Reaktancja", " Rezystancja", false, 0));
            pytania.add(new Questions("W półprzewodniku typu p nośnikami prądu są:", " Akceptory", " Elektrony", " Donory", " Godnory", false, 0));
            pytania.add(new Questions("Wzór mocy pozornej:", " S=U*J", " U=J*Z", " J=U*G", " Z=G*J", false, 0));

        }

    }

    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
