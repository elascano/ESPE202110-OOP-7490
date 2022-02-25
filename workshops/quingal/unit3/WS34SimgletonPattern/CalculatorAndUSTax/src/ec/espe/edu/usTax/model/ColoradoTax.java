/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.usTax.model;

import java.util.Scanner;

/**
 *
 * @author Quinga Leandro DEEE-ESPE
 */
public class ColoradoTax {   //Tax is 8.9%
    private static  ColoradoTax instance;
    public ColoradoTax(){}
    
    public static ColoradoTax getInstance(){
        
        if (instance == null)
            instance = new ColoradoTax();
        
        return instance;
    }
    
    public float salesTotal(){
        
        float amountToPayWitchTaxe;
        float taxeApliedToSale;
        final float coloradoTax = (float) 0.089;
        float sale;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the price of your sale: ");
        sale = input.nextFloat();
        
        taxeApliedToSale = sale * coloradoTax;
        amountToPayWitchTaxe = sale + taxeApliedToSale;
        
        System.out.println("In Colorado the total value to pay is : "+amountToPayWitchTaxe+"Including"+taxeApliedToSale);
        return 0;
    }
}
