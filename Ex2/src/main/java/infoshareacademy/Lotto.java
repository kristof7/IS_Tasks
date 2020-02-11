package infoshareacademy;

import java.util.*;

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

            Set<Integer> zbior = new HashSet<Integer>();
            Random r = new Random();

            for (int j = 0; j < i; j++)
                for (int k = 0; k<i; k++)
                    zbior.add(r.nextInt(l));

            for (Integer liczbaLosowa : zbior)

            {
                System.out.println(liczbaLosowa);
            }
        }
        catch (InputMismatchException r) {
            System.out.println("podany znak nie jest liczbą");
        }

    }
}