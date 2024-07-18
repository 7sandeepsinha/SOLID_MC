package solidPrinciples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int animalChoice = 1;
        System.out.println("Choose your animal. 1-Elephant, 2 Cow, 3 Crocodile");
        animalChoice = sc.nextInt();

        Animal a = null;
        if(animalChoice == 1){
            a = new Elephant();
        } else if(animalChoice == 2){
            a = new Cow();
        } else {
            a = new Crocodile();
        }
        a.run();
    }
}
