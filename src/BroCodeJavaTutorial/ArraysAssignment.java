package src.BroCodeJavaTutorial;

import java.util.Random;

public class ArraysAssignment {

    public static void main(String[] args) {
        //Gemme navnene på 5 elever i et array.
        //Gemme 5 karakterer (mellem 0 og 100) for hver elev i et 2D-array (en matrix).
        //Beregne og udskrive gennemsnittet for hver elev.
        //Udskrive den højeste karakter for hele klassen.
        //Udskrive navnet på den elev, der har det højeste gennemsnit.

        String[] elever = new String[5];

            elever[0] = "Adam";
            elever[1] = "Jibril";
            elever[2] = "Qudamah";
            elever[3] = "Younes";
            elever[4] = "Nabil";

        int[][] karakter = new int[5][6];



        for (int i = 0; i < elever.length; i++) {
            // Print elevens navn først
            System.out.print(elever[i] + ": ");

            // Loop gennem deres karakterer
            for (int j = 0; j < karakter[i].length-1; j++) {
                Random random = new Random();
                karakter[i][j] = random.nextInt(101);
                // Print hver karakter, adskilt af komma (undgå komma efter sidste karakter)
                System.out.print(karakter[i][j]);
                if (j < karakter[i].length - 1) {
                    System.out.print(", "); // Tilføj komma mellem karakterer
                }
            }

            // Gå til næste linje efter alle karakterer er printet
            System.out.println();
        }
    }
}
