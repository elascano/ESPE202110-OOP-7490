
package ec.edu.espe.CaffeineBeverage.model;

import java.util.Scanner;

/**
 *
 * @author Katherin Bravo DEEL-ESPE
 */
public class AmericanoCoffee extends BeverageCaffeine{
    public void brew() {
        System.out.println(" Filter Coffee ");
    }

    public void addCondiments() {
        System.out.println(" Add sugar and cream ");
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
        System.out.println(" Would you like us to add cream to your coffee?(YES OR NO ) ");
        answer= keyboard.next();
        return answer;
    }
}