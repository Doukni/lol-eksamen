package src.ChatOpagaver;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Indtast et ord for at tjekke om det er Palindrome");
        Scanner scan = new Scanner(System.in);
        String ord = scan.nextLine();

        String rent = ord.replaceAll("\\s+", "").toLowerCase();

        StringBuilder omvendt = new StringBuilder(rent);
        omvendt.reverse();

        if (rent.equals(omvendt.toString())){
            System.out.println("Ordet er et Palindrome");
        }else
            System.out.println("Ordet er ikke et Palindrome");
    }
}
