package src.BogOpgaver;

import java.util.Scanner;

public class FindStørsteTal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        double num3;

        System.out.println("Enter the first number: ");
        num1 = scan.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = scan.nextDouble();

        System.out.println("Enter the third number: ");
        num3 = scan.nextDouble();

        double max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }

        double min = num1;
        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
            min = num3;
        }

        System.out.println("The highest number is: " + max );
        System.out.println("The lowest number is: " + min);
    }
}

