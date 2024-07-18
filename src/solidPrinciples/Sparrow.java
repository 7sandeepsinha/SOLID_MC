package solidPrinciples;

public class Sparrow extends Animal implements IFlyable, ISpreadWings {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying low");
    }

    public void run() {
        System.out.println("Sparrow is moving on the ground");
    }

    @Override
    public void spreadWings() {
        System.out.println("Sparrow spread wings");
    }
}
