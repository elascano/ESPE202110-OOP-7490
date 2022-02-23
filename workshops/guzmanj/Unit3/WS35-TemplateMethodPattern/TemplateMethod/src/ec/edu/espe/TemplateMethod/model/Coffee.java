/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.TemplateMethod.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Jose Guzman
 */
public class Coffee extends CaffeineBeverage{
    public void brew() { System.out.println( "Dripping coffee through filter" ); } 
    public void addCondiments() { System.out.println( "Adding sugar and milk" );
    } 

    public boolean wantsCondiments() { // a hook operation 
    String answer = getUserInput();
    if ( answer.toLowerCase().startsWith( "y" )) { return true; } else { return false; }
    }
    private String getUserInput() { String answer = null;
    System.out.println ( "Would you like milk and sugar with your coffee (y/n)? "); 
    BufferedReader in = new BufferedReader ( new InputStreamReader( System.in ));
    // try-catch block 
    return answer;
    }
}

