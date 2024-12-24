package src.BogOpgaver;

import java.util.Scanner;

public class OmregnFraDollarsTilEuros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double amount;
        double newAmount;

        System.out.println("Enter the Amount of dollars u want to exchange: ");
        amount = scan.nextDouble();

        newAmount = amount * 0.95;

        System.out.println("You have now " + newAmount + "$");
    }
}
