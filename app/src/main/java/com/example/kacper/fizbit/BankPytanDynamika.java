package com.example.kacper.fizbit;

import java.util.ArrayList;

/**
 * Created by Kacper on 16.02.2019.
 */

public class BankPytanDynamika {

    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytanDynamika(String level) {

        if (level.equals("Latwy")) {
            pytania.add(new Questions("Jaki zakres temperatur mierzy termometr rtęciowy?", "-38C do 356C", "-50 do 50", "-100 do 100", "-272 do 60", false, 0));
            pytania.add(new Questions("W ilu stopniach woda zamarza według skali Celsjusza?", "0", "-1", "1", "-10", false, 0));
            pytania.add(new Questions("W ilu stopniach woda zamarza według skali Farenheita?", "32", "0", "150", "-32", false, 0));
            pytania.add(new Questions("W ilu stopniach woda wrze według skali Celsjusza? (nie uwzględniając ciśnienia)", "100", "80", "90", "110", false, 0));
            pytania.add(new Questions("W ilu stopniach woda wrze według skali Farenheita? (nie uwzględniając ciśnienia)", "212", "152", "102", "302", false, 0));
            pytania.add(new Questions("Ile wynosi normalna temperatura ciała człowieka w C", "Około 37", "42", "54", "27.5", false, 0));
            pytania.add(new Questions("Ile wynosi normalna temperatura ciała człowieka w F", "98.6", "32", "105.10", "44.6", false, 0));
            pytania.add(new Questions("W ilu kelwinach woda zamarza według skali Kelwina?", "273", "373", "173", "73", false, 0));
            pytania.add(new Questions("W ilu kelwinach woda wrze według skali Kelwina?", "373", "273", "173", "73", false, 0));
            pytania.add(new Questions("Uszereguj podane temperature od najwyższej do najniższej: 0 C,0 F,260 K", "0 C,260 K, 0 F", "0C, 0F, 260K", "260K, 0F, 0C", "0F, 260K, 0C", false, 0));
            pytania.add(new Questions("Ciało doświadcza rozszerzalności cieplnej gdy:", "Jego temperatura zmienia się", "Jego temperatura jest stała", "Jego temperatura maleje", "Jego temperatura rośnie", false, 0));
            pytania.add(new Questions("Co dzieje się z podgrzanymi ciałami?", "Rozszerzają się", "Kurczą", "Nic", "Zmieniają masę", false, 0));
            pytania.add(new Questions("Co dzieje się z schłodzonymi ciałami?", "Kurczą", "Rozszerzają się", "Nic", "Zmieniają masę", false, 0));
            pytania.add(new Questions("Co to jest zmiana fazy?", "Przejście z jednej fazy do innej", "Zmiana prądu", "Nie można zmieniać faz", "Wpadnięcie w odpowiedni nastrój", false, 0));
            pytania.add(new Questions("W ilu fazach jest woda?", "3 - ciecz, para wodna i lód", "2 - ciecz i para wodna", "1 - ciecz", "4 - ciecz, para wodna, lódm plazma", false, 0));
            pytania.add(new Questions("Co zachodzi pomiędzy ciałami które są w bezpośrednim kontakcie?", "Przewodnictwo cieplne", "Nic", "Przeniesienie problemów", "Dotyk", false, 0));
            pytania.add(new Questions("Energia termiczna jest ptransportowana dzięki ruchom molekuł z jednego obszaru do drugiego - mowa tu o:", "Konwekcji", "Koncesji", "Koneksji", "Konsekwencji", false, 0));
            pytania.add(new Questions("Jakie fale emitują wszystkie ciała?", "Podczerwieni, widzialne, nadfiolet", "Ultrafiole, nadfiolet, widzialne", "Tylko widzialne", "Tylko podczerwieni", false, 0));
            pytania.add(new Questions("Poniższa stała to inaczej", "Liczba Avagardo", "Liczba Newtona", "Stała molowa", "Wzór na ilośc moli", true, R.drawable.liczba_avagardo));
            pytania.add(new Questions("Poniższy wzór to wzór na ", "Stan gazu doskonałego", "Objętość", "Objętośc przedmiotu", "Liczbę moli", true, R.drawable.stan_gazu_doskonalego));
            pytania.add(new Questions("Jakie wielkości opisują gaz?", "Ciśnienie, objętość, temperatura", "Prędkość, waga, zawartośc tlenu", "Stan fazowy, prędkość, objętość", "Ciśnienie, skład chemiczny, napięcie", false, 0));
            pytania.add(new Questions("Jak nazywa się woda w stanie fazowym stałym?", "Lód", "Woda", "Para Wodna", "Woda nie może być w takim stanie", false, 0));
            pytania.add(new Questions("Jak nazywa się woda w stanie fazowym ciekłym?", "Woda", "Lód", "Para Wodna", "Woda nie może być w takim stanie", false, 0));
            pytania.add(new Questions("Jak nazywa się woda w stanie fazowym gazowym?", "Para wodna", "Woda", "Para Wodna", "Woda nie może być w takim stanie", false, 0));
            pytania.add(new Questions("Popcorn w garnku to", "Układ termodynamiczny", "Zdrowa przekąska", "Układ analizy gazu", "Nie ma nic wspólnego z fizyką", false, 0));
            pytania.add(new Questions("Urządzenie przekształcające ciepło w pracę to?", "Silnik cieplny", "Silnik elektryczny", "Piec", "Kaloryfer", false, 0));
            pytania.add(new Questions("Stosunek zużytej energii do energi wykorzystanej do wykonania pracy to:", "Wydajność", "Produktywność wzorcowa", "Zużycie zasobów", "Ekonomia", false, 0));
            pytania.add(new Questions("Urządzenie pobierające ciepło z zbiornika zimna i je wykorzystujące to", "Lodówka", "Silnik elektryczny", "Piekarnik", "Silnik cieplny", false, 0));
            pytania.add(new Questions("Czy istnieje zjawisko przez które obiekt spontaniczne opuści stan równowagi?", "Nie", "Tak", "Tak, ale tylko w próżni", "Tak, jeśli nie będzie w próżni", false, 0));
            pytania.add(new Questions("Określeniem na zjawiska nieuporządkowane, spontaniczne i losowe jest:", "Entropia", "Entropizm", "Eugenika", "Etiopia", false, 0));

        }
        if (level.equals("Sredni")) {
            pytania.add(new Questions("Gdy podgrzejesz dwa identyczne pręty o różnych długościach (1m,2m) to gdy jednemu zwiększy się długość o L to drugiemu", "2L", "(L+L)/2", "L<sup>2</sup>", "Długość zwiększy się o 2<sup>5</sup>L", false, 0));
            pytania.add(new Questions("Przemiana podczas której izolowany układ nie nawiązuje wymany ciepła lecz energia jest dostarczana/odbierana jako praca to", "Przemiana adiabatyczna", "Przemiana izobaryczna", "Przemiana izochoryczna", "Przemiana izotermiczna", false, 0));
            pytania.add(new Questions("Proces termodynamiczny, podczas którego ciśnienie układu nie ulega zmianie, natomiast pozostałe parametry termodynamiczne czynnika mogą się zmieniać", "Przemiana izobaryczna", "Przemiana izochoryczna", "Przemiana izotermiczna", "", false, 0));
            pytania.add(new Questions("Proces termodynamiczny zachodzący przy stałej objętości (V = const) to", "Przemiana izochoryczna", "Przemiana adiabatyczna", "Przemiana izobaryczna", "Przemiana izotermiczna", false, 0));
            pytania.add(new Questions("Przemiana, zachodząca przy określonej, stałej temperaturze to:", "Przemiana izotermiczna", "Przemiana adiabatyczna", "Przemiana izobaryczna", "Przemiana izochoryczna", false, 0));
            pytania.add(new Questions("Poniższy wzór przedstawia", "Ciepło właściwe gazu doskonałego", "Wzór na gaz doskonały", "Ciepło właściwe", "Ciepło właściwe gazu niedoskonałego", true, R.drawable.cieplo_wlasciwe_gazu));
            pytania.add(new Questions("'Zwrócone ciepło można oddać do ciała gorącego i ponownie wykorzystać' jest to opis:", "Idealnej lodówki", "Lodówki i zamrażalnika", "Idealnego ciała czarnego", "Zwykłego silnika", false, 0));
            pytania.add(new Questions("Poniższy wzór przedstawia:", "Przepływ ciepła", "Przepływ temperatury przez wysokośc", "", "", true, R.drawable.przeplyw_ciepla));
            pytania.add(new Questions("Ile wynosiła temperatura wszechświata na początku?", "10<sup>39</sup>", "10<sup>8</sup>", "10<sup>4</sup>", "10<sup>6</sup>", false, 0));
            pytania.add(new Questions("Ile wynosi temperatura Słońca?", "10<sup>6</sup>", "10<sup>8</sup>", "10<sup>4</sup>", "10<sup>39</sup>", false, 0));
            pytania.add(new Questions("Ile wynosi na powierzchni Słońca?", "10<sup>4</sup>", "10<sup>8</sup>", "10<sup>6</sup>", "10<sup>39</sup>", false, 0));
            pytania.add(new Questions("Ile wynosi najwyższa temperatura osiągnięta w laboratorium?", "10<sup>8</sup>", "10<sup>4</sup>", "10<sup>6</sup>", "10<sup>39</sup>", false, 0));
            pytania.add(new Questions("Czym fizycznie jest temperatura?", "To opis ilość gorąca/zimna", "Odnosi się ona do transportu energii", "Różnicą cieplną", "Iloczynem ciepła", false, 0));
            pytania.add(new Questions("Czym jest ciepło?", "Transportem energii", "Temperaturą", "Wielkością fizyczna dotyczącą prędkości ", "", false, 0));
            pytania.add(new Questions("Jak nazywa się ilość ciepła potrzebna do wzrostu temperatury 1g wody z 14.5C do 15.5C?", "kcal", "dżul", "Entropia", "Ogrzanie", false, 0));
            pytania.add(new Questions("Ile wynosi 1cal?", "4.186 J", "5.121 J", "17 822 J", "7 500 J", false, 0));
            pytania.add(new Questions("Poniższy wzór jest na:", "Pojemność ciepłą przedmiotu", "Ciepło właściwe", "Moc przedmiotu", "Temperaturę właściwą przedmiotu", true, R.drawable.pojemnosc_ciepla));
            pytania.add(new Questions("Poniższy wzór jest na:", "Ciepło właściwe", "Pojemność ciepłą przedmiotu", "Moc przedmiotu", "Temperaturę właściwą przedmiotu", true, R.drawable.cieplo_wlasciwe));
            pytania.add(new Questions("Poniższa wartośc odnosi się do:", "Molowego ciepła właściwego", "Ciepła właściwego ćmy", "Molowej pojemności ciepła właściwego", "Nie istnieje taka wartość", true, R.drawable.molowe_cieplo_wlasciwe));
            pytania.add(new Questions("Jakie promieniowanie emitują ciała w temperaturze pokojowej?", "Podczerwone", "Ultrafioletowe", "Alfa", "Beta", false, 0));
            pytania.add(new Questions("Poniższe równanie pozwala na:", "Przeliczenie C na F", "Zmianę temperatury", "Obliczenie Kelwinów", "Przeliczenie F na C", true, R.drawable.celsjusz_do_fahrenheita));
            pytania.add(new Questions("Poniższe równanie pozwala na:", "Przeliczenie F na C", "Zmianę temperatury", "Obliczenie Kelwinów", "Przeliczenie F na C", true, R.drawable.fahrenheit_na_celsjusz));
            pytania.add(new Questions("Wszystkie gazy osiągają zerowe ciśnienie w:", "0K", "100K", "200K", "-100K", false, 0));
            pytania.add(new Questions("Poniższy wzór przedstawia:", "Zmianę długości przedmiotu z zmianą temperatury", "Zmianę temperatury", "Zmianę przedmiotu", "Zmiane długości z powodu upływu czasy", true, R.drawable.zmiana_dlugosci_preta));
            pytania.add(new Questions("Z czego składa się pasek bimetaliczny?", "Z dwóch metali", "Z dwóch pierwiastków (np Hel i Żelazo)", "Z czekolwiek chce", "Z metalu mającego dwuiste zastosowania", false, 0));
            pytania.add(new Questions("Z czego składa się gaz idealny?", "Z pojedynczych atomów", "Z wodoru i azotu", "Z gazów szlachetnych", "Z wielu atomów pod wysokim ciśnieniem", false, 0));
            pytania.add(new Questions("Jakim procesem jest otwarcie butelki? (w kontekście entropii)", "Nieodwracalnym", "Mieszanym", "Zależy od środowiska", "Odwracalnym", false, 0));
            pytania.add(new Questions("Jakim procesem jest roztopienie kostki lodu? (w kontekście entropii)", "Odwracalnym", "Mieszanym", "Zależy od środowiska", "Nieodwracalnym", false, 0));
            pytania.add(new Questions("Co zmienia się w procesie termodynamicznym?", "Objętość, ciśnienie albo temperatura", "Proporcje procentowe pierwiastków ", "Wszystko", "Prędkość, czas albo konstyntencja", false, 0));
            pytania.add(new Questions("Im większy jest przekrój przedmiotu tym jego przewodnictwo cieplne", "Jest mniejsze", "Jest większe", "Niezależy od przekroju", "Jest stałe", false, 0));

        }
        if (level.equals("Trudny")) {

            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla diamentu", "900-2320k[W/(m*K)]", "429k[W/(m*K)]", "317k[W/(m*K)]", "110k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla srebra", "429k[W/(m*K)]", "317k[W/(m*K)]", "110k[W/(m*K)]", "900-2320k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla złota", "317k[W/(m*K)]", "110k[W/(m*K)]", "429k[W/(m*K)]", "900-2320k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla mosiądza", "110k[W/(m*K)]", "429k[W/(m*K)]", "317k[W/(m*K)]", "900-2320k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla stali", "58k[W/(m*K)]", "0,8[W/(m*K)]", "0,6k[W/(m*K)]", "1,7k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla żelbetu", "1,7k[W/(m*K)]", "58k[W/(m*K)]", "0,8k[W/(m*K)]", "0,6k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla cegły", "0,8k[W/(m*K)]", "1,7k[W/(m*K)]", "0,6k[W/(m*K)]", "1,7k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla wody", "0,6k[W/(m*K)]", "0,8k[W/(m*K)]", "1,7k[W/(m*K)]", "1,7k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla gipsu", "0,51k[W/(m*K)]", "0.017k[W/(m*K)]", "0.0360[W/(m*K)]", "0,2k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla drewna", "0,2k[W/(m*K)]", "", "0.0360k[W/(m*K)]", "0,51k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla styropianu", "0.036k[W/(m*K)]", "0.017k[W/(m*K)]", "0,2k[W/(m*K)]", "0,51k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik przewodnictwa cieplnego dla aerożelu", "0.017k[W/(m*K)]", "0.0360,2k[W/(m*K)]", "0,2k[W/(m*K)]", "0,51k[W/(m*K)]", false, 0));
            pytania.add(new Questions("Który silnik cieplny ma najwyższą wydajność?", "Silnik pobierający 400J i wydzielający 2800J ciepła", "Silnik pobierający 50 000j i wydzielający 28J ciepła", "Silnik pobierający 5000J i wydzielający 4500J ciepła", "Silnik pobierający 500J i wydzielający 2800J ciepła", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik rozszerzalności liniowej dla ołowiu", "29x10<sup>-10</sup> K<sup>-1</sup>", "19x10<sup>-10</sup> K<sup>-1</sup>", "12x10<sup>-10</sup> K<sup>-1</sup>", "11x10<sup>-10</sup> K<sup>-1</sup>", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik rozszerzalności liniowej dla mosiądzu", "19x10<sup>-10</sup> K<sup>-1</sup>", "11x10<sup>-10</sup> K<sup>-1</sup>", "12x10<sup>-10</sup> K<sup>-1</sup>", "29x10<sup>-10</sup> K<sup>-1</sup>", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik rozszerzalności liniowej dla żelaza", "12x10<sup>-10</sup> K<sup>-1</sup>", "11x10<sup>-10</sup> K<sup>-1</sup>", "19x10<sup>-10</sup> K<sup>-1</sup>", "29x10<sup>-10</sup> K<sup>-1</sup>", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik rozszerzalności liniowej dla szkła", "11x10<sup>-10</sup> K<sup>-1</sup>", "12x10<sup>-10</sup> K<sup>-1</sup>", "19x10<sup>-10</sup> K<sup>-1</sup>", "29x10<sup>-10</sup> K<sup>-1</sup>", false, 0));
            pytania.add(new Questions("Ile wynosi współczynnik rozszerzalności liniowej dla kwarcu", "0.5x10<sup>-10</sup> K<sup>-1</sup>", "12x10<sup>-10</sup> K<sup>-1</sup>", "19x10<sup>-10</sup> K<sup>-1</sup>", "29x10<sup>-10</sup> K<sup>-1</sup>", false, 0));
            pytania.add(new Questions("Ile wynosi ciepło właściwe miedzi [J/kg] * K", "390", "470", "2100", "4190", false, 0));
            pytania.add(new Questions("Ile wynosi ciepło właściwe żelaza [J/kg] * K", "470", "390", "2100", "4190", false, 0));
            pytania.add(new Questions("Ile wynosi ciepło właściwe wody [J/kg] * K", "4190", "2100", "390", "470", false, 0));
            pytania.add(new Questions("Ile wynosi ciepło właściwe lodu[J/kg] * K", "2100", "4190", "390", "470", false, 0));
            pytania.add(new Questions("Ile wynosi ciepło właściwe soli [J/kg] * K", "879", "4190", "470", "390", false, 0));
            pytania.add(new Questions("Jaką temperaturę topnienia ma azot", "63,18K", "600,5K", "273,15K", "1356K", false, 0));
            pytania.add(new Questions("Jaką temperaturę topnienia ma ołów", "600,5K", "63,18K", "273,15K", "1356K", false, 0));
            pytania.add(new Questions("Jaką temperaturę topnienia ma woda", "273,15K", "600,5K", "63,18K", "1356K", false, 0));
            pytania.add(new Questions("Jaką temperaturę topnienia ma miedź", "1356K", "600,5K", "63,18K", "273,15K", false, 0));
            pytania.add(new Questions("Jaką temperaturę wrzenia ma tlen", "90,18K", "2466K", "717,75K", "351K", false, 0));
            pytania.add(new Questions("Jaką temperaturę wrzenia ma etanol", "351K", "90,18K", "2466K", "717,75K", false, 0));
            pytania.add(new Questions("Jaką temperaturę wrzenia ma siarka", "717,75K", "90,18K", "2466K", "351K", false, 0));
            pytania.add(new Questions("Jaką temperaturę wrzenia ma srebro", "2466K", "90,18K", "717,75K", "351K", false, 0));

        }

    }

    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
