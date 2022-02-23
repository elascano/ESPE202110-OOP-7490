package ec.edu.espe.template.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public class Tea extends CaffeineBeverage {

    public void brew() {
        System.out.println("Steep the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

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
        System.out.println("Would you like lemon with your tea?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return answer;

    }

}
