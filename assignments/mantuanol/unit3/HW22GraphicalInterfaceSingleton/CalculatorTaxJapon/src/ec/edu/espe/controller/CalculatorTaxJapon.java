/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.JaponTax;

/**
 *
 * @author Leonel.M
 */
public class CalculatorTaxJapon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JaponTax tax = JaponTax.getInstance();
        tax.salesTotal();
    }
    
}
