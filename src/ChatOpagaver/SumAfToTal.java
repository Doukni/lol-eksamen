package src.ChatOpagaver;

import java.util.Scanner;

public class SumAfToTal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tal1;
        int tal2;
        double sum;

        System.out.println("Vi kan sammen finde summen af to tal");
        System.out.println("Indtast tal nr 1:");
        tal1 = scan.nextInt();
        System.out.println("Indtast tal nr 2:");
        tal2 = scan.nextInt();
        sum = tal1 + tal2;

        System.out.println("Summen af " + tal1 + " og " + tal2 + " er = " + sum);
    }
}
