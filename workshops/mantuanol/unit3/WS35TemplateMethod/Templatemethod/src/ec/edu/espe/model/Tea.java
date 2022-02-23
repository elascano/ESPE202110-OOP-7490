package ec.edu.espe.model;


import java.util.Scanner;
/**
 *
 * @author Leonel.M
 */
public class Tea extends Caffeine{
    public void brew() {
        System.out.println("- Pouring tea");
    }

    public void addCondiments() {
        System.out.println("- Add honey");
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
        System.out.println("Do you want to put honey or lemon? (yes/no)");
        answer= keyboard.next();
        return answer;
    }

    public void prepareRecipe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
