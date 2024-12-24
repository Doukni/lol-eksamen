package src.BogOpgaver;

import java.util.Scanner;

public class CopenhagenMarathon {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CopenhagenMarathonMethod runnner = new CopenhagenMarathonMethod();

        String name1;

        System.out.println("Welcome to Copenhagen Marathon!!" +
                "What is your name");

        name1 = scan.nextLine();
        runnner.name = name1;

        runnner.runner(name1, 1556, 'D');
        runnner.runner( name1, 1699, 'D');
        runnner.runner(name1, 834, 'B');


        System.out.println(runnner);

    }
}
