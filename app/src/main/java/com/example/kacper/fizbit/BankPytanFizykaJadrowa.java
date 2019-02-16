package com.example.kacper.fizbit;

import java.util.ArrayList;

/**
 * Created by Kacper on 16.02.2019.
 */

public class BankPytanFizykaJadrowa {
    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytanFizykaJadrowa(String level) {
        if (level.equals("Latwy")) {

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
            pytania.add(new Questions("Co przedstawia poniższy obrazek?", "Nieskończoną studnie kwantową", "Skończoną studnie", "Zależność przyspieszenia a prędkości", "Nieskończoną studnie potencjału", true, R.drawable.kwantowa_studnia_potencjalu));

        }
    }


    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
