
package ec.edu.espe.CaffeineBeverage.model;

import java.util.Scanner;

/**
 *
 * @author Katherin Bravo DEEL-ESPE
 */
public class Coffee extends BeverageCaffeine{
    public void brew() {
        System.out.println(" Filter coffee or natural ");
    }

    public void addCondiments() {
        System.out.println(" Add sugar and milk ");
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
        System.out.println(" Would you like us to add cream to your coffee?(YES OR NO) ");
        answer = keyboard.next();
        return answer;
    }
}

