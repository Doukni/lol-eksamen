package src.BogOpgaver;

import java.util.Scanner;

public class Alder2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int alder;

        System.out.println("Indtast din alder");
        alder = scan.nextInt();


        if (alder < 18) {
            System.out.println("du er ikke myndig");
        } else if (alder > 30) {
            System.out.println("du er en gammel mand");
        } else if (alder < 10){
            System.out.println("du er et lille barn");
        } else if (alder > 18){
            System.out.println("du er myndig");
        } else
            System.out.println("du findes ikke");
    }

}