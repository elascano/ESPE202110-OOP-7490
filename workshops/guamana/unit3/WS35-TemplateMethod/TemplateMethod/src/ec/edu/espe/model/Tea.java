
package ec.edu.espe.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author  ---> Angel Guaman DEEL-ESPE <----
 */
public class Tea extends CaffeineBeverage{
    
    @Override
    public void brew(){
        System.out.println("steep the tea");
    }
    @Override
    public void addCondiments(){
    System.out.println("Adding lemon");
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
           System.out.println("Welcome to Angell's Cafe--->");
        System.out.println("You want to put sugar in the tea--->  ?");
           System.out.println("Answer yes (s) or no (n)");
        String answer = sc.nextLine();
        return answer;
    }
}