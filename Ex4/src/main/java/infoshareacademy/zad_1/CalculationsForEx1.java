package infoshareacademy.zad_1;

public class CalculationsForEx1 {

    public static int[] result(int[] input) {

        int numberOfNegatives = 0;
        int sumOfPositives = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) numberOfNegatives++;
            if (input[i] > 0) sumOfPositives += input[i];
        }

        int[] result = {numberOfNegatives, sumOfPositives};
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }
}
