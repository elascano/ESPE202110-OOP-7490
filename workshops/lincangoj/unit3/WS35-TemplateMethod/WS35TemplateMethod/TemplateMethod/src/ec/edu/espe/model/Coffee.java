
package ec.edu.espe.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Daniel Lincango
 */
public class Coffee extends CaffeineBeverage{
@Override
public void brew(){
    System.out.println("Dripping coffee through filter");
}
@Override
public void addCondiments(){
    System.out.println("Adding sugar and milk");
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
        System.out.println("Would you like suggar and with your coffee (y/n) ?");
        String answer = sc.nextLine();
        return answer;
    }
    
}
