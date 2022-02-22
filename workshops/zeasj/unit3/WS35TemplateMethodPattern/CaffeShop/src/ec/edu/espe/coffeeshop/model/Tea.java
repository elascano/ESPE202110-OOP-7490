package ec.edu.espe.coffeeshop.model;


import java.util.Scanner;

/**
 *
 * @author Joel Zeas, DEEL-ESPE
 */
public class Tea extends CaffeineBeverage {

    public void brew() {
        System.out.println("- Steep the tea");
    }

    public void addCondiments() {
        System.out.println("- Adding lemon");
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
        System.out.println("Do you want to add lemon to your tea? (yes/no)");
        answer= keyboard.next();
        return answer;
    }
}
