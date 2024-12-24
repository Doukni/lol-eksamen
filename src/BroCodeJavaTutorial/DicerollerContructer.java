package src.BroCodeJavaTutorial;

import java.util.Random;
import java.util.Scanner;

public class DicerollerContructer {

    int number;
    Random random;
    String name;

    DicerollerContructer(String name){
        this.name = name;
        random = new Random();
        roll();
    }

    void roll(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is players name: ");
        name = scan.nextLine();
        number = random.nextInt(6)+1;
        System.out.println(name + " Rolling: " + number);
    }
}
