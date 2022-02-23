
package ec.edu.espe.caffeinebeverage.model;

import java.util.Scanner;

/**
 *
 * @author darling.cruz
 */
public class Coffee extends CaffeinatedDrinks{
    public void brew() {
        System.out.println("2. coffee passed through coffee filter ");
    }

    public void addCondiments() {
        System.out.println("4. Adding sugar and milk");
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
        System.out.println("add lemon in your drink? yes/no  ?");
        answer = keyboard.next();
        return answer;
    }
}
