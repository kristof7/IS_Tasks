package infoshareacademy;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

class Lotto {


    static void randomLotto() {
            Scanner scanner1 = new Scanner(System.in);
            out.println("Ile liczb chcesz uzyskać??");
            try {
                int i = scanner1.nextInt();
                Scanner scanner2 = new Scanner(System.in);
                out.println("podaj zakres");
                int l = scanner2.nextInt();
                Random r = new Random();
                for (int j = 0; j < i; j++) out.println(r.nextInt(l));
            }
            catch (InputMismatchException r) {
                System.out.println("podany znak nie jest liczbą");
            }

        }
    }

