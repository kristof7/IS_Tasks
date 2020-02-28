package infoshareacademy;

import java.util.HashSet;
import java.util.Set;

public class TaskC {

//    Stwórz metodę, która przyjmuje parametr String (imię) i zwraca wartość logiczną true/false.
//    Metoda sprawdza, czy w danym parametrze (imieniu) powtarza się jakaś litera (ignoruj wielkość znaków)
//    jeśli tak, to zwraca true
//    jeśli nie, to zwraca false
//    Wypisz wynik w postaci imię – wynikMetody np.:
//    Adam, true
//    Jan, false
//    Metoda powinna wykorzystywać jedną z poznanych struktur danych:
//    Tablica/Lista/Set/Mapa - wybierz najlepszą do tego celu

    public static boolean checkLetter(String name) {
        int letterSum = 0;
        String sweetName = name.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sweetName.length(); i++) {
            if (!set.contains(sweetName.charAt(i))) {
                letterSum = letterSum + 1;
            }
            set.add(sweetName.charAt(i));
        }
        return !(letterSum == sweetName.length());
    }
}
