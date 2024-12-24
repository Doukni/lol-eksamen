package src.BroCodeJavaTutorial;

public class FoodMain {

    public static void main(String[] args) {

        //Food[] refrigiator = new Food[3];

        Food food1 = new Food("Butterchicken");
        Food food2 = new Food("Pizza");
        Food food3 = new Food("Couscus");

        Food[] refrigiator = {food1,food2,food3};

       // refrigiator[0] = food1;     {       Dette kode er udkommenteret for at vise man kan gøre det på to måder
       // refrigiator[1] = food2;     {       Den ene måde er når man laver arrayen før og den måde er når man
       // refrigiator[2] = food3;     {       laver den efter man giver opbjekterne deres værdi

        System.out.println(refrigiator[0].name);
        System.out.println(refrigiator[1].name);
        System.out.println(refrigiator[2].name);

    }
}
