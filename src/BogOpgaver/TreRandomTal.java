package src.BogOpgaver;

public class TreRandomTal {

    public static void main(String[] args) {

        double tal1, tal2, tal3;
        tal1 = Math.random();
        tal2 = Math.random();
        tal3 = Math.random();

        double sum = tal1 + tal2 + tal3;
        double gennemsnit = (tal2 + tal1 + tal3) / 3;

        System.out.println(tal1);
        System.out.println(tal2);
        System.out.println(tal3);
        System.out.println();
        System.out.println("Summen af de 3 tal er: " + sum);
        System.out.println("Genemsnittet af de samme 3 tal er: " + gennemsnit);


    }
}
