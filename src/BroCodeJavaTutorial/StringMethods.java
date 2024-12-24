package src.BroCodeJavaTutorial;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Adam";

        boolean resault = name.equalsIgnoreCase("    adam     ");
        int resaultI = name.length();
        char resaultC = name.charAt(1); //indtast det index du vil have.
        int Iresault = name.indexOf("a"); // indtast det tegn som du vil finde indexet af
        boolean resaultB = name.isEmpty();
        String resaultL = name.toLowerCase();
        String resaultU = name.toUpperCase();
        String resaultT = name.trim(); // fjerner empty space
        String resaultR = name.replace("A", "O");

        System.out.println(resault);
        System.out.println(resaultI);
        System.out.println(resaultC);
        System.out.println(Iresault);
        System.out.println(resaultB);
        System.out.println(resaultL);
        System.out.println(resaultU);
        System.out.println(resaultT);
        System.out.println(resaultR);

    }
}
