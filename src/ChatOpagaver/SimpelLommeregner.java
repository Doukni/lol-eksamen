package src.ChatOpagaver;

import java.util.Scanner;

public class SimpelLommeregner {
    public static void main(String[] args) {

        int tal1;
        int tal2;
        int valg;

        Scanner scan = new Scanner(System.in);
        System.out.println("Velkommen til mini lommeregner");
        System.out.println("Tryk 1: hvis du vil +");
        System.out.println("Tryk 2: hvis du vil -");
        System.out.println("Tryk 3: hvis du vil *");
        System.out.println("Tryk 4: hvis du vil /");
        valg = scan.nextInt();

        switch (valg){
            case 1:
                System.out.println("Indtast tal 1:");
                tal1 = scan.nextInt();
                System.out.println("Indtast tal 2:");
                tal2 = scan.nextInt();
                System.out.println(tal1 + tal2);
                break;

            case 2:
                System.out.println("Indtast tal 1:");
                tal1 = scan.nextInt();
                System.out.println("Indtast tal 2:");
                tal2 = scan.nextInt();
                System.out.println(tal1 - tal2);
                break;

            case 3:
                System.out.println("Indtast tal 1:");
                tal1 = scan.nextInt();
                System.out.println("Indtast tal 2:");
                tal2 = scan.nextInt();
                System.out.println(tal1 * tal2);
                break;

            case 4:
                System.out.println("Indtast tal 1:");
                tal1 = scan.nextInt();
                System.out.println("Indtast tal 2:");
                tal2 = scan.nextInt();

                if (tal2 == 0){
                    System.out.println("Fejl: man kan ikke dividere med 0");
                }else
                    System.out.println(tal1 / tal2);
                break;

            default:
                System.out.println("Noget gik galt. Prøv igen");

        }
    }
}
