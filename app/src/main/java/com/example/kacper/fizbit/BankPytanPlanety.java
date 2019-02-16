package com.example.kacper.fizbit;

import java.util.ArrayList;

/**
 * Created by Kacper on 16.02.2019.
 */

public class BankPytanPlanety {
    ArrayList<Questions> pytania = new ArrayList<>();

    public BankPytanPlanety(String level) {

        if (level.equals("Latwy")) {
            pytania.add(new Questions("Ile planet ma układ słoneczny?", "8", "15", "7", "9", false, 0));
            pytania.add(new Questions("Pierwsza planeta od Słońca to:", "Merkury", "Wenus", "Ziemia", "Mars", false, 0));
            pytania.add(new Questions("Druga planeta od Słońca to:", "Wenus", "Merkury", "Ziemia", "Mars", false, 0));
            pytania.add(new Questions("Trzecia planeta od Słońca to:", "Ziemia", "Wenus", "Merkury", "Mars", false, 0));
            pytania.add(new Questions("Czwarta planeta od Słońca to:", "Mars", "Wenus", "Ziemia", "Merkury", false, 0));
            pytania.add(new Questions("Piąta planeta od Słońca to:", "Jowisz", "Saturn", "Pluton", "Uran", false, 0));
            pytania.add(new Questions("Szósta planeta od Słońca to:", "Satun", "Jowisz", "Pluton", "Uran", false, 0));
            pytania.add(new Questions("Siódma planeta od Słońca to:", "Uran", "Saturn", "Pluton", "Neptun", false, 0));
            pytania.add(new Questions("Ósma planeta od Słońca to:", "Neptun", "Saturn", "Pluton", "Uran", false, 0));
            pytania.add(new Questions("Dziewiąta planeta od Słońca to:", "W układzie słonecznym nie ma dziewiątej planety", "Pluton", "Europa", "Uran", false, 0));
            pytania.add(new Questions("W którym roku uznano że Pluton nie jest planetą?", "2006", "2000", "Pluton jest planetą", "2016", false, 0));
            pytania.add(new Questions("Jak nazywana jest Galaktyka w której znajduje się nasz Układ Słoneczny", "Droga Mleczna", "Ścieżka Mleka", "Autostrada Mleczna", "Pas Oriona", false, 0));
            pytania.add(new Questions("Kiedy można dojrzeć Merkurego 'gołym okiem'?", "Przed wschodem/po zachodzie Słońca", "Nie można ujrzeć planety 'gołym okiem'", "O północy każdego dnia", "W południe, 24 Czerwca", false, 0));
            pytania.add(new Questions("Jaka planeta jest najmniejsza w Układzie Słonecznym?", "Merkury", "Ziemia", "Mars", "Jowisz", false, 0));
            pytania.add(new Questions("Jaki jest najjaśniejszy obiekt widziany z Ziemi? (w czasie dnia)", "Słońce", "Księżyc", "Wenus", "Mars", false, 0));
            pytania.add(new Questions("Jaki jest najjaśniejszy obiekt widziany z Ziemi? (podczas nocy)", "Księżyc", "Słońce", "Wenus", "Mars", false, 0));
            pytania.add(new Questions("Jaki jest trzeci najjaśniejszy obiekt widziany z Ziemi? (w czasie dnia)", "Wenus", "Księżyc", "Słońce", "Mars", false, 0));
            pytania.add(new Questions("Jaki jest trzeci najjaśniejszy obiekt widziany z Ziemi? (w czasie nocy)", "Jowisz", "Księżyc", "Słońce", "Mars", false, 0));
            pytania.add(new Questions("Kiedy można dojrzeć Wenus 'gołym okiem'?", "3h przed wschodem Słońca/po zachodzie Słońca", "Nie można ujrzeć planety 'Gołym okiem'", "O północy każdego dnia", "W południe, 12 Luty", false, 0));
            pytania.add(new Questions("Ile waży Ziemia?", "5,97219×10<sup>24</sup> kg", "5,97219×10<sup>24</sup> ton", "5,97219×10<sup>55</sup> kg", "-5,97219×10<sup>24</sup> kg", false, 0));
            pytania.add(new Questions("Ile naturalnych satelich posiada Ziemia?", "1", "2", "3", "0", false, 0));
            pytania.add(new Questions("Jak dawno temu powstał Układ Słoneczny", "Około 4,6 miliarda lat", "Około 10 miliardów lat", "6 000 lat", "Nie można tego obliczyć", false, 0));
            pytania.add(new Questions("Która planeta jest największa w Układzie Słonecznym?", "Jowisz", "Neptun", "Pluton", "Saturn", false, 0));
            pytania.add(new Questions("Która planeta posiada 'pierścienie'", "Saturn", "Neptun", "Uran", "Jowisz", false, 0));
            pytania.add(new Questions("Jaka jest druga największa planeta w Układzie Słonecznym?", "Saturn", "Uran", "Jowisz", "Mars", false, 0));
            pytania.add(new Questions("Jaka jest trzecia największa planeta w Układzie Słonecznym?", "Uran", "Jowisz", "Saturn", "Mars", false, 0));
            pytania.add(new Questions("Która planeta została odkryta jako pierwsza w czasach nowożytnych?", "Uran", "Pluton", "Neptun", "Wszystkie planety znane są od starożytności", false, 0));
            pytania.add(new Questions("Jaka planeta jest ostatnia pod względem odkrycia?", "Neptun", "Uran", "Jowisz", "Ziemia", false, 0));
            pytania.add(new Questions("Którą planete 'odkryto' na podstawie obliczeń matematycznych a nie obserwacji?", "Neptun", "Saturn", "Uran", "Żadnej", false, 0));
            pytania.add(new Questions("Ile wynosi obwód Ziemie", "40 075,014 km ", "100 123 km", "1,75 mln km", "100 000 000 km", false, 0));
            pytania.add(new Questions("Ile wynosi przyspieszenie Ziemskie?", "9,80665 m/s²", "-9,80665 m/s²", "5,80665 m/s²", "20,80665 m/s²", false, 0));

        }
        if (level.equals("Sredni")) {
            pytania.add(new Questions("Ile łącznie jest księżyców w Układzie Słonecznym?", "185", "1211", "38", "500", false, 0));
            pytania.add(new Questions("Ile planet karł karłowatych jest w Układzie Słonecznym?", "5", "4", "3", "15", false, 0));
            pytania.add(new Questions("Ile wynosi masa Jowisza względem Słońca?", "1/1000", "1/10", "2.5", "100", false, 0));
            pytania.add(new Questions("Ile wynosi masa Jowisza względem mas WSZYSTKICH innych planet?", "2,5", "10", "20", "0.8", false, 0));
            pytania.add(new Questions("Kiedy został odkryty Jowisz?", "Starożytność", "1781", "1827", "1930", false, 0));
            pytania.add(new Questions("Która planeta nie jest plutoidem?", "Ceres", "Haumea", "Makemake", "Eris", false, 0));
            pytania.add(new Questions("Która z planet karłowatych ma najwięcej księżyców? (5)", "Pluton", "Eris", "Makemake", "Haumea", false, 0));
            pytania.add(new Questions("Czy planety karłowate zaliczają się do planet?", "Nie", "Tak", "Zależy to od wielkości planety karlowatej", "Zależy to od masy planety karłowatej", false, 0));
            pytania.add(new Questions("Jak nazywa się największy satelita Pluton?", "Charon", "Makemake", "Oberon", "Ariel", false, 0));
            pytania.add(new Questions("Czym jest Ceres?", "Planetą karłowatą", "Planetą", "Satalitą", "Mini-Słońcem", false, 0));
            pytania.add(new Questions("Jak nazywa się największy księzyć Jowisza?", "Ganimedes", "Europa", "Io", "Kallisto", false, 0));
            pytania.add(new Questions("Jak nazywa się drugi największy księzyć Jowisza?", "Kallisto", "Europa", "Io", "Ganimedes", false, 0));
            pytania.add(new Questions("Jak nazywa się trzeci największy księzyć Jowisza?", "Io", "Europa", "Kallisto", "Ganimedes", false, 0));
            pytania.add(new Questions("Jak nazywa się czwarty największy księzyć Jowisza?", "Europa", "Io", "Kallisto", "Ganimedes", false, 0));
            pytania.add(new Questions("Jak nazywa się największy księżyc Saturna?", "Tytan", "Dione", "Japet", "Rea", false, 0));
            pytania.add(new Questions("Jak nazywa się drugi największy księżyc Saturna?", "Rea", "Dione", "Japet", "Tytan", false, 0));
            pytania.add(new Questions("Jak nazywa się trzeci największy księżyc Saturna?", "Japet", "Dione", "Rea", "Tytan", false, 0));
            pytania.add(new Questions("Jak nazywa się czwarty największy księżyc Saturna?", "Dione", "Japet", "Rea", "Tytan", false, 0));
            pytania.add(new Questions("Czym są Rea, Tytan, Japet, Dione?", "Gazowymi olbrzymami", "Planetami skalistymi", "Transneptunami", "Planetami karłowatymi", false, 0));
            pytania.add(new Questions("Czym są Ganimedes, Kallisto, Io, Europa?", "Gazowymi olbrzymami", "Planetami skalistymi", "Transneptunami", "Planetami karłowatymi", false, 0));
            pytania.add(new Questions("Czym są Pluton, Charon, Makemake, Eris?", "Transneptunami", "Planetami skalistymi", "Planetami karłowatymi", "Gazowymi olbrzymami", false, 0));
            pytania.add(new Questions("Kiedy odkryto Uran?", "1781", "1827", "1930", "W starożytności", false, 0));
            pytania.add(new Questions("Kiedy odkryto Merkury?", "W starożytności", "1781", "1930", "1846", false, 0));
            pytania.add(new Questions("Kiedy odkryto Wenus?", "W starożytności", "1846", "1781", "1930", false, 0));
            pytania.add(new Questions("Kiedy odkryto Mars?", "W starożytności", "1930", "1846", "1781", false, 0));
            pytania.add(new Questions("Kiedy odkryto Saturn?", "W starożytności", "1846", "1930", "1781", false, 0));
            pytania.add(new Questions("Kiedy odkryto Neptun?", "1846", "W starożytności", "1781", "1930", false, 0));
            pytania.add(new Questions("Kiedy odkryto Pluton?", "1930", "W starożytności", "1846", "1781", false, 0));
            pytania.add(new Questions("Ile jest, około, znany i ponumerowanych planetoid?", "Ok. 600 000", "Ok. milion", "Ok. 600", "Ok. 6 000", false, 0));
            pytania.add(new Questions("Ile planet posiada księżyce?", "6", "8", "5", "7", false, 0));
            pytania.add(new Questions("Ile planet karłowatych posiada księżyce", "3", "2", "1", "4", false, 0));
        }
        if (level.equals("Trudny")) {
            pytania.add(new Questions("Ile wynosi masa Merkurego", "3,3011×10<sup>23</sup> kg", "4,867×10<sup>24</sup kg", "1,89819×10<sup>27</sup> kg", "6,4171×10<sup>23</sup> kg", false, 0));
            pytania.add(new Questions("Ile wynosi masa Wenus", "4,867×10<sup>24</sup kg", "3,3011×10<sup>23</sup> kg", "1,89819×10<sup>27</sup> kg", "6,4171×10<sup>23</sup> kg", false, 0));
            pytania.add(new Questions("Ile wynosi masa Marsa", "6,4171×10<sup>23</sup> kg", "4,867×10<sup>24</sup kg", "3,3011×10<sup>23</sup> kg", "1,89819×10<sup>27</sup> kg", false, 0));
            pytania.add(new Questions("Ile wynosi masa Jowisza", "1,89819×10<sup>27</sup> kg", "6,4171×10<sup>23</sup> kg", "4,867×10<sup>24</sup kg", "3,3011×10<sup>23</sup> kg", false, 0));
            pytania.add(new Questions("Ile wynosi masa Saturna", "5,6834×10<sup>26</sup> kg", "8,6813×10<sup>25</sup> kg", "1,02413×10<sup>26</sup> kg", "1,89819×10<sup>27</sup> kg", false, 0));
            pytania.add(new Questions("Ile wynosi masa Neptuna", "1,02413×1026 kg", "8,6813×10<sup>25</sup> kg", "5,6834×10<sup>26</sup> kg", "1,89819×10<sup>27</sup> kg", false, 0));
            pytania.add(new Questions("Ile wynosi masa Uranu?", "8,6813×10<sup>25</sup> kg", "1,02413×1026 kg", "5,6834×10<sup>26</sup> kg", "1,89819×10<sup>27</sup> kg", false, 0));
            pytania.add(new Questions("Ile wynosi przyspieszenie grawitacyjne Merkurego", "3,70 m/s²", "8,87 m/s²", "3,71 m/s²", "24,79 m/s²", false, 0));
            pytania.add(new Questions("Ile wynosi przyspieszenie grawitacyjne Wenus", "8,87 m/s²", "3,70 m/s²", "3,71 m/s²", "24,79 m/s²", false, 0));
            pytania.add(new Questions("Ile wynosi przyspieszenie grawitacyjne Marsa", "3,71 m/s²", "3,70 m/s²", "8,87 m/s²", "24,79 m/s²", false, 0));
            pytania.add(new Questions("Ile wynosi przyspieszenie grawitacyjne Jowisza", "24,79 m/s²", "3,70 m/s²", "8,87 m/s²", "3,71 m/s²", false, 0));
            pytania.add(new Questions("Ile wynosi przyspieszenie grawitacyjne Saturna", "10,44 m/s²", "8,87 m/s²", "124 m/s²", "11,15 m/s²", false, 0));
            pytania.add(new Questions("Ile wynosi przyspieszenie grawitacyjne Neptuna", "11,15 m/s²", "8,87 m/s²", "157", "10,44 m/s²", false, 0));
            pytania.add(new Questions("Ile wynosi przyspieszenie grawitacyjne Uranu", "8,87 m/s²", "190", "11,15 m/s²", "10,44 m/s²", false, 0));
            pytania.add(new Questions("Ile wynosi stosunek średnicy równikowej Słońca w stosunku do Ziemi?", "109", "100", "1", "10", false, 0));
            pytania.add(new Questions("Ile wynosi procentowy skład atmosfery Merkurego?", "Tlen-42%, Sód-29% Wodów-22%, Hel-6%", "H-89,8%, He - 10,2%, Metan - 0,3%", "CO2 -95,32%, Azot- 2,7%, Argon - 1,6%, Tlen- 0,13%", "CO2 - 96,5%, Azot - 3,5%", false, 0));
            pytania.add(new Questions("Ile wynosi procentowy skład atmosfery Wenus?", "CO2 - 96,5%, Azot - 3,5%", "H-89,8%, He - 10,2%, Metan - 0,3%", "CO2 -95,32%, Azot- 2,7%, Argon - 1,6%, Tlen- 0,13%", "Tlen-42%, Sód-29% Wodów-22%, Hel-6%", false, 0));
            pytania.add(new Questions("Ile wynosi procentowy skład atmosfery Marsa?", "CO2 -95,32%, Azot- 2,7%, Argon - 1,6%, Tlen- 0,13%", "H-89,8%, He - 10,2%, Metan - 0,3%", "CO2 - 96,5%, Azot - 3,5%", "Tlen-42%, Sód-29% Wodów-22%, Hel-6%", false, 0));
            pytania.add(new Questions("Ile wynosi procentowy skład atmosfery Jowisza?", "H-89,8%, He - 10,2%, Metan - 0,3%", "CO2 -95,32%, Azot- 2,7%, Argon - 1,6%, Tlen- 0,13%", "CO2 - 96,5%, Azot - 3,5%", "Tlen-42%, Sód-29% Wodów-22%, Hel-6%", false, 0));
            pytania.add(new Questions("Ile wynosi procentowy skład atmosfery Neptuna?", "H-80%, He-19%", "H-96,3%, He-3,25%", "H-82,5%, He-15,2%, Metan-2,3", "H-89,8%, He - 10,2%, Metan - 0,3%", false, 0));
            pytania.add(new Questions("Ile wynosi procentowy skład atmosfery Uranu?", "H-82,5%, He-15,2%, Metan-2,3", "H-96,3%, He-3,25%", "H-80%, He-19%", "H-89,8%, He - 10,2%, Metan - 0,3%", false, 0));
            pytania.add(new Questions("Ile wynosi procentowy skład atmosfery Saturn?", "H-96,3%, He-3,25%", "H-82,5%, He-15,2%, Metan-2,3", "H-80%, He-19%", "H-89,8%, He - 10,2%, Metan - 0,3%", false, 0));
            pytania.add(new Questions("Ile % całej masy Układu Słonecznego należy do Słońca?", "99,86%", "75,77%", "17,25%", "50%", false, 0));
            pytania.add(new Questions("Jaki jest skład fotosfery Słońca?", "H-73,46%, He-24,85%, O-0,77%", "H-24,85%, He-73,46%, O-0,77%", "H-50,01%, He-49,99%", "H-95,46%, He-4,85%, O-0,77%", false, 0));
            pytania.add(new Questions("Z jaką prędkością Droga Mleczna porusza się w kierunku konstelacji Hydra?", "500km/s", "172 777 m/s", "1 rok świetlny", "500 000 000 m/s", false, 0));
            pytania.add(new Questions("Ile wynosi temperatura efektywna Słońca?", "5778K", "1000K", "70 000K", "6500 C", false, 0));
            pytania.add(new Questions("Kiedy Słońce osiąga peryhelium?", "W styczniu", "W lutym", "W marcu", "W grudniu", false, 0));
            pytania.add(new Questions("Kiedy Słońce osiąga aphelium?", "W lipcu", "W maju", "W czerwcu", "W sierpniu", false, 0));
            pytania.add(new Questions("Ile wynosi 1 jednostka astronomiczna (au)", "Około 150 mln km", "Około 15 mld km", "Około 15 mln km", "Około 150 mld km", false, 0));
            pytania.add(new Questions("Za ile mniej więcej Słońce zniszczy planety wewnętrzne?", "5 mld lat", "Miliard lat", "100 lat", "20 000 lat", false, 0));
        }


    }


    public ArrayList<Questions> getPytania() {
        return pytania;
    }

    public int getSize() {
        return pytania.size();
    }
}
