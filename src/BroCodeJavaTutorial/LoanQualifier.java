package src.BroCodeJavaTutorial;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int requiredSalary = 3000;
        int yearsEmployed = 2;

        System.out.println("Enter your salary:");
        double salary = scan.nextDouble();

        System.out.println("Enter how many years you have been employed");
        double years = scan.nextDouble();

        if (salary >= requiredSalary){
            if(years >= yearsEmployed){
                System.out.println("You are qualified to get a loan");
            }else {
                System.out.println("You have not worked long enough, in your current job");
            }
        }else{
            System.out.println("You have to earn a little more big man");
        }
    }
}
