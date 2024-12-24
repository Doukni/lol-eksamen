package src.BroCodeJavaTutorial.Abstract;

public class Dog extends Animal {

    String name;

    @Override
    void makeSound() {
        System.out.println("Wuff! wuff!");
    }

    @Override
    void eat(String name) {
        this.name = name;
        System.out.println("The "+ this.name +" is eating");
    }
}
