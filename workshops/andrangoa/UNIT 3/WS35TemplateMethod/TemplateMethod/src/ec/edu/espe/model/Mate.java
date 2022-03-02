
package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Alex Andrango
 */
public class Mate extends CaffeineBeverage{

@Override
public void brew(){
    System.out.println("Dripping herbs into the mate and introducing filter");
}
@Override
public void addCondiments(){
    System.out.println("Adding sugar");
}
@Override
   public boolean wantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){
        return true;
    } else {
        return false;
    }
}
       private String getUserInput() {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Would you like suggar with your mate (y/n) ?");
        String answer = sc.nextLine();
        return answer;
    }
    
}
