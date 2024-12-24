package src.BroCodeJavaTutorial.MethodOverride;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();

        Animal animal = new Animal();

        System.out.println();
        animal.speak();
        System.out.println();
        dog.speak(); // the dog class overrides the speak method

        System.out.println("\nHow many times do you want the dog to speak:");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();

        int speak = 0;

        while (amount > speak){
            dog.speak();
            speak++;
        }

    }
}
