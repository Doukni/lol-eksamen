package src.BroCodeJavaTutorial;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        double a;
        double b;
        double catheter;

        Scanner scan = new Scanner(System.in);

        System.out.println("We will together find the HYPOTENUSE");
        System.out.println("If you enter the length of the two catheters then i will be able to find the hypotenuse");

        System.out.println("Enter the length of Catheter 1: ");
        a = scan.nextDouble();

        System.out.println("Enter the length of Catheter 1: ");
        b = scan.nextDouble();

        catheter = Math.sqrt((a * a) + (b * b));
        System.out.println("The length of the hypotenuse is: " + catheter);
    }
}
