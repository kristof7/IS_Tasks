package infoshareacademy;

public class TaskA {
    public static void printResult(){

        int[] result = countAndSum(new int[]{-3, -2, -1, 0, 1, 2, 3, 4});
            if (result.length == 2) {
                System.out.println(result[0]+","+result[1]);
            }
        }
        private static int[] countAndSum ( int[] input){
            if (input == null || input.length == 0)
                return new int[0];
            int sum = 0;
            int count = 0;
            for (int source : input) {
                if (source > 0) sum += source;
                else if (source < 0) count++;
            }
            return new int[]{count, sum};
        }
    }

