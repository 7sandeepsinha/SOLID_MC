package solidPrinciples;

public abstract class Animal {
    private String name;
    private int numberOfLegs;
    private int age;

    public void breathe(){
        System.out.println("Animal is breathing");
    }

    public abstract void run(); // no implementation at generic animal level
}
