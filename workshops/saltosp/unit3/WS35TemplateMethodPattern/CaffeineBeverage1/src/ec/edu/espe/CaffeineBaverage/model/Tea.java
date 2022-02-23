/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.CaffeineBaverage.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Paul Saltos , DEEE-ESPE
 */
public class Tea extends CaffeineBeverage {

    public void brew() {
        System.out.println("Steep the tea");

    }

    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    public boolean wantsCondiments() { // a hook operation
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea(y / n) ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
// try-catch block
        return answer;
    }
}
