package src.BogOpgaver;

import java.util.Scanner;

public class VekselProgramMedKommission {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double amount;
        double processedAmount;
        double newAmount;
        double commission = 0.02;
        double earnedComission;

        System.out.println("Enter the Amount of dollars u want to exchange: ");
        amount = scan.nextDouble();

        processedAmount = amount * 0.95;
        earnedComission = processedAmount * commission;

        if (earnedComission < 2){
            commission = 2;
        }

        newAmount = processedAmount - earnedComission;

        System.out.println("You have now " + newAmount + "$");
        System.out.println("The comission on the transfer was: " + earnedComission + "$");
    }
}
