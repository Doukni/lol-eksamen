package src.BroCodeJavaTutorial;

public class Pizzamain {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();


        System.out.println(pizza.toString());
        System.out.println(pizza);

        // Vi har overwirtet toString til at være lig med pizzas parameter
        // man kan print det på ved at kalde på toString men man behøver ikke.
        // fordi når man printer pizza så kalder man toString implicit
    }
}
