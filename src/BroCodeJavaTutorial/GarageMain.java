package src.BroCodeJavaTutorial;

public class GarageMain {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car1 = new Car("Toyota CHR");
        Car car2 = new Car("Ford Mustang Mech e");

        garage.park(car1);
        garage.park(car2);

    }
}
