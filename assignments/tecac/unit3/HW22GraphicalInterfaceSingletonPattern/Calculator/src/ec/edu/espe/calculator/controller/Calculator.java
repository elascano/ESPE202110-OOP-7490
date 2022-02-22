package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.UsTax;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("--> Singleton Pattern <--");
        UsTax tax = UsTax.getInstance();
        tax.salesTotal();
    }
}
