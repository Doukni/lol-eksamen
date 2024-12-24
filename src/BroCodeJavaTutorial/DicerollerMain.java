package src.BroCodeJavaTutorial;

public class DicerollerMain {

    public static void main(String[] args) {

        DicerollerContructer dicerollerContructer = new DicerollerContructer("Player 1");
        DicerollerContructer dicerollerContructer1 = new DicerollerContructer("Player 2");

        while (dicerollerContructer1.number == dicerollerContructer.number){
            dicerollerContructer.roll();
            dicerollerContructer1.roll();
        }
        if (dicerollerContructer1.number < dicerollerContructer.number){
            System.out.println(dicerollerContructer.name + " won, Congratilations!!");
        } else {
            System.out.println(dicerollerContructer1.name + " won, Congratilations!!");
        }
    }
}
