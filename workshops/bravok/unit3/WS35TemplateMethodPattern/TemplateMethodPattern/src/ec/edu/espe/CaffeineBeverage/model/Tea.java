
package ec.edu.espe.CaffeineBeverage.model;

import java.util.Scanner;

/**
 *
 * @author Katherin Bravo DEEL-ESPE
 */
public class Tea extends BeverageCaffeine {

    public void brew() {
        System.out.println(" Tea natural or in case ");
    }

    public void addCondiments() {
        System.out.println("Adding lemon");
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
        System.out.println("Would you like lemon with your tea ( YES OR NO )?");
        answer= keyboard.next();
        return answer;
    }
}
