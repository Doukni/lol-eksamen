package src.BroCodeJavaTutorial.Abstract;

public class Cat extends Animal {

    String name;

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    void eat(String name) {
        this.name = name;
        System.out.println("The "+ this.name +" is eating");
    }
}
