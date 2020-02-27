package infoshareacademy;

import java.util.LinkedHashSet;
import java.util.Set;

public class TaskC {
/*
aż się prosi zrobić regexem, ale wtedy metoda nie będzie potrzebować żadnej z wymaganych w zadaniu struktur:
Tablica/Lista/Set/Mapa, dlatego zrobiłem naokoło z wykorzystaniem Seta.
no chyba że bezczelnie wrzucę wynik operacji .matches w mapę albo listę tylko po to, żeby z niej wyprintować wynik
- ale to bez sensu xD.
na dole zakomentowałem checkisRepeatingLetters wykorzystującą regex, ale bez implementacji wymaganych struktur
*/

    public static Boolean isAnyLetterRepeated(String name) {

        Set<Character> uniqueLetters = new LinkedHashSet<>();
        for (int i = 0; i < name.length(); i++) {
            uniqueLetters.add(name.toLowerCase().charAt(i));
        }
        String uniqueLettersOnlyString = "";
        for (Character c : uniqueLetters) {
            uniqueLettersOnlyString = uniqueLettersOnlyString.concat(c.toString());
        }
        return !name.equalsIgnoreCase(uniqueLettersOnlyString);

    }

    public static void printSolution(String name) {
        System.out.println(name + ", " + isAnyLetterRepeated(name));
    }

//    public static Boolean checkIsRepeatingLetters (String string) {
//        Boolean isRepeating = string.toUpperCase().matches("^.*(.).*\\1.*$");
//        System.out.println(string + ", " + isRepeating);
//        return isRepeating;
//    }
}
