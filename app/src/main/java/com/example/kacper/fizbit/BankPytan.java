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
        Log.e("BANK PYTAN", temat);
//        CALOSC
//ELEKTRYKA
        //LATWA

        if (kategoria.equals("Fizyka") && (temat.equals("Elektrycznosc") || temat.equals("Całość"))) {
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
                //HANIA
                pytania.add(new Questions("Elektroda dodatnia to", " Anod", " Katod", " Mod", " Brod", false, 0));
                pytania.add(new Questions("Co się dzieje z napięciem, kiedy zwiększy się opór", " Zwiększy si", " Zmniejszy si", " Zostanie stał", " Nie można zwiększyć opor", false, 0));
                pytania.add(new Questions(" Jak oblicza się rezystancję zastępczą rezystorów w połączeniu szeregowym", " R1+R", " R1-R", " (R1+R2) *1/", " 100 * (R1+R2) – 3", false, 0));
                pytania.add(new Questions(" Jak oblicza się rezystancję zastępczą w połączeniu równoległym", " (R1*R2) : (R1+R2", " R1+R", " R1-R", " (R1+R2) *1/", false, 0));
                pytania.add(new Questions(" D jakiej grupy należą rezystory", " Elementy biern", " Elementy czynn", " Elementy pozorn", " Elementy naturaln", false, 0));
                pytania.add(new Questions(" Polaryzacja to", " Nadanie biegunowośc", " Obszar o podwyższonej rezystancj", " Opó", " Metoda całkowani", false, 0));
                pytania.add(new Questions(" Elektryzowanie ciał przez indukcję polega na", " Swobodnym poruszaniu się cząsteczek wewnątrz ciał", " Przemieszczenie się elektronów pierwszego ciała na drugie ciał", " Podpalenie dwóch cia", " Dotknięcie się dwóch cia", false, 0));

            }

            //SREDNIA
            if (level.equals("Sredni")) {
                //hania
                pytania.add(new Questions("W którym typie tranzystora do kolektora zapodaje się dodatni biegun źródła napięcia", " NP", " PN", " PP", " NN", false, 0));
                pytania.add(new Questions("Kreska w symbolu elektronicznym diody to", " Katod", " Anod", " Mod", " Diod", false, 0));
                pytania.add(new Questions(" Urządzeniem odpowiedzialnym za zmianę sposobu transmisji równoległej na transmisję szeregową sygnału cyfrowego jest", " Multiplekse", " Dekode", " Enkode", " Demultiplekse", false, 0));
                pytania.add(new Questions(" Co to jest fotorezystor", " Element, którego rezystancja zależy od światł", " Rodzaj diod", " Kamerk", " Rezystor, który robi zdjęci", false, 0));
                pytania.add(new Questions(" Czy w parametrach rezystora występuje współczynnik szumów", " Ta", " Ni", " Zależy od rezystor", " Różnie byw", false, 0));
                pytania.add(new Questions(" Która z poniższych wielkości nie jest przewodnością elektryczną", " Reaktancj", " Konduktancj", " Admitancj", " Susceptancj", false, 0));
                pytania.add(new Questions(" Linie siła pola elektrostatycznego są to linie wzdłuż których poruszałby się ładunek dodatni", " Gdyby miał swobodę ruch", " Gdyby był wiotk", " Gdyby był lekk", " Gdyby był ciężk", false, 0));
                pytania.add(new Questions(" Napięcie między punktami A i B w polu elektrostatycznym określa", " Pracę przeniesienia ładunku jednostkowego miedzy tymi punktam", " Pracę podniesienia ładunku jednostkoweg", " Słabe pol", " Silne pol", false, 0));
                pytania.add(new Questions(" Zwrot linii sił pola jest taki jak zwrot ", " Siły działającej na ładunek dodatn", " Siły działającej na ładunek ujem", " Siły działającej na ładunek obojętn", " Żadna odpowiedź nie jest prawidłow", false, 0));

            }
            //TRUDNA
            if (level.equals("Trudny")) {
//                poziom="Trudny";
                pytania.add(new Questions("Kim jest osoba na obrazku?", "William Gilbert", "Heinrich Herz", "Isaac Newton", "Rober Boyle", true, R.drawable.williamgillber));
                pytania.add(new Questions("Jaki prąd popłynie przez przewodnik w którym znajduje się rezystor o oporności 100ohm przy napięciu 100V", " 1 ", " 100 ", " 10 ", " 0,1 ", false, 0));
                pytania.add(new Questions("Czy guma przewodzi prąd", " Ni", " Tak", " Zależy od natężenia prąd", " Zależy od napięcia prąd", false, 0));
                pytania.add(new Questions("Sprawny kondensator elektrolityczny", " Nie przewodzi prąd", " Przewodzi prą", " W zależności od ustawień przewodzi prąd lub ni", " Służy do zmiany natężenia prąd", false, 0));
                pytania.add(new Questions("Kiedy transformator podwyższa napięcie", " kiedy liczba zwojów po stronie uzwojenia pierwotnego jest mniejsza niż po stronie uzwojenia wtórneg", " kiedy liczba zwojów po stronie uzwojenia pierwotnego jest większa niż po stronie uzwojenia wtórneg", " kiedy liczba zwojów po stronie uzwojenia pierwotnego jest taka sama jak po stronie uzwojenia wtórneg", " nigd", false, 0));
                pytania.add(new Questions("Transformator działa z prądem", " Zmienny", " Stały", " Półstały", " Żadnym", false, 0));
                pytania.add(new Questions(" Jeżeli mikroprocesor taktowany jest zegarem o częstotliwości 2,5 MHz to oznacza że w czasie sekundy jest w stanie wykonać..", " 2 500 000 operacji logicznyc", " 5 000 000 operacji logicznyc", " 2 500 operacji logicznyc", " 25 operacji logicznyc", false, 0));
                pytania.add(new Questions(" Stosunek ilości zwojów uzwojenia pierwotnego do ilości zwojów uzwojenia wtórnego w transformatorze nazywa się", " Przekładni", " Przełożenie", " Modułem transformator", " Transformat", false, 0));
                pytania.add(new Questions(" Jak nazywa się element półprzewodnikowy wykorzystujący zjawisko przebicia lawinowego", " Dioda Zener", " Dioda LE", " Dioda prostownicz", " Lampa elektronow", false, 0));
                pytania.add(new Questions(" Podstawową parą pierwiastków z których wykonywane są elementy półprzewodnikowe są", " Krzem (Si) i german (Ge", " Żelazo (Fe) i srebro (Ag", " German (Ge) i żelazo (Fe", " Krzem (Si) i srebro (Ag", false, 0));
                pytania.add(new Questions(" W praktyce rezystor bardziej stawia opór gdy jest", " Cienk", " Grub", " Kolorow", " Czarn", false, 0));
                pytania.add(new Questions(" Rezystancja liniowego rezystora zależy również od", " Temperatur", " Światł", " Ciśnienia atmosferyczneg", " Hałas", false, 0));
                pytania.add(new Questions(" Która z poniższych wielkości NIE JEST oporem elektrycznym", " Susceptancj", " Impedancj", " Reaktancj", " Rezystancj", false, 0));
                pytania.add(new Questions(" W półprzewodniku typu p nośnikami prądu są", " Akceptor", " Elektron", " Donor", " Godnor", false, 0));
                pytania.add(new Questions(" Wzór mocy pozornej", " S=U*", " U=J*", " J=U*", " Z=G*", false, 0));

            }
        }


//        DYNAMIKA
        if (kategoria.equals("Fizyka") && (temat.equals("Dynamika") || temat.equals("xaxa"))) {
//            pytania.add(new Questions("AAAAX\u00B2<sup>10</sup>","A","AAAAX\u00B2<sup>10</sup>","","",false,0));

            for (int a = 0; a < 15; a++) {
                pytania.add(new Questions("AAAAX\u00B2<sup>10</sup>", "A", "AAAAX\u00B2<sup>10</sup>", "", "", false, 0));
            }
        }


//        OPTYKA
        if (kategoria.equals("Fizyka") && (temat.equals("Optyka") || temat.equals("Całość"))) {
            //LATWY
            if (level.equals("Latwy")) {
                pytania.add(new Questions("Światło widzialne to:", "Fala elektromagnetyczna", "Fala magnetyczna", "Fala elektryczna", "Fala dzwiękowa", false, 0));
                pytania.add(new Questions("Pola elektryczne i magnetyczne są do siebie", "Prostopadłe", "Równoległe", "Symetryczne", "Pod kątem 45 stopni", false, 0));
                pytania.add(new Questions("Prędkość światła w próżni wynosi", "299 792 km/s", "300 000 km/h", "300 000 m/s", "299 792 m/s", false, 0));
                pytania.add(new Questions("Jak nazywają się cząsteczki tworzące światło?", "Fotony", "Elektrony", "Protony", "Atomy", false, 0));
                pytania.add(new Questions("Światło może posiadać natury w ilości:", "Dwóch", "Jednej", "Trzech", "W zależności od eksperymentu", false, 0));
                pytania.add(new Questions("Co znaczy że światło ma dwuistą naturę?", "Może być albo falą albo cząsteczkami", "Jest albo nie ma go", "Jest kobietą albo facetem", "Światło ma jedną naturę", false, 0));
                pytania.add(new Questions("Umowna linia wzdłuż której rozchodzi się światło to", "Promień świetlny", "Latarka", "Laser", "", false, 0));
                pytania.add(new Questions("Czoło fali to powierzhcnia przechodząca przez punkty w których fala ma fazę i amplitudę", "Taką samą", "Różną", "Mniejszą od zera", "Równą zeru", false, 0));
                pytania.add(new Questions("Na jakiej powierzchni następuje odbicie zwierciadlane", "Gładkiej", "Chropowatej", "Krzywej", "Uszkodzonej", false, 0));
                pytania.add(new Questions("Odbite promienie są do siebie:", "Równoległe", "Prostopadłe", "Nie występują", "Zależy od sytuacji", false, 0));
                pytania.add(new Questions("Kąt padania i odbicia promieni mierzy się względem", "Normalnej do powierzchni", "Równoległej do powierzchni", "Nie można zmierzyć tych kątów", "Zależy od sytuacji", false, 0));
                pytania.add(new Questions("Na jakiej powierzchni następuje odbicie rozproszone?", "Szorskiej", "Gładkiej", "Krzywej", "Nie istnieje takie odbicie", false, 0));
                pytania.add(new Questions("W przypadku odbicia rozproszonego odbite promienie świetle", "Poruszają się w różnych kierunkach", "Poruszają się w tym samym kierunku", "Tracą prędkość", "Nie istnieje takie odbicie", false, 0));
                pytania.add(new Questions("Linia prostopadła do powierzchni umieszczona w punkcie w którym promień pada na powierzchnie to", "Normalna", "Krzywa", "Falista", "Nie ma takiego punktu", false, 0));
                pytania.add(new Questions("Normalna do powierzchni tworzą z nią kąt:", "90 stopni", "180 stopni", "45 stopni", "60 stopni", false, 0));
                pytania.add(new Questions("Kąt padania równa się", "kątowi odbicia", "kątowi podzielonemu przez normalną", "45 stopniom", "60 stopniom", false, 0));
                pytania.add(new Questions("Powietrze jest przeroczystym ośrodkiem przez które biegnie światło tak jak:", "Czysta woda", "Węgiel", "Drzewo", "Zanieczyszona woda", false, 0));
                pytania.add(new Questions("Światło biegnące przez dwa ośrodki zaginane jest na ich granicy. Nazywa się to:", "Załamaniem światła", "Interferencją światła", "Odbiciem światła", "Światłem", false, 0));
                pytania.add(new Questions("Droga światła w danym ośrodku jest", "Odwracalna", "Nie możliwa do odtworzenia", "Kończy się po stracie energii", "Niezniszczalna", false, 0));
                pytania.add(new Questions("Dlaczego światło załamuje się?", "Z powodu różnic prędkości", "Ma depresje", "Napotyka opór np powietrze", "Światło nie może się załamać", false, 0));
                pytania.add(new Questions("Poniższy wzór przedstawia:", "Współczynnik załamania się światła", "Liczba naturalną", "Wzór na ilość światła", "Obliczenie prędkości światła w ośrodku", true, R.drawable.wspolczynnikzalamania));
                pytania.add(new Questions("Ile wynosi współczynnik załamania się światła w próżni?", "1", "2", "3", "4", false, 0));
                pytania.add(new Questions("Ile wynosi współczynnik załamania się światła w innych ośrodkach?", "Więcej niż 1", "1", "Mniej niż 1", "Światło nie łamie się", false, 0));
                pytania.add(new Questions("W jakich jednostkach przedstawiony jest współczynnik załamania się światła?", "Jest bezwymiarowy", "W Voltach", "W dżulach", "W m/s", false, 0));
                pytania.add(new Questions("Kąt krytyczny to taki kąt padania dla którego kąt odbicia wynosi", "90 stopni", "30 stopni", "45 stopni", "0 stopni", false, 0));
                pytania.add(new Questions("Gdy światło biegnie z jednego ośrodka do drugiego to jego częstosć", "nie ulega zmianie", "ulega zmianie", "potęguje", "zeruje się", false, 0));
                pytania.add(new Questions("Gdy światło biegnie z jednego ośrodka do drugiego to jego prędkość", "zmienia się", "światło nie ma prędkości", "jest taka sama", "nie ulega zmianie", false, 0));
                pytania.add(new Questions("Ile czasu (około) potrzeba by światło emitowane przez słońce dotarło na Ziemie?", "8 minut", "1 nanosekundę", "Cały dzień", "Godzinę", false, 0));
                pytania.add(new Questions("Jak nazywa się proces gdy elektrony na które pada światło mogą pochłaniać i ponownie emitować część światła?", "Rozpraszanie", "Skupianie", "Interferencja", "Nie ma takiego procesu", false, 0));
                pytania.add(new Questions("Jak nazywa się nakładanie się na siebie fal światła?", "Interfencja", "Dyfrakcja", "Zasada Younga", "Polaryzacja", false, 0));

            }
            //SREDNIA
            if (level.equals("Sredni")) {
                pytania.add(new Questions("Prędkość światła jest wykorzystywana do definicja", "Metra", "Sekundy", "Lumenów", "Masy", false, 0));
                pytania.add(new Questions("Podany poniżej wzór przedstawia zależność", "Częstotliwościa i długością fal elektromagnetycznych", "Prędkością światła i masy", "Masy i czasu", "Częstotliwością fal elektromagnetycznych i masą", true, R.drawable.czestotliwoscidlugoscifalzaleznosc));
                pytania.add(new Questions("W polach elektrycznych i magnetycznych fali przechowywana jest", "Energia fali", "Kolor fali", "Ładunek elektryczny", "Magnes", false, 0));
                pytania.add(new Questions("Czego jednostkami sa poniższe wartości?", "Natężenia fali", "Napięcia fali", "Koloru fali", "Częstotliwości fali", true, R.drawable.jednstkanatezeniafali));
                pytania.add(new Questions("Natężenie promieniowania słonecznego na powierzchni Ziemi wynosi", "1000 W/m^2", "2000 W/m^2", "3000W/m^2", "100W/m^2", false, 0));
                pytania.add(new Questions("Co przenoszą fale elektromagnetyczne", "Pęd", "Wysokość", "Prąd", "Wszystko z powyższych", false, 0));
                pytania.add(new Questions("Jakiemu ciśnieniu promieniowania odpowiada poniższy wzór", "Minimalnemu", "Maksymalnemu", "Najczęstszemu", "Średniemu", true, R.drawable.minimalnecisnieniepromieniowania));
                pytania.add(new Questions("Jakiemu ciśnieniu promieniowania odpowiada poniższy wzór", "Maksymalnemu", "Minimalnemu", "Najczęstszemu", "Średniemu", true, R.drawable.maksymalnecisnieniepromieniowania));
                pytania.add(new Questions("Pierwsza teoria czym jest światło sugerowała że:", "Światło to cząsteczki", "Światło to fale", "Światło to fale cząsteczek", "Światło to cząsteczki fali", false, 0));
                pytania.add(new Questions("Kto pierwszy wykorzystał model cząsteczkowy do wyjaśnienia zjawisk odbicia i załamania światła?", "Newton", "Maxwell", "Young", "Huyghens", false, 0));
                pytania.add(new Questions("Kto pierwszy pokazał interfencje światła?", "Young", "Maxwell", "Newton", "Einstein", false, 0));
                pytania.add(new Questions("Kto jako pierwszy założył że światło to fala?", "Huyghens", "Maxwell", "Newton", "Einstein", false, 0));
                pytania.add(new Questions("Kto uznał że promienie elektromagnetyczne jest skwantowane?", "Planck", "Einstein", "Maxwell", "Huyghens", false, 0));
                pytania.add(new Questions("Jak nazywa się poniższa stała?", "Stała Plancka", "Stała Bohra", "Stała Enisteina", "Stała Newtona", true, R.drawable.stalaplancka));
                pytania.add(new Questions("Czym jest h w poniższym wzorze na energię fotonu?", "Stala Plancka", "Wysokością", "Głębokością", "Częstotliwością", true, R.drawable.energiafotonu));
                pytania.add(new Questions("Czym jest f w poniższym wzorze na energię fotonu?", "Częstotliwością", "Wysokością", "Głębokością", "Stala Plancka", true, R.drawable.energiafotonu));
                pytania.add(new Questions("Odległość pomiędzy przedmiotem a zwierciadłem/soczewką to?", "Odległość przedmiotu", "Odległość obrazu", "Różnica w prędkości świateł w obu miejscach", "Nie istnieje", false, 0));
                pytania.add(new Questions("Odległość pomiędzy obrazem a zwierciadłem/soczewką to", "Odległość obrazu", "Odległość przedmiotu", "Nie istnieje żadna odległość", "Logarytm odległości przedmiotu a soczewki", false, 0));
                pytania.add(new Questions("Jak nazywa się obraz przez którego punkty przechodzą promienie świetlne?", "Rzeczywisty", "Pozorny", "Fikcyjny", "Modernistyczny", false, 0));
                pytania.add(new Questions("Jakie zwierciadło ma kształt wycinka sfery?", "Kuliste", "Wklęsłe", "Wypukłe", "Żadne", false, 0));
                pytania.add(new Questions("Jakie zwierciadło ma odbijającą powierzchnie po wklęsłej stronie powierzchni?", "Wklęsłe", "Kuliste", "Wypukłe", "Żadne", false, 0));
                pytania.add(new Questions("Jakie zwierciadło ma odbijającą powierzchnie po wypukłej stronie powierzchni?", "Wypukłe", "Kuliste", "Wklęsłe", "Żadne", false, 0));
                pytania.add(new Questions("Jak nazywa się obraz przez którego punkty nie przechodzą promienie świetlne?", "Pozorny", "Rzeczywisty", "Fikcyjny", "Modernistyczny", false, 0));

            }
            //TRUDNY
        }
//        FIZYKA JĄDROWA
        Log.e("BANK PYTAN", "IDE TUTAJ");
        if (kategoria.equals("Fizyka") && (temat.equals("Fizyka jądrowa") || temat.equals("Całość"))) {
            Log.e("BANK PYTAN", "IDE TUTAJ2");

            ///LATWY
            if (level.equals("Latwy")) {
                Log.e("BANK PYTAN", "IDE TUTAJ3");


                pytania.add(new Questions("Jądro atomowe składa się z:", "Protonów, Neutronów, Elektronów", "Atomów i elektronów", "Protetyków, Neurotyków, Energetyków", "Protonów, Neutronów i Elektryków", false, 0));
                pytania.add(new Questions("Dodatni ładunek jądra atomowego to:", "Proton", "Dodatron", "Elektron", "Neutron", false, 0));
                pytania.add(new Questions("Ujemny ładunek jądra atomowego to:", "Elektron", "Dodatron", "Proton", "Neutron", false, 0));
                pytania.add(new Questions("Neutralny ładunek jądra atomowego to:", "Neutron", "Dodatron", "Elektron", "Proton", false, 0));
                pytania.add(new Questions("Elektrony poruszają się po powłokach:", "Walencyjnych", "Elektrycznych", "Energetycznych", "Kowalskich", false, 0));
                pytania.add(new Questions("Liczba atomowa pierwiastka odpowiada liczbie:", "Protonow", "Elektronów", "Masy", "Neutronow", false, 0));
                pytania.add(new Questions("'Prawa fizyki są takie same w każdym inercjalnym układzie odniesienia - jest to postulat'", "Einsteina", "Ulama", "Bohra", "Newtona", false, 0));
                pytania.add(new Questions("Autorem tego wzoru (teoria względności) jest:", "Einstein", "Planck", "Newton", "Bohr", true, R.drawable.relatywistyczna_energia_spoczynkowa));
                pytania.add(new Questions("Czym jest E w poniższym wzorze?", "Energią", "Elektronem", "Elektrycznością", "Eukaliptusem", true, R.drawable.relatywistyczna_energia_spoczynkowa));
                pytania.add(new Questions("Czym jest C w poniższym wzorze?", "Prędkością światła", "Ilością swiatła [kg]", "Prędkością ciepła", "Ciepłem", false, R.drawable.relatywistyczna_energia_spoczynkowa));
                pytania.add(new Questions("Czym jest M w poniższym wzorze", "Masą", "Minutami", "Multiplekserem", "Megawatem", true, R.drawable.relatywistyczna_energia_spoczynkowa));
                pytania.add(new Questions("Niekontrolowana reakcja łańcuchowa rozszczepienia ciężkich jąder atomowych to podstawa:", "Budowy bomby jądrowej", "Budowy zderzacza hadronów", "Budowy elektrowni jądrowej", "Budowy gwiazdy śmierci", false, 0));
                pytania.add(new Questions("Ile jest powłok walencyjnych?", "7", "2", "71", "150", false, 0));
                pytania.add(new Questions("Ile elektronów mieści się na pierwszej powłoce walencyjnej?", "2", "5", "10", "15", false, 0));
                pytania.add(new Questions("Który rozpad emituje jądra helu? (2 protony, 2 neutrony)", "Rozpad alfa", "Rozpad beta minus", "Rozpad gamma ", "Rozpad beta plus", false, 0));
                pytania.add(new Questions("Który rozpad emituje wysokoenergetyczny foton?", "Rozpad gamma", "Rozpad beta minus", "Rozpad alfa", "Rozpad beta plus", false, 0));
                pytania.add(new Questions("Tylko w bardzo wysokich temperaturach lub po olbrzymim ciśnieniem zachodzi", "Fuzja jądrowa", "Fuzja tylko protonów", "Fuzja tylko elektronów", "Fuzja pierwiastków", false, 0));
                pytania.add(new Questions("Poniższy wzór jest wzorem na:", "Długość fali", "Lambde", "Omege kątu", "Siłę uderzenia", true, R.drawable.dlugosc_fali));
                pytania.add(new Questions("Czym jest h w poniższym wzorze?", "Stałą plancka", "Wysokością", "Odległością", "Pierwiastkiem lambdy", true, R.drawable.dlugosc_fali));
                pytania.add(new Questions("Poniższy wzór jest wzorem na", "Częstotliwość cząsteczki", "Długość fali", "Energie", "Prędkość", true, R.drawable.czestotliwosc_fj));
                pytania.add(new Questions("Czym jest E w poniższym wzorze", "Energia", "Etropią", "Enkapsulacja", "Elektronem", true, R.drawable.czestotliwosc_fj));
                pytania.add(new Questions("Poniższy wzór jest wzorem na", "Pęd", "Prędkośc", "Moc", "Energię", true, R.drawable.ped_jk));
                pytania.add(new Questions("W jakiej miejscowości na Ukrainie doszło do awarii elektrowni atomowej?", "Czarnobyl", "Janiepaniemaju", "Osłowa", "Kijów", false, 0));
                pytania.add(new Questions("Jak nazywają się promienie'pokazujące' ludzkie kości? ", "Promienie Rentgena", "Promienie świetlne", "Promienie Hertza", "Promienie Boole'a", false, 0));
                pytania.add(new Questions("Jak nazywało się japońskie miasto gdzie doszło do awarii elektrowni atomowej?", "Fukushima", "Hiroszima", "Nagasaki", "Tokio", false, 0));
                pytania.add(new Questions("Na które miasta spuszczono bomby atomowe podczas II wojny światowej?", "Hiroszima i Nagasaki", "Monachium i Drezno", "Golog i Yushu", "Petersburg i Leningrad", false, 0));
                pytania.add(new Questions("Jak nazywała się bomba atomowa którą amerykanie zrzucili 6 sierpnia 1945", "Little Boy", "Fat Man", "Little Girl", "Fat Woman", false, 0));
                pytania.add(new Questions("Jak nazywała się bomba atomowa którą amerykanie zrzucili 9 sierpnia 1945", "Fat Man", "Fat Women", "Little Girl", "Little Boy", false, 0));
                pytania.add(new Questions("Jak nazywał się mężczyzna który przeżył wybuchy obu bomb atomowych zrzuconych w sierpniu 1945 roku?", "Tsutomu Yamaguchi", "Isoroku Yamamoto", "Hirohito", "Jaje Mikonwachi", false, 0));
                pytania.add(new Questions("Jak nazywał się amerykański projekt stworzenia bomb atomowych", "Projekt Manhattan", "Projekt New Jersey", "Dolina Krzemowa", "Projekt Arizona", false, 0));
                pytania.add(new Questions("Termojądrowa synteza lekkich pierwiastków wodoru tworzy", "Bombe wodorową", "Bombę zapalającą", "Bombę kasetonową", "Bombe atomową", false, 0));
            }


            if (level.equals("Sredni")) {

                pytania.add(new Questions("Poniższy wzór jest wzorem na:", "Dylatacje czasu", "Dylatacje odległości", "Gamme", "Różnica czasu ", true, R.drawable.dylatacja_czasu));
                pytania.add(new Questions("Relacja czasu do przestrzeni:", "Oba zjawiska są z sobą powiązane", "Jedno jest iloczynem drugiego", "Jest równa 1", "Oba zjawiska nie są z sobą powiązane", false, 0));
                pytania.add(new Questions("Jaki ruch powoduje skrócenie długości?", "Względny", "Bezwględny", "Szybki", "Wolny", false, 0));
                pytania.add(new Questions("Poniższa transformacja to transformacja:", "Lorentza", "Hertza", "Ulama", "Hawkinga", true, R.drawable.transformacja_lorentza));
                pytania.add(new Questions("Strumień energii fal elektromagnetycznych emitowanych przez ciało znajdujące się w temperaturze większej od zera bezwględnego to:", "Promieniowanie cieplne", "Hipotermia", "Promieniowanie radiowe", "Światło", false, 0));
                pytania.add(new Questions("Ciało fizyczne pochłaniające całkowicie padające na nie promieniowanie cieplne to:", "Ciało doskonale czarne", "Grafen", "Antymateria", "Czarna dziura", false, 0));
                pytania.add(new Questions("Poniższe prawo jest prawem:", "Gustava-Kirchoffa", "Plancka", "Einsteina", "Hertza", true, R.drawable.prawo_gustava_kirchoffa));
                pytania.add(new Questions("Poniższy wzór mówi o:", "Stosunku zdolności emisyjnej do absorpcyjnej", "Taki wzór nie istnieje", "Stosunku zdolności absorpcyjnej do emisyjnej", "Idealnym ciele czarnym", true, R.drawable.prawo_gustava_kirchoffa));
                pytania.add(new Questions("Poniższy wzór przedstawia", "Prawo Stefana-Boltzmana", "Prawo Gustava Kirchoffa", "Wzór na opór", "Szybko reakcji rozpadu jąder atomu", true, R.drawable.prawo_stefana_boltzmana));
                pytania.add(new Questions("Ile wynosi stała Stefana Boltzmana? [J/K]", "1.3806*10<sup>-23</sup>", "0", "13.12*25<sup>123</sup>", "Nie ma takiej stałej", false, 0));
                pytania.add(new Questions("Ile wynosi stała przyspieszenia elektronów Einsteina-Newtona? [km/s]", "Nie ma takiej stałej", "3.1415", "1.777*10<sup>10</sup>", "5", false, 0));
                pytania.add(new Questions("Poniższy wzór to prawo:", "Przesunięć Wiena", "Gustava-Kirchoffa", "Stefana-Boltzmana", "Einsteina-Hertza", true, R.drawable.prawo_wiena));
                pytania.add(new Questions("Poniższa funkcja to funkcja:", "Funkcja Kirchoffa", "Funkcja logarytmiczna", "Funkcja wykładnicza", "Funkcja liniowa", true, R.drawable.funkcja_kirchoffa_1));
                pytania.add(new Questions("Zjawisko jonizacji atomów albo cząsteczek gazu pod wpływem światła to", "Fotojonizacja", "Jonizacja świetlna", "Fotoelektryczność", "Fotodiodyzm", false, 0));
                pytania.add(new Questions("Poniższy wzór wynalazł:", "Einstein", "Newton", "Bohr", "Nietsche", true, R.drawable.rownanie_einsteina));
                pytania.add(new Questions("Zmiana długości fali rozproszonego fotonu to zjawisko", "Comptona", "Ulama", "Hawkinga", "Einsteina", false, 0));
                pytania.add(new Questions("Poniższy wzór dla atomu wodoru to", "Wzór Balmera", "Wzór Bohra", "Wzór Einsteina", "Wzór Plancka", true, R.drawable.wzor_balmera));
                pytania.add(new Questions("Kto stworzył model ciastka z rodzynkami?", "Thomson", "Rutherford", "Bohr", "Franck", false, 0));
                pytania.add(new Questions("Kto odkrył jądro atomowe? (1911)", "Rutherford", "Thomson", "Bohr", "Franck", false, 0));
                pytania.add(new Questions("Podany wzór określa x przy przechodzeniu z jednego stanu energetycznego do drugiego wodoru. Czym jest x?", "Częstotliwością", "Długością", "Energią", "Prędkością", true, R.drawable.czestotliwosc_przy_przechodzeniu_przez_stany));
                pytania.add(new Questions("Jaka nazywana jest cecha według której obiekty kwantowe mogą być falą albo korpuskularne?", "Dualizm korpuskalarno-falowy", "Promieniotwórczość", "Cecha natywna", "Nie ma takiej cechy", false, 0));
                pytania.add(new Questions("Zasada według której niemożliwe jest jednoczesne określenie położenia i pędu cząsteczki to", "Zasada nieoznaczoności Heisenberga", "Dualizm korpuskalarno-falowy", "Zasada wyjątkowości cząsteczki Gamma", "Zasada Schrodingera", false, 0));
                pytania.add(new Questions("Jakie zwierzę 'miał' Schrodinger w skrzyni?", "Kota", "Psa", "Mysz", "Węża", false, 0));
                pytania.add(new Questions("Ile wynosi liczba kwantowa spinu elektronu?", "1/2", "1/4", "1", "3.149", false, 0));
                pytania.add(new Questions("Jakie są 3 podstawowe sieci krystaliczne?", "A1,A2,A3", "Sieć heksagonalna,oktetowa i decymalna", "Sieć sześcienna, ostrosłupowa i granistosłupowa", "Sieć protonowa, neutronowa, elektronowa", false, 0));
                pytania.add(new Questions("Protony i neutrony to:", "Nukleony", "Bariony", "Feriony", "Antyelektrony", false, 0));
                pytania.add(new Questions("Nośnikiem oddziałowywań grawitacyjnych jest:", "Grawiton", "Grafen", "Grawitator", "Graw", false, 0));
                pytania.add(new Questions("Izotopy posiadają", "Taką samą liczbę atomową", "Taką samą liczbe masową", "Taka samą liczbe neutronów", "Taką samą budowę i połączeń atom-elektron (p-n)", false, 0));
                pytania.add(new Questions("Liczby 4 liczby 'magiczne' to:", "2,8,20,28", "2,4,8,16", "2,8,18", "2,8,20,40", false, 0));
                pytania.add(new Questions("Poniższe równanie to:", "Synteza lekkich jąder", "Synteza ciężkich jąder", "Rozpad normalny wodoru", "Reakcja termiczna", true, R.drawable.synteza_lekkich_jader));
                pytania.add(new Questions("Które cząstki są w jądrze atomowym nie będąc częścią składową atomu?", "Neutrino", "Proton", "Elektron", "Neutron", false, 0));

            }
            if (level.equals("Trudny")) {
                pytania.add(new Questions("Poniższa wartość to:", "Ładunek elektronu", "Ładunek protonu", "Prędkość potrzebna do odbicia światła", "Temperatura topnienia reaktora", true, R.drawable.ladunek_elektronu));
                pytania.add(new Questions("Które cząsteczki jądra atomowego mają klasyfikacje: barion i hadron?", "Proton i neutron", "Neutron i elektron", "Proton, elektron, neutron", "Proton i elektron", false, 0));
                pytania.add(new Questions("Ile wynosi masa neutronu?", "939.55 MeV/c<sup>2</sup>", "1*10<sup>-27</sup> kg", "2.9*10<sup>6</sup>m/s", "938.27 MeV/c<sup>2</sup>", false, 0));
                pytania.add(new Questions("Ile wynosi masa protonu?", "938.27 MeV/c<sup>2</sup>", "1*10<sup>-27</sup> kg", "2.9*10<sup>6</sup>m/s", "939.55 MeV/c<sup>2</sup>", false, 0));
                pytania.add(new Questions("Co tworzą dwa kwarki górne i jeden dolny", "Proton", "Foton", "Neutron", "Elektron", false, 0));
                pytania.add(new Questions("Co tworzą dwa kwarki dolne i jeden górne", "Neutron", "Foton", "Proton", "Elektron", false, 0));
                pytania.add(new Questions("Jaka generacje tworzą cząstki: mion, neutrino mionowe, kwark dziwny i kwark powabny?", "Drugą", "Pierwszą", "Generacje Matke", "Generacje X", false, 0));
                pytania.add(new Questions("Leptony i bariony są", "Cząstkami materii", "Hadronami", "Budulcami elektronu", "Budulcami protonu", false, 0));
                pytania.add(new Questions("Jaka generacje tworzą cząstki: taon, neutrino taonowe, kwark denny i kwark szczytowy?", "Trzecią", "Pierwszą", "Generacje Matke", "Generacje X", false, 0));
                pytania.add(new Questions("Jaka generacje tworzą cząstki: elektron, neutrino elektronowe, kwark dolny i kwark górny?", "Pierwszą", "Drugą", "Generacje Matke", "Generacje X", false, 0));
                pytania.add(new Questions("O ile i w którą stronę nastepuje przesunięcie pierwiastka w układzie okresowym podczas przemian jądrowych dla przemiany typu alfa", "Dwa miejsca w lewo", "Dwa miejsca w prawo", "Jedno miejsce w lewo", "Jedno miejsce w prawo", false, 0));
                pytania.add(new Questions("O ile i w którą stronę nastepuje przesunięcie pierwiastka w układzie okresowym podczas przemian jądrowych dla przemiany typu beta", "Jedno miejsce w prawo", "Dwa miejsca w prawo", "Jedno miejsce w lewo", "Dwa miejsca w lewo", false, 0));
                pytania.add(new Questions("Ile wynosi masa elektronu", "9.10938356(11)*10<sup>-31</sup> kg", "9.10938356(11)*10<sup>-2</sup> kg", "9.10938356(11)*10<sup>2</sup> kg", "9.10938356(11)*10<sup>-31</sup> kg", false, 0));
                pytania.add(new Questions("Która wartość to stała Plancka", "4.135 * 10<sup>-15</sup> eV*s", "4.135 * 10<sup>-15</sup> J*s", "4.135 * 10<sup>15</sup> eV*s", "4.135 * 10<sup>15</sup> J*s", false, 0));
                pytania.add(new Questions("Która wartość to stała Plancka", "6,626 * 10<sup>-34</sup> J*s", "6,26 * 10<sup>-34</sup> eV*s", "6,626 * 10<sup>34</sup> eV*s", "6,626 * 10<sup>34</sup> J*s", false, 0));
                pytania.add(new Questions("Ile wynosi Magneton Bohta", "1,602*10<sup>-19</sup C", "-1,602*10<sup>-19</sup C", "1,602*10<sup>19</sup m<sup>3</sup>", "1,602*10<sup>19</sup C", false, 0));
                pytania.add(new Questions("Ile wynosi promień atomu Bohra", "0,529 177 208 59(36)·10<sup>−10</sup>m", "Około metr", "0,529 177 208 59(36)·10<sup>10</sup>m ", "22,529 177 208 59(36)·10<sup>−10</sup> m", false, 0));
                pytania.add(new Questions("Ile wynosi stała Boltzmanna", "1,380 6504(24)·10<sup>−23</sup> J*K<sup>-1</sup> ", "1,380 6504(24)·10<sup>−23</sup> J*C<sup>10</sup> ", "1,380 6504(24)·10<sup>−23</sup> J*F<sup>-1</sup> ", "1,380 6504(24)·10<sup>−23</sup> J*C<sup>-1</sup> ", false, 0));
                pytania.add(new Questions("Ile wynosi stała Wiena", "2,897 7685(51)·10<sup>−3</sup> ", "107685(51)·10<sup>−3</sup> ", "1·10<sup>−3</sup> ", "2,897 7685(51)·10<sup>3</sup> ", false, 0));
                pytania.add(new Questions("Ile wynosi stała Rydberga?", "10 973 731,568 527(73) m<sup>-1</sup>", "10<sup>73</sup> m<sup>-1</sup>", "0.5 m<sup>-1</sup> ", "10 973 731,568 527(73)  km<sup>-1</sup>", false, 0));
                pytania.add(new Questions("Ile wynosi czas Plancka", "5,391 24(27)·10<sup>−44</sup> s", "5,391 24(27)·10<sup>−44</sup> lat", "5,391 24(27)·10<sup>−44</sup> min", "5,391 24(27)·10<sup>−44</sup> h", false, 0));
                pytania.add(new Questions("Ile wynosi zredukowana stała Plancka", "1,054 571 628(53)·10<sup>-34</sup> J*s", "1,054 571 628(53)·10<sup>34</sup> J*s", "1,054 571 628(53)·10<sup>34</sup> eV*s", "1,054 571 628(53)·10<sup>−34</sup> eV*s ", false, 0));
                pytania.add(new Questions("Ile wynosi zredukowana stała Plancka", "6,582·10<sup>-16</sup> eV*s", "6,582·10<sup>-16</sup> J*s", "6,582·10<sup>16</sup> eV*s", "6,582·10<sup>-16</sup> J*s ", false, 0));
                pytania.add(new Questions("Kiedy urodził się Max Planck?", "1858", "1900", "1795", "1885", false, 0));
                pytania.add(new Questions("Kiedy urodził się Gustaw Kirchchoff", "1824", "1900", "1842", "1858", false, 0));
                pytania.add(new Questions("Kiedy urodził się Albert Einstein", "1879", "1900", "1897", "1858", false, 0));
                pytania.add(new Questions("Kiedy urodził się Heinrich Hertz", "1857", "1875", "1900", "1795", false, 0));
                pytania.add(new Questions("Kiedy urodził się Stanisław Ulam", "1909", "1990", "1890", "1899", false, 0));
                pytania.add(new Questions("Kiedy urodził się Ernest Rutherford", "1871", "1817", "1900", "1791", false, 0));
                pytania.add(new Questions("Kiedy urodził się Niels Bohr", "1885", "1858", "1900", "1411", false, 0));
                pytania.add(new Questions("Kim była żona Frederica Joliot?", "Córką Marii Skłodowskeij Curie", "Córką Irene Joliot Curie", "Córką Helene Langevin", "Siostrą Irene Joliot Curie", false, 0));
                pytania.add(new Questions("Co przedstawia poniższy wzór", "Rozkład Boltzmanna", "Rozkład normalny", "Stałą Boltzmanna", "Rozkład Gaussa", true, R.drawable.rozklad_boltzmanna));
                pytania.add(new Questions("Co przedstawia poniższy obrazek?", "Studnie potencjału", "Wykres prędkości a odległości", "Zależność Energii a prędkości", "Brak jednoznacznych danych", true, R.drawable.nieskonczona_studia_potencjalu));
                pytania.add(new Questions("Co przedstawia poniższy obrazek?", "Nieskończoną studnie kwantową", "Skończoną studnie", "Zależność przyspieszenia a prędkości", "Nieskończoną studnie potencjału", false, R.drawable.kwantowa_studnia_potencjalu));

            }

            //TRUDNY
        }

//        MECHANIKA

//        ASTRO CALOSC

//        PLANETY

//        HELIOCENTRYZM
    }

    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
