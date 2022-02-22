
package ec.edu.espe.coffee.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, DEEL-ESPE
 */
public class Coffee extends CaffeineBeverage{
@Override
public void brew(){
    System.out.println("2. Dripping coffee through filter");
}
@Override
public void addCondiments(){
    System.out.println("Sugar and milk added to coffee");
    System.out.println("\n Thank you, come back soon\n ");
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
        System.out.println("Would you like suggar and milk with your coffee (y/n) ?");
        String answer = sc.nextLine();
        return answer;
    }
    
}
