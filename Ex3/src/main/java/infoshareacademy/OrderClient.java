package infoshareacademy;

public abstract class OrderClient {

    public abstract void orderJedzenie(String... produkty) throws InterruptedException;
}