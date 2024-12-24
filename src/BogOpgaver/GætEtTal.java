package src.BogOpgaver;

import java.util.Scanner;

public class GætEtTal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rNumber;


        rNumber = (int) (Math.random() * 20 + 1);


        System.out.println("Guess a number between 1-20: ");

            int gNumber = scan.nextInt();

            while (gNumber != rNumber) {

            if (gNumber < rNumber) {
                System.out.println("The number is higher guess again: ");
                } else {
                    System.out.println("The number is lower guess again: ");
            }
            gNumber = scan.nextInt();
        }

        System.out.println("Congratilations you guessed right!");
    }
}
