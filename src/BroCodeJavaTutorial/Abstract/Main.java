package src.BroCodeJavaTutorial.Abstract;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println();
        cat.makeSound();
        cat.eat("Cat");
        System.out.println();
        dog.makeSound();
        dog.eat("Cat");
    }
}
