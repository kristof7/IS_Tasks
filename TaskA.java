package kasia42;

public class TaskA {


    public static void main(String[] args) {
        int[] variable = countinandSumming(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5});
        if (variable.length == 2) {
            System.out.println("Liczb ujemnych: " + variable[0]);
            System.out.println("Suma dodatnich: " + variable[1]);
        }
    }

    public static int[] countinandSumming(int[] dataInput) {

        if (dataInput == null || dataInput.length == 0) return new int[0];

        var sum = 0;
        var count = 0;

        for (var element : dataInput) {
            if (element > 0) sum += element;
            else if (element < 0) count++;
        }

        return new int[]{count, sum};
    }

}
