package ec.edu.espe.coffeeshop.model;


import java.util.Scanner;

/**
 *
 * @author Andy Calderon 
 */
public class AmericanoCoffee extends CaffeineBeverage{
    public void brew() {
        System.out.println("- Dripping coffee through filter");
    }

    public void addCondiments() {
        System.out.println("- Adding sugar and water");
    }
    
    public boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.startsWith("yes")) {
            return true;
        }
        else{
                return false;
                }
    }

    private String getUserInput() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        System.out.println("Do you want to add lemon to your coffee? (yes/no)");
        answer= keyboard.next();
        return answer;
    }
}
