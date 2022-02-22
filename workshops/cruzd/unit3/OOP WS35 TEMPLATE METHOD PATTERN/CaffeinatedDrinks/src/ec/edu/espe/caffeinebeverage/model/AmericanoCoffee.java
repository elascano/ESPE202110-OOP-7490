package ec.edu.espe.caffeinebeverage.model;


import java.util.Scanner;

/**
 *
 * @author darling.cruz
 */
public class AmericanoCoffee extends CaffeinatedDrinks{
    public void brew() {
        System.out.println("2. Dripping coffee through filter");
    }

    public void addCondiments() {
        System.out.println("4. Adding sugar and water");
    }
    
    public boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.startsWith("Yes")) {
            return true;
        }
        else{
                return false;
                }
    }

    private String getUserInput() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        System.out.println("Y ou want lemon in your drink (yes/no)?");
        answer= keyboard.next();
        return answer;
    }
}
