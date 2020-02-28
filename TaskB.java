package kasia42;


public class TaskB {
        private static boolean check(String input) {
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isLetter(ch) && input.indexOf(ch, i + 1) != -1) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println(check("adam"));
            System.out.println(check("jan"));
            System.out.println(check("janaaa"));
            System.out.println(check("kasia"));
            System.out.println(check("ola"));
            System.out.println(check("kasandra"));
            System.out.println(check("abc"));
        }}