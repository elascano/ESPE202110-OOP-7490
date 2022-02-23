<<<<<<< HEAD

package ec.edu.espe.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Dylan Asumaza
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
=======

package ec.edu.espe.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Dylan Asumaza
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
>>>>>>> ae7d89acb2e025d477c15b0b6c0f0f787722c643
