package src.BogOpgaver;

import java.util.Scanner;

public class ValutaOmregnerMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ValutaOmregner vOmregner = new ValutaOmregner();

        System.out.println();
        System.out.println("Velkommen til Valuta omregner. \n" +
                "Her kan du veksle fra danske kroner til svenske, norske, finske eller" +
                " islandske kroner.");
        System.out.println("");
        System.out.println("Indtast Indtast beløb i danske kroner (Tast 0 for at afslutte programmet): ");
        vOmregner.svenskeKroner(vOmregner.nummer = scan.nextDouble());

        if (vOmregner.nummer == 0){
            System.out.println("Tak for i dag, har en god dag!");

        } else {

            System.out.println();
            System.out.println("Tast 1 for svenske kroner \n" +
                    "Tast 2 for norske kroner \n" +
                    "Tast 3 for finske euro \n" +
                    "Tast 4 for islandske kroner \n" +
                    "Indtast valuta: ");

            int valg = scan.nextInt();
            switch (valg){
                case 1: {
                    System.out.println("Til udbetaling: " + vOmregner.svenskeKroner(vOmregner.nummer) + " kroner");
                } break;
                case 2: {
                    System.out.println("Til udbetaling: " + vOmregner.norskeKroner(vOmregner.nummer) + " kroner");
                } break;
                case 3: {
                    System.out.println("Til udbetaling: " + vOmregner.finskeEuro(vOmregner.nummer) + " euro");
                } break;
                case 4: {
                    System.out.println("Til udbetaling: " + vOmregner.islandskeKroner(vOmregner.nummer) + " kroner");
                } case 0: {
                    System.out.println("Thank you, have a great day!"); break;
                } default:
                    System.out.println("Ikke muligt prøv igen!");
            }

        }

    }
}
