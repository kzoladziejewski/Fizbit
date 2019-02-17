package com.example.kacper.fizbit;

import java.util.ArrayList;

/**
 * Created by Kacper on 16.02.2019.
 */

public class BankPytanMechanika {

    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytanMechanika(String level) {

        if (level.equals("Latwy")) {

            pytania.add(new Questions("Mechanika to dział fizyki, który bada: ", "Ruch ciał fizycznych", "Zasady działania mechanizmów", "Ciepło ciał fizycznych", "Atomy", false, 0));
            pytania.add(new Questions("Czy ruch jest względny?", "Tak", "Nie", "Zależy od obserwatora", "Zależy od wartości początkowych", false, 0));
            pytania.add(new Questions("Droga, zwykle oznaczana literą s to: ", "Długość toru ruchu", "Czas toru ruchu", "Iloraz prędkości i czasu", "Iloczyn prędkości i czasu", false, 0));
            pytania.add(new Questions("Prędkość średnia to: ", "iloraz drogi i czasu", "Iloczyn drogi i czasu", "Suma drogi i czasu", "Różnica drogi i czasu", false, 0));
            pytania.add(new Questions("Prędkość średnią określa wzór: ", "V=s/t", "V=s*t", "V=s+t", "V=s-t", false, 0));
            pytania.add(new Questions("Jednostką szybkości w układzie SI jest: ", "m/s", "km/s", "s/m", "km/m", false, 0));
            pytania.add(new Questions("Przyspieszenie średnie przedstawia wzór: ", "a=ΔV/Δt", "V=s/t", "a=ΔV*Δt", "a=ΔV+Δt", false, 0));
            pytania.add(new Questions("Przyspieszenie grawitacyjne oznaczamy literą: ", "g", "h", "j", "k", false, 0));
            pytania.add(new Questions("Przyspieszenie grawitacyjne w przybliżeniu wynosi: ", "9,81 m/s<sup>2</sup>", "19,81 m/s<sup>2</sup>", "5,81 m/s<sup>2</sup>", "9,81 cm/s<sup>2</sup>", false, 0));
            pytania.add(new Questions("Jednostką przyspieszenia w układzie SI jest: ", "m/s<sup>2</sup>", "a=ΔV/Δt", "V=s/t", "a=ΔV*Δt", false, 0));
            pytania.add(new Questions("Ruch jednostajny prostoliniowy to ruch: ", "Ze stałą prędkością", "Ze zmienną prędkością", "Bez prędkości", "Bez postojów", false, 0));
            pytania.add(new Questions("Droga w ruchu jednostajnym prostoliniowym jest opisana wzorem: ", "s=vt", "a=ΔV/Δt", "V=s/t", "m/s<sup>2</sup>", false, 0));
            pytania.add(new Questions("W ruchu jednostajnym prostoliniowym, ciało w dowolnych równych odstępach czasu przebywa: ", "Jednakowe odcinki drogi", "Różne odcinki drogi", "Nie przebywa", "Tam gdzie chce", false, 0));
            pytania.add(new Questions("Ruch ze stałym przyspieszeniem po linii prostej, a prędkość i przyspieszenie mają ten sam zwrot to: ", "Ruch jednostajnie przyspieszony prostoliniowy", "Jednostajny prostoliniowym ", "Zmienny prostoliniowym ", "Zmienny krzywoliniowy", false, 0));
            pytania.add(new Questions("Równanie zależności V(t) w ruchu jednostajnie przyspieszonym prostoliniowym to: ", "V=V0+at", "a=ΔV/Δt", "m/s<sup>2</sup", "V=s/t", false, 0));
            pytania.add(new Questions("Ruch ze stałym przyspieszeniem po linii prostej, gdzie prędkość i przyspieszenie mają odwrotny zwrot to: ", "Ruch jednostajnie opóźniony prostoliniowy", "BLEDNA_1", "BLEDNA_2", "BLEDNA_3", false, 0));
            pytania.add(new Questions("Jednostką częstotliwości jest:", "Hz", "BLEDNA_1", "BLEDNA_2", "BLEDNA_3", false, 0));
            pytania.add(new Questions("Okres oznaczamy literą", "T", "F", "M", "N", false, 0));
            pytania.add(new Questions("Dział mechaniki, który bada przyczyny ruchu i jego zmiany pod wpływem sił to: ", "Dynamika", "Optyka", "Fizyka jądrowa", "Termodynamika", false, 0));
            pytania.add(new Questions("Wielkość fizyczna, będąca miarą oddziaływań prowadzących do zmian prędkości ciał lub ich kształtu to: ", "Siła", "Moc", "Power", "Niuton", false, 0));
            pytania.add(new Questions("Jednostką siły jest: ", "N", "W", "Q", "S", false, 0));
            pytania.add(new Questions("Jednostką mocy jest: ", "Wat", "Niuton", "Dżul", "Amper", false, 0));
            pytania.add(new Questions("Jeżeli dane ciało lub układ ciał jest zdolne do wykonania pracy, to mówimy, że ma: ", "Energię mechaniczną", "Energie potencjalną", "Energię kinetyczną", "Jakąkolwiek energię", false, 0));
            pytania.add(new Questions("Jednostką energii jest: ", "Dżul", "Wat", "Niuton", "Amper", false, 0));
            pytania.add(new Questions("Jeżeli na ciało nie działa żadna siła lub siły działające się równoważą, to ciało pozostaje w spoczynku lub porusza się ruchem: ", "jednostajnym prostoliniowym", "jednostajnym krzywoliniowym", "zmiennym krzywoliniowym", "zmiennym prostoliniowym", false, 0));
            pytania.add(new Questions("Jeżeli na ciało nie działa żadna siła lub siły działające się równoważą, to ciało pozostaje w spoczynku lub porusza się ruchem jednostajnym prostoliniowym. Która to zasada dynamiki Newtona?", "1", "2", "3", "4", false, 0));
            pytania.add(new Questions("Gdy dwa ciała pozostają ze sobą w kontakcie, to przy ich próbie przerwania pojawiają się: ", "Siły tarcia", "Siła lepkości", "Siła przylepy", "Siła kleju", false, 0));
            pytania.add(new Questions("Jeżeli na ciało działa siła, to porusza się ono ruchem jednostajnie przyspieszonym z przyspieszeniem wprost proporcjonalnym do tej siły i odwrotnie proporcjonalnym do masy ciała. Która to zasada dynamiki Newtona?", "2", "1", "3", "4", false, 0));
            pytania.add(new Questions("Jeżeli ciało A działa na ciało B pewną siłą F, to ciało B działa na ciało A siłą o tej samej wartości, takim samym kierunku, ale przeciwnym zwrocie -F. Która to zasada dynamiki Newtona?", "3", "1", "2", "4", false, 0));
            pytania.add(new Questions("Iloczyn prędkości ciała i jego masy to: ", "Pęd", "Przyspieszenie", "Moc", "Prędkość", false, 0));

        }
        if (level.equals("Sredni")) {
            pytania.add(new Questions("Mechanikę dzielimy na: ", "Klasyczną i kwantową", "Zależną i niezależną", "Odkrytą i nieodkrytą", "Prostę i skomplikowaną", false, 0));
            pytania.add(new Questions("Ruch to zmiana położenia ciała względem: ", "Układu odniesienia", "Wszechświata", "Obserwatora", "Innego ciała", false, 0));
            pytania.add(new Questions("Brak ruchu to: ", "Spoczynek", "Śmierć", "Zmęczenie", "Odpoczynek", false, 0));
            pytania.add(new Questions("Ruch, w którym wszystkie punkty ciała poruszają się po tych samych torach to: ", "Ruch postępowy", " Regres", "Ruch obrotowy", "Ruch przyspieszony", false, 0));
            pytania.add(new Questions("Ruch, w którym wszystkie punkty ciała poruszają się po współśrodkowych okręgach to: ", "Ruch obrotowy", "Ruch postępowy", "Ruch przyspieszony", "Ruch kołowy", false, 0));
            pytania.add(new Questions("Linia po której porusza się ciało to: ", "Tor ruchu", "Prosta ruchu", "Krzywa ruchu", "Po prostu linia", false, 0));
            pytania.add(new Questions("Droga jest: ", "Skalarem (liczbą)", "Wektorem", "Jednostką", "Systemem", false, 0));
            pytania.add(new Questions("Przemieszczenie opisuje: ", "Zmiany położenia ciała w czasie", "Zmiany czasu w położeniu ciała", "Zmiany czasu i ciała", "Położenia bez czasu", false, 0));
            pytania.add(new Questions("Przemieszczenie to wielkość: ", "Wektorowa", "Skalarna", "Duża", "Mała", false, 0));
            pytania.add(new Questions("Jeśli ciało przemieściło się z punktu A do punktu B, to przemieszczenie opisuje wzór: ", "Δr = rb - ra", "a=ΔV/Δt", "a=ΔV*Δt", "Δr = rb + ra", false, 0));
            pytania.add(new Questions("Szybkość chwilową określa wzór: ", "V=ds/dt", "V=s/t", "V=s*t", "V=s*dt", false, 0));
            pytania.add(new Questions("Iloraz przyrostu prędkości do czasu, w którym ten przyrost następuje to: ", "Przyspieszenie średnie", "Przyspieszenie minimalne", "Przyspieszenie maksymalne", "Przyspieszenie grawitacyjne", false, 0));
            pytania.add(new Questions("Przyspieszenie średnie w ruchu prostoliniowym ilustruje wzór: ", "a=(V2-V1)/(t2-t1)", "a=ΔV/Δt", "a=(V2-V1)*(t2-t1)", "a=(V2-V1)-(t2-t1)", false, 0));
            pytania.add(new Questions("Przyspieszenie jest: ", "Wielkością wektorową", "Skalarne", "Obiektywne", "Subiektywne", false, 0));
            pytania.add(new Questions("Wektor będący ilorazem wektora przemieszczenia do czasu, w którym to przemieszczenie wystąpiło, to: ", "Prędkość średnia", "Prędkość maksymalna", "Prędkość", "Prędkość minimalna", false, 0));
            pytania.add(new Questions("Szybkość chwilową ilustruje wzór: ", "V=Δs/Δt, t->0 ", "BLEDNA_1", "BLEDNA_2", "BLEDNA_3", false, 0));
            pytania.add(new Questions("Prędkość chwilowa jest w każdym punkcie … do toru ruchu.", "Styczna", "Równoległa", "Prostopadła", "Żadna", false, 0));
//pytania.add(new Questions("Jeśli w każdym następnym przedziale czasu następuje taki sam wzrost prędkości to mówimy o: ","Ruchu jednostajnie przyspieszonym","BLEDNA_1","BLEDNA_2", "BLEDNA_3", false, 0));
// pytania.add(new Questions("Przykład ruchu przyspieszonego to: ","Spadek swobodny w polu grawitacyjnym","","BLEDNA_2", "BLEDNA_3", false, 0));
            pytania.add(new Questions("Przyspieszenie z jakim spadają ciała na powierzchni Ziemi to: ", "Przyspieszenie grawitacyjne", "Żadne", "Przyspieszenie dynamiczne", "Przyspieszenie statyczne", false, 0));
            pytania.add(new Questions("Pochodną prędkości względem czasu (dv/dt) jest: ", "Przyspieszenie", "Prędkość", "Pęd", "Akceleracja", false, 0));
            pytania.add(new Questions("Równanie zależności w ruchu jednostajnym prostoliniowym x(t) to: ", "x=x0+vt", "a=(V2-V1)/(t2-t1)", "a=ΔV*Δt", "Δr = rb + ra", false, 0));
            pytania.add(new Questions("Prędkość w ruchu jednostajnie opóźnionym prostoliniowym wyraża się wzorem: ", "V=V0-at", "x=x0+vt", "a=(V2-V1)/(t2-t1)", "a=ΔV*Δt", false, 0));
            pytania.add(new Questions("W spadku swobodnym szybkość V w chwili zderzenia z podłożem ciała upuszczonego z wysokości h możemy określić wzorem: ", "V=sqrt(2hg)", "a=ΔV*Δt", "V=V0-at", "a=(V2-V1)/(t2-t1)", false, 0));
            pytania.add(new Questions("Ruch ciała w polu grawitacyjnym pionowo do góry lub w dół z pewnej wysokości to: ", "Rzut pionowy", "Rzut skośny", "Rzut poziomy", "Rzut wspak", false, 0));
// pytania.add(new Questions("Rzut pionowy jest przykładem ruchu: ","Jednostajnie przyspieszonego prostoliniowego z przyspieszeniem g=const","BLEDNA_1","BLEDNA_2", "BLEDNA_3", false, 0));
            pytania.add(new Questions("Czas trwania jednego cyklu zjawiska okresowego to", "Okres", "Częstotliwość", "1s", "1 minuta", false, 0));
            pytania.add(new Questions("Wielkość fizyczna, która informuje o tym, ile razy w ciągu 1 sekundy zachodzi dane zjawisko okresowe to: ", "Częstotliwość", "Okres", "Czas", "Wektor czasu", false, 0));
            pytania.add(new Questions("Częstotliwość obliczamy wzorem: ", "f=1/T", "f=T*s*1/10", "f=1*T", "f=T/1", false, 0));
            pytania.add(new Questions("Omega jest to: ", "Szybkość kołowa", "Auto", "Rzymska litera", "Szybkość prosta", false, 0));
            pytania.add(new Questions("Jednostką częstości kołowej jest: ", "radian/s", "radian/m", "radian/km", "km/s", false, 0));
            pytania.add(new Questions("Siła jest to: ", "Wektor", "Skalar", "Moc", "Potęga", false, 0));
            pytania.add(new Questions("Pęd jest wielkością: ", "Wektorową", "Skalarną", "Zawsze ujemną", "Zerową", false, 0));
            pytania.add(new Questions("Pęd liczymy wzorem: ", "P=mv", "P=m/v", "P=m+v", "P=m-v", false, 0));
// pytania.add(new Questions("Iloczyn skalarny działającej siły i wektora przemieszczenia to: ","Praca","BLEDNA_1","BLEDNA_2", "BLEDNA_3", false, 0));
            pytania.add(new Questions("Jednostką pracy jest: ", "Dżul", "Wat", "Amper", "Niuton", false, 0));
            pytania.add(new Questions("Iloraz pracy do czasu, w jakim ta praca została wykonana to: ", "Moc", "Niuton", "Praca", "Wypadkowa", false, 0));
            pytania.add(new Questions("Energię kinetyczną liczymy wzorem: ", "E=mV<sup>2</sup>/2", "E=m/V<sup>2</sup>/2", "E=mV<sup>10</sup>/2", "E=mV<sup>2</sup>/5", false, 0));
            pytania.add(new Questions("Energię potencjalną liczymy wzorem: ", "E=mgh", "E=m/gh", "E=m+g+h", "E=m/g+h", false, 0));
            pytania.add(new Questions("Prawo powszechnego ciążenia określa się wzorem: ", "F=Gm1m2/r<sup>2</sup>", "F=Gm1m2/r", "F=Gm1+m2/r<sup>10</sup>", "F=Gm1+m2/r<sup>2</sup>", false, 0));
            pytania.add(new Questions("Jednostką pola grawitacyjnego jest: ", "N/kg", "kg/N", "kg*N", "kg+N", false, 0));
            pytania.add(new Questions("Pole wytwarzane przez obiekty posiadające masę jest to: ", "Pole grawitacyjne", "Pole elektryczne", "Pole masy", "Pole magnetyczne", false, 0));



        }
        if (level.equals("Trudny")) {
            pytania.add(new Questions("Równanie zależności x(t) w ruchu jednostajnie przyspieszonym prostoliniowym to: ", "x=x0+vV0t+at<sup>2</sup>/2", "x=x0+vV0t/at<sup>2</sup>/2", "x=x0+vV0t*at<sup>2</sup>/2", "x=x0+vV0t-at<sup>2</sup>/2", false, 0));
            pytania.add(new Questions("W spadku swobodnym czas spadania t z wysokości h możemy obliczyć wzorem: ", "t=sqrt(2h/g)", "t=sqrt(4h/g)", "t=sqrt(h/g)", "t=sqrt(3h/g)", false, 0));
            pytania.add(new Questions("Zasięg rzutu poziomego przedstawia wzór: ", "Z=V0sqrt(2h/g)", "Z=V0sqrt(h/g)", "Z=V0sqrt(-h/g)", "Z=V0sqrt(3h/g)", false, 0));
            pytania.add(new Questions("Maksymalny zasięg rzutu ukośnego otrzymamy pod kątem: ", "45 stopni", "60 stopni", "55 stopni", "40 stopni", false, 0));
            pytania.add(new Questions("Częstotliwość obliczamy wzorem: ", "f=omega/2pi", "f=omega*pi", "f=omega*2pi", "f=omega/pi", false, 0));
            pytania.add(new Questions("Szybkość kątową obliczamy wzorem: ", "omega=Δa/Δt", "omega=Δa*Δt", "omega=Δa+Δt", "omega=Δa-Δt", false, 0));
            pytania.add(new Questions("Przyspieszenie dośrodkowe liczymy wzorem: ", "a=V<sup>2</sup>/r", "a=V<sup>2</sup>-r", "a=V<sup>2</sup>+r", "a=V<sup>2</sup>*r", false, 0));
            pytania.add(new Questions("Przyspieszenie dośrodkowe liczymy wzorem: ", "a=omega<sup>2</sup>r", "a=omega<sup>2</sup>-r", "a=omega<sup>2</sup>/r", "a=omega<sup>2</sup>+r", false, 0));
            pytania.add(new Questions("Układ ciał, na którego nie działają żadne siły zewnętrzne to: ", "Układ odosobniony", "Układ samotny", "Układ idealny", "Układ jedynkowy", false, 0));
            pytania.add(new Questions("Stała grawitacyjna w przybliżeniu wynosi: ", "6,67*10<sup>-11</sup>", "6,67*10<sup>11</sup>", "6,67*1<sup>-11</sup>", "6,67*1<sup>11</sup>", false, 0));
            pytania.add(new Questions("Kiedy urodził się Isaac Newton?", "1642", "1707", "1805", "1847", false, 0));
            pytania.add(new Questions("Kiedy urodził się Leonhard Euler", "1707", "1805", "1642", "1617", false, 0));
            pytania.add(new Questions("Kiedy urodził się William Hamilton?", "1805", "1707", "1642", "1717", false, 0));
            pytania.add(new Questions("Jak nazywa się praca Isaaca Newton dotycząca grawitacji?", "'De motu corporum'", "'De motus corporu'", "Demotu corporum", "De mo corpo", false, 0));
            pytania.add(new Questions("Co przedstawia poniższy wzór?", "Równanie Eulera-Lagrange'a", "Hamiltionian", "Równanie Newtona", "Równanie Hamiltona", true, R.drawable.euler_lagrange));
            pytania.add(new Questions("Co przedstawia poniższy wzór?", "Równanie Eulera-Lagrange'a", "Hamiltionian", "Równanie Newtona", "Równanie Hamiltona", true, R.drawable.rownanie_eulera_lagrange));
            pytania.add(new Questions("Co przedstawia poniższy wzór?", "Równanie Hamiltona", "Hamiltionian", "Równanie Newtona", "Równanie Eulera-Lagrange'a", true, R.drawable.rownanie_hamiltona));
            pytania.add(new Questions("Co przedstawia poniższy wzór?", "Równanie Newtona", "Hamiltionian", "Równanie Eulera-Lagrange'a", "Równanie Hamiltona", true, R.drawable.rownanie_newtona));
            pytania.add(new Questions("Co to jest?", "Hamiltionian", "Równanie Newtona", "Równanie Hamiltona", "Równanie Eulera-Lagrange'a", true, R.drawable.hamiltionan));
            pytania.add(new Questions("Kto wymyślił kwateriony?", "Hamilton", "Newton", "Euler", "Lagrange", false, 0));
            pytania.add(new Questions("Poniższy wzór jest na energię dla", "Oscylatora harmonicznego", "Oscylatora nieharmonicznego", "Oscylatora", "Oscylatora aharmonicznego", true, R.drawable.oscylator_harmoniczny));
            pytania.add(new Questions("Kiedy urodził się Arystoteles?", "384 p.n.e", "XX wiek p.n.e", "700 p.n.e", "4 p.n.e", false, 0));
            pytania.add(new Questions("Kiedy urodził się Archimedes?", "około 287-212 p.n.e", "około 1000-950 p.n.e", "około 50-30 p.n.e", "około 500-450 p.n.e", false, 0));
            pytania.add(new Questions("Kiedy urodził się Galileusz?", "1564", "1645", "1654", "1546", false, 0));
            pytania.add(new Questions("Kiedy urodził się Clapeyron?", "1799", "1864", "1800", "1860", false, 0));
            pytania.add(new Questions("Kto powiedział: 'Dajcie mi punkt podparcia, a poruszę Ziemię'", "Archimedes", "Arystoteles", "Newton", "Sokrates", false, 0));


        }

    }

    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
