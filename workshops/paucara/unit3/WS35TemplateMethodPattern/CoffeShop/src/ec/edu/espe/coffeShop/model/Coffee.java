package ec.edu.espe.coffeShop.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Javier Paucar
 */
public class Coffee extends CaffeineBeverage {

    public void brew() {
        System.out.println("Dripping coffe through filter");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }


    @Override
    public boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar wuth you coffe (y/n)?");
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        return answer;
    }

}
