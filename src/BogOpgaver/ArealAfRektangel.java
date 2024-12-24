package src.BogOpgaver;

import java.util.Scanner;

public class ArealAfRektangel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter the length of side a:");
        a = scan.nextInt();

        System.out.println("Enter the length of side b:");
        b = scan.nextInt();

        double areal = a * b;

        System.out.println("Arealet af dette rektangel er: " + areal);

    }
}
