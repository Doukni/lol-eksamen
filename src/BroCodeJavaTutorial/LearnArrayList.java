package src.BroCodeJavaTutorial;
import java.util.ArrayList;

public class LearnArrayList {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("Butterchicken");
        food.add("Friedchicken");
        food.add("Soup");

        food.set(2, "Tacos");
        food.remove(0);
        //food.clear();


        for (int i = 0; i < food.size(); i++){

            System.out.println(food.get(i));
        }


    }
}
