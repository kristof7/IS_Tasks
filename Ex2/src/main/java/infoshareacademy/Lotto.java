package infoshareacademy;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Lotto {
    public static void start() throws InterruptedException, IOException {

        int i = 1;
        int poczatekZakresu = 1;
        int koniecZakresu = 0;
        int iloscLiczbDoWylosowania = 0;
        boolean licznik = false;
        boolean licznik2 = false;
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm");
        Date date = new Date();
        String data = formatter.format(date);

        ArrayList<Integer> wynikLosowania = new ArrayList<>();
        while(!licznik) {
            Scanner wartosciLiczb1 = new Scanner(System.in);
            try {
                System.out.print("Podaj koniec zakresu : ");
                koniecZakresu = wartosciLiczb1.nextInt();
                licznik = true;
            } catch (Exception e) {
                System.out.println("bledna wartosc, podaj prawidlowa : ");
            }
        }
        licznik = false;

        while(!licznik) {
            Scanner wartosciLiczb2 = new Scanner(System.in);
            try {
                while(!licznik2) {
                    System.out.print("Podaj ilosc liczb : ");
                    iloscLiczbDoWylosowania = wartosciLiczb2.nextInt();
                    if (koniecZakresu >= iloscLiczbDoWylosowania) {
                        licznik2 = true;
                    }else {
                        System.out.println("ilosc liczb wieksza niz zakres, wybierz ponownie");
                    }
                }
                licznik = true;
            } catch (Exception e) {
                System.out.println("bledna wartosc, podaj prawidlowa : ");
            }
        }

        System.out.println("Hokus pokus czary mary...");

        while (i <= iloscLiczbDoWylosowania) {
            int randomNum = ThreadLocalRandom.current().nextInt(poczatekZakresu, koniecZakresu+1);
            boolean istniejeLiczba = wynikLosowania.contains(randomNum);

            if (!istniejeLiczba) {
                System.out.println(randomNum);
                wynikLosowania.add(randomNum);
                i++;
                TimeUnit.SECONDS.sleep(1);
            }
        }

        System.out.println("===========POSORTOWANE===========");

        try (PrintWriter plikZlosowaniem = new PrintWriter("wynik_losowania_"+data+".txt")) {
            plikZlosowaniem.println("Wynik losowania z dnia "+data+":");
            Collections.sort(wynikLosowania);
            for (Integer a : wynikLosowania) {
                System.out.println(a);
                plikZlosowaniem.print(a+",");
            }
        }
        System.out.println("Wynik losowania zapisany do pliku : "+"wynik_losowania_"+data+".txt");
    }
}
