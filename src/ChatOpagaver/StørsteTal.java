package src.ChatOpagaver;

import java.util.Arrays;
import java.util.Scanner;

public class StørsteTal {
    public static void main(String[] args) {

        System.out.println("Hvor mange tal vil du indtaste");
        Scanner scan = new Scanner(System.in);
        int mængdeTal = scan.nextInt();
        if (mængdeTal <= 0){
            System.out.println("Indtastet et ugyldigt tal, tallet skal være større end 0.");
        }

        int tal = 1;
        int indtastetTal;
        int størstetal = Integer.MIN_VALUE;

        Integer[] talIndholder = new Integer[mængdeTal];

        for (int i = 0; i < talIndholder.length; i++){
            System.out.println("Indtast tal " + tal + ": ");
            indtastetTal = scan.nextInt();
            if (indtastetTal > størstetal){
                størstetal = indtastetTal;
            }
            talIndholder[i] = indtastetTal;
            tal++;

        }
        System.out.println("Tallene i listen er: " + Arrays.toString(talIndholder));
        System.out.println("Det største tal i listen er: " + størstetal);
    }
}
