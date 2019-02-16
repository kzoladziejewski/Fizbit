package com.example.kacper.fizbit;

import com.example.kacper.fizbit.Questions;
import com.example.kacper.fizbit.R;

import java.util.ArrayList;

/**
 * Created by Kacper on 16.02.2019.
 */

public class BankPytanOptyka {
    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytanOptyka(String level) {
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
            pytania.add(new Questions("Stojąc nad brzegiem jeziora widzisz przepływającą rybę. Aby w nią trafić musisz celować:", "Poniżej obrazu ryby", "Na lewo od ryby", "Dokładnie w obraz ryby", "Powyżej obrazu ryby", false, 0));
            pytania.add(new Questions("Która droga przedstawia proces izobaryczny a potem izochoryczny?", "1-3-2", "1-2-3", "2-3-1", "3-2-1", true, R.drawable.proces_izobaryczny_izochoryczny));
            pytania.add(new Questions("Co przedstawia poniższy wzór?", "Prawo Brewstera", "Prawo Newtona", "1 prawo optyki", "2 prawo optyki", true, R.drawable.prawo_brewstera));
            pytania.add(new Questions("Co przedstawia ponizszy obraz?", "Doświadczenie Younga", "Interferometr Michelsona-Morleya", "Pierścienie Newtona", "Zjawisko dyfrakcji", true, R.drawable.doswiadczenie_younga));
            pytania.add(new Questions("Co przedstawia poniższy rysunek?", "Zjawisko dyfrakcji", "Interferometr Michelsona-Morleya", "Pierścienie Newtona", "Doświadczenie Younga", false, R.drawable.zjawisko_dyfrakcji));
        }
        if (level.equals("Trudny")) {
            pytania.add(new Questions("Długośc światła czerwonego to 600nm w powietrzu i 400 nm w soczewce oka. Ile wynosi współczynnik załamania soczewki?", "1.5", "50", "0.9", "1.34", false, 0));
            pytania.add(new Questions("Widać ją pod katem 40 stopni. Czerwony na górze, fiolet na dole - o jakiej tęczy mowa?", "1 rzędu", "2 rzędu", "Żadnej", "3 rzędu", false, 0));
            pytania.add(new Questions("Widać ją pod katem 50 stopni. Fiolety na górze, czerwony na dole - o jakiej tęczy mowa?", "2 rzędu", "1 rzędu", "3 rzędu", "żadnego", false, 0));
            pytania.add(new Questions("Co pochłania światło nie drgające wzdłuż osi polaryzacyjnej?", "Polaryzator", "Ciemność", "Oscyloskop", "Pryzmat", false, 0));
            pytania.add(new Questions("Dlaczego w kosmosie niebo jest czarne?", "Światło nie ma gdzie się rozpraszać", "Światło jest za bardzo rozproszoe", "Brak tlenu oznacza śmierć fotonów", "Atomy są zbyt zajęte by emitować światło", false, 0));
            pytania.add(new Questions("Jakie kolory nie są prawie rozpraszane i biegną prosto od słońca?", "Czerwone, pomarańczowe, żółte", "Czerwone, zielone, niebieskie", "Niebieskie, Szare, Czarny", "Białe, czerwone, niebieskie", false, 0));
            pytania.add(new Questions("Molekuły czego pochłaniają większośc krótszych fal i emitują niebieskie swiatło?", "Gazu", "Cieczy", "Metali", "Niemetali", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik załamania wody", "1,33", "1,37", "1,38", "1,74", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik załamania alkoholu", "1,37", "1,33", "1,38", "1,74", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik załamania heksanu", ",1,38", "1,33", "1,37", "1,74", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik załamania jodka metylu", "1,74", "1,33", "1,38", "1,37", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik załamania diamenty?", "2,4", "2,5", "2,3", "2.0", false, 0));
            pytania.add(new Questions("'Promień świetlny poruszający się (w dowolnym ośrodku) od punktu A do punktu B przebywa najkrótszą możliwie drogę optyczną' - to zasada", "Fermata", "Newtona", "Lyoda", "Einsteina", false, 0));
            pytania.add(new Questions("Ile światła pochłania Vantablack?", "Więcej niż 99,965%", "Mniej niż 99,965%", "99,965", "Vantablack nie istnieje", false, 0));
            pytania.add(new Questions("Jak nazywamy zdolność ośrodków optycznych do podwójnego załamywania światła", "Dwójłomność", "Pryzmatyzm", "Multipryzmatyzm", "Rozdzielność środka", false, 0));
            pytania.add(new Questions("Kto był pierwszym twórcą praw optyki?", "Euklides", "Heron z Aleksandri", "Ptolemeusz", "Newton", false, 0));
            pytania.add(new Questions("Ile było praw optyki wymyślonych w starożytności? (325-265 p.n.e)", "7", "3", "2", "12", false, 0));
            pytania.add(new Questions("Ile wynosi irradiancja ultrafioletu? [W/m<sup>2</sup>", "62", "417", "522", "1367", false, 0));
            pytania.add(new Questions("Ile wynosi irradiancja światła widzialnego? [W/m<sup>2</sup>", "522", "62", "417", "1367", false, 0));
            pytania.add(new Questions("Ile wynosi irradiancja podczerwieni? [W/m<sup>2</sup>", "417", "522", "62", "1367", false, 0));
            pytania.add(new Questions("Ile wynosi irradiancja stałej słonecznej? [W/m<sup>2</sup>", "1367", "522", "417", "62", false, 0));
            pytania.add(new Questions("Ile wynosi częstotliwość fali czerwonego koloru?", "480-405", "670-600", "580-530", "530-510", false, 0));
            pytania.add(new Questions("Ile wynosi częstotliwość fali żółtego koloru?", "530-510", "670-600", "580-530", "480-405", false, 0));
            pytania.add(new Questions("Ile wynosi częstotliwość fali zielonego koloru?", "580-530", "580-530", "530-510", "480-405", false, 0));
            pytania.add(new Questions("Ile wynosi częstotliwość fali niebieskiego koloru?", "670-600", "580-530", "530-510", "480-405", false, 0));
            pytania.add(new Questions("Ile wynosi częstotliwość fali fioletowego koloru?", "790-700", "890-800", "990-100", "990-00", false, 0));

        }

    }

    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
