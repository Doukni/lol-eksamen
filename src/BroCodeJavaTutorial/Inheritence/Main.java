package src.BroCodeJavaTutorial.Inheritence;

public class Main {

    public static void main(String[] args) {


        Car1 car = new Car1();

        car.go();
        System.out.println(car.doors);
        car.stop();

        Bicycle bicycle = new Bicycle();
        System.out.println();
        bicycle.go();
        System.out.println(bicycle.padels);
        bicycle.stop();
    }

}
