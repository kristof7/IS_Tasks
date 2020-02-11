import java.util.*;

import static java.lang.System.*;

public class Lotto {
    static void randomLotto() {
        Scanner scanner1 = new Scanner(System.in);
        out.println("Ile liczb chcesz uzyskać??");
        try {
            int i = scanner1.nextInt();
            Scanner scanner2 = new Scanner(System.in);
            out.println("podaj zakres");
            int l = scanner2.nextInt();

            Set<Integer> zbior = new TreeSet<Integer>();
            Random r = new Random();

            int k = 0;
            for (int j = 0; j < i; j++)

                do {
                    zbior.add(r.nextInt(l));
                }
                while(k>i);

            for (Integer liczbaLosowa : zbior){
                System.out.println(liczbaLosowa);
            }
        }
        catch (InputMismatchException r) {
            System.out.println("podany znak nie jest liczbą");
        }

    }
}