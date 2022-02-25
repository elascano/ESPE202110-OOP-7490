
package ec.edu.espe.coffee.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author  Anthony Morales, DEEL-ESPE
 */
public class Tea extends CaffeineBeverage{
    
    @Override
    public void brew(){
        System.out.println("2. Steep the tea");
    }
    @Override
    public void addCondiments(){
    System.out.println("Lemon added to tea");
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
        System.out.println("Would you like lemon with your tea (y/n) ?");
        String answer = sc.nextLine();
        return answer;
    }
}