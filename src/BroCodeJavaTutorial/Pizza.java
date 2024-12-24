package src.BroCodeJavaTutorial;

public class Pizza {

    String topping = "Chicken";
    String sauce = "Tomatosauce";
    int amount = 3;

    Pizza(){

    }

    public String toString(){
        return topping + "\n" + sauce + "\n" + amount;
    }
}
