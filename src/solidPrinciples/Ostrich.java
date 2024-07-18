package solidPrinciples;

public class Ostrich extends Animal implements ISpreadWings{
    @Override
    public void run() {
        System.out.println("Ostrich can run very fast");
    }

    @Override
    public void spreadWings() {
        System.out.println("Ostrich can spread wings");
    }
}
