package src.ChatOpagaver;

import java.util.Scanner;

public class TælVokaler {
    public static void main(String[] args) {

        System.out.println("Indtast en sætning");
        Scanner scan = new Scanner(System.in);
        String sætning = scan.nextLine();
        int vokalTæller = 0;

        for (int i = 0; i < sætning.length(); i++) {
            char tegn = sætning.charAt(i);
            if (tegn == 'a' || tegn == 'e' || tegn == 'i' || tegn == 'o' || tegn == 'u' ||
                    tegn == 'A' || tegn == 'E' || tegn == 'I' || tegn == 'O' || tegn == 'U') {
                vokalTæller++;
            }
        }
        System.out.println("Det er " + vokalTæller + " vokaler i din sætning.");
    }
}
