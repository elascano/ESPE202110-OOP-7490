/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.calculator.controller;

import ec.espe.edu.usTax.model.ColoradoTax;

/**
 *
 * @author Quinga Leandro DEEE-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        ColoradoTax tax = new ColoradoTax();
        tax.salesTotal();
    }
    
}
