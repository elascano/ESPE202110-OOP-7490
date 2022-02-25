
package ec.edu.espe.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class Tea {

    public static void preparateRecipe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public  void brew() {
        System.out.println("Steep the tea");
    }

    public void addCondiments() {
        System.out.println("“Adding lemon");
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
        System.out.println("Would you like lemon with your tea (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        return answer;
    }

}

