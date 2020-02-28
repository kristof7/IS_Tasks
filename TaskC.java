package kasia42;


import java.util.HashMap;

public class TaskC {




    public static void method(int... a) {


        HashMap<String, Integer> mapa = new HashMap<>();


        int countzero = 0;
        int countpositive = 0;
        int countnegative = 0;
        int sumpositive = 0;
        int sumnegative = 0;
        for (int i = 0; i < a.length; i++) {


            if (a[i] > 0) {
                countpositive++;
                sumpositive += a[i];
            }
            if (a[i] == 0)
                countzero++;
            if (a[i] < 0) {
                countnegative++;
                sumnegative += a[i];
            }
        }


     //   print(mapa);
        mapa.put("positivenumbers",countpositive );
        mapa.put("negativenumbers", countnegative);
        mapa.put("zero", countzero);
        mapa.put("suma negatywnych", sumnegative);
        mapa.put("sum pozytywnych", sumpositive);


        System.out.println(mapa);

    }




    public static void main(String[] args) {
        int lista[] = new int[]{3, -2, -1, 0, 1, 2, 3, 4, 5};
method( lista);

}}




