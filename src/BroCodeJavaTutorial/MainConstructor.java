package src.BroCodeJavaTutorial;

public class MainConstructor {

    public static void main(String[] args) {

        HumanConstructer human = new HumanConstructer("Adam", 21, 64.5);
        HumanConstructer human2 = new HumanConstructer("Adam1", 210, 164.5);

        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);
        human.eat();
        human.drink();

        System.out.println();
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);
        human2.eat();
        human2.drink();
    }
}
