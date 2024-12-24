package src.ChatOpagaver;

import java.util.Scanner;

public class Fibonaccital {
    public static void main(String[] args) {

        int n;
        int a = 0;
        int b = 1;
        int next;

        System.out.println("Hvor mange tal skal der vises");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(a);
            next = a + b;
            a = b;
            b = next;
        }
    }
}
