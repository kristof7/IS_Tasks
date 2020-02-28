package src.main.java.infoshareacademy;

public class TaskC {
    public static void taskC() {

        String name = "Sis";

        TaskC taskC = new TaskC();
        System.out.println("Are in word letters that repeats:");
        System.out.println(name + ", " + taskC.doesLetterDoubles(name));
    }

    public boolean doesLetterDoubles(String name) {
        boolean isTrue = false;
        int count = 0;

        char[] letters = name.toCharArray();
        letters = String.valueOf(letters).toUpperCase().toCharArray();
        char[] check = name.toCharArray();
        check = String.valueOf(check).toUpperCase().toCharArray();

        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < letters.length; j++) {
                if (i > 0 && letters[i] == check[j]) {
                    count++;
                } else if (count >= 2) {
                    isTrue = true;
                    break;

                }
            }
        }
        return isTrue;
    }
}