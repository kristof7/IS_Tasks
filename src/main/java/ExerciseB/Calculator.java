package ExerciseB;

public class Calculator {

    public double liczba1;
    public double liczba2;
    public String znak;

    public double obliczenia(double liczba1, double liczba2, String znak) {
        switch (znak) {
            case "+":
                return this.liczba1 + this.liczba2;
            case "-":
                return this.liczba1 - this.liczba2;
            case "*":
                return this.liczba1 * this.liczba2;
            case "/":
                return this.liczba1 / this.liczba2;
            default:
                System.out.println("Nie ma takiego działąnia!!!");
        }
        return 0.0;
    }
}
