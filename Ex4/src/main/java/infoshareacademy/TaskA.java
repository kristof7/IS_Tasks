package infoshareacademy;

public class TaskA {
    public static void main(String[] args) {

        int[] result = countAndSumElements(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5});
        if (result.length == 2) {
            System.out.println("Number of negative numbers: " + result[0]);
            System.out.println("Number of positive numbers: " + result[1]);
        }
    }
    public static int[] countAndSumElements ( int[] input){

        if (input == null || input.length == 0) return new int[0];

        int sum = 0;
        int count = 0;

        for (int i : input) {
            if (i > 0) sum += i;
            else if (i < 0) count++;
        }
        return new int[]{count, sum};
    }
}

