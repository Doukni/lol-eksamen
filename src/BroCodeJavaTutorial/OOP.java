package src.BroCodeJavaTutorial;

import java.util.Scanner;

public class OOP {

    public static void main(String[] args) {

        OOPHome myHome = new OOPHome();

        System.out.println(myHome.homeType);
        System.out.println(myHome.floor);
        System.out.println(myHome.side);
        System.out.println(myHome.sleepingRooms);
        System.out.println(myHome.rooms);
        System.out.println(myHome.price);

        myHome.cleaning();
        System.out.println();

        System.out.println("Are you hungry");
        Scanner scan = new Scanner(System.in);
        String hungry = scan.next();
        String yes = "yes";

        if (yes.equals("yes")){
            myHome.makeFood();
        }
    }
}
