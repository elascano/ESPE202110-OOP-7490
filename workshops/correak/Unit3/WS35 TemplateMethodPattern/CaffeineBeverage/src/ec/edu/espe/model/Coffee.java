/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author KERLY CORREA
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("dripping coffee through filtrer");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding sugar and ice");
    }

   public boolean wantsCondiments(){
       String answer=getUserInput();
       if(answer.toLowerCase().startsWith("y")){
           return true;
       }else{
           return false;
       }
        
   }

    private String getUserInput() {
        String answer ;
        System.out.println("Would you like ice and sugar with you coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        answer=in.toString();
        try {
            
                
                addCondiment();
            
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        
        return answer;
        
    }
   
   
    
    
}
