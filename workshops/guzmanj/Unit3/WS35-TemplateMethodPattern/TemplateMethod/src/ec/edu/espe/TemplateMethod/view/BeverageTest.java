/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.TemplateMethod.view;

import ec.edu.espe.TemplateMethod.model.Coffee;
import ec.edu.espe.TemplateMethod.model.Tea;

/**
 *
 * @author Jose Guzman
 */
public class BeverageTest {
    public static void main(String[] args) {

    Tea tea = new Tea();
    Coffee coffee = new Coffee();

    System.out.println( "\nMaking tea …" ); 
    tea.prepareRecipe();

    System.out.println( "\nMaking coffee …" ); 
    coffee.prepareRecipe();
    }

}
