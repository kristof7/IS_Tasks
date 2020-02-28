package infoshareacademy.hamburger;

public class Hamburger {

    int howMany;

    public int getHowMany() {
        return howMany;
    }

    public String getHamburger() {
        return hamburger;
    }

    String hamburger;

    public Hamburger(int howMany, String hamburger) {
        this.howMany = howMany;
        this.hamburger = hamburger;
    }
}
