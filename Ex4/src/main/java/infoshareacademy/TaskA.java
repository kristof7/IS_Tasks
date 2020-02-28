package infoshareacademy;

public class TaskA {
    private int posSum = 0;
    private int negQuantity = 0;


    public int[] exerciseA(int[] input) {

        if(input.length != 0 || input !=null) {
            for(int number : input) {
                if(number < 0) negQuantity++;
                else if(number > 0) posSum += number;
            }
        return new int[]{negQuantity, posSum};
        } else {
            return new int[]{};
        }
    }
    int[] result = exerciseA(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5});

    public int printPosSum() {
        return result[1];
    }

    public int printNegQuantity() {
        return result[0];
    }
}
