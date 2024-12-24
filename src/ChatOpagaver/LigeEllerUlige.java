package src.ChatOpagaver;

import java.util.Scanner;

public class LigeEllerUlige {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int helTal;

        System.out.println("Indtast et heltal");
        helTal = scan.nextInt();

        if (helTal %2 == 0){
            System.out.println("Tallet " + helTal + " er lige");
        }else
            System.out.println("Tallet " + helTal + "er ulige");

    }
}
