package src.BroCodeJavaTutorial;

import java.util.ArrayList;

public class ForEachLoop {

    public static void main(String[] args) {

        String[] animals = {"cat", "dog","rat", "bird"};
        ArrayList<String> animalss = new ArrayList<String>();

        animalss.add("cat");
        animalss.add("dog");
        animalss.add("rat");
        animalss.add("bird");

        for(String i : animals){
            System.out.println(i);
        }

        for(String i : animalss){
            System.out.println(i);
        }
    }
}
