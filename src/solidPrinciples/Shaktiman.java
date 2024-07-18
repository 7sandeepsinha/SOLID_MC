package solidPrinciples;

public class Shaktiman extends Animal implements IFlyable{
    @Override
    public void run() {
        System.out.println("Shaktiman can run really really fast");
    }

    @Override
    public void fly() {
        System.out.println("Shaktiman can run really really high and fast");
    }
}
