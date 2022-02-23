package ec.edu.espe.caffeineBeverage.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steep the tea"); 
    }
    
    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public boolean wantsCondiments(){  // a hook operation
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("Y")){ 
            return true;
        }
        else { 
            return false; 
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea ( Y / N ) ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return answer;
    }

}
