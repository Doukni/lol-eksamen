package src.BroCodeJavaTutorial;

public class HumanConstructer {

    String name;
    int age;
    double weight;


    HumanConstructer(String name, int age, double weight){

            this.name = name;
            this.age = age;
            this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinkning");
    }
}
