package infoshareacademy;

public class Hamburger {

    private String hamburgerName;

    public Hamburger(String hamburgerName) {
        this.hamburgerName = "Hamburger";
    }

    @Override
    public String toString() {
        return "Hamburger: " + hamburgerName;
    }
}
