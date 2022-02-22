/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.NevadaTax;

/**
 *
 * @author Simbaña J  
 */
public class Calculator {
    
     public static void main(String[] args) {
        NevadaTax tax = NevadaTax.getInstance();
        tax.salesTotal();
        
    }
    
}
    

