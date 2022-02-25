package ec.edu.espe.model;
import java.util.Scanner;
/**
 *
 * @a
 */
public class Coffe extends Caffeine {
     public void brew() {
        System.out.println("- Coffee brewing through the filter");
    }

    public void addCondiments() {
        System.out.println("- Add sugar and optional milk");
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
        System.out.println("Do you want to add honey to your coffee, natural sweetener? (yes/no)");
        answer = keyboard.next();
        return answer;
    }
    
}
