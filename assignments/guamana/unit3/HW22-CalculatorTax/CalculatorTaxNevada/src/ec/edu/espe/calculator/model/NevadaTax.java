
package ec.edu.espe.calculator.model;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Angel Guaman
 */

//Iva en California de 7.25%

public class NevadaTax {
    /*
    private static NevadaTax instance;
    private NevadaTax(){}
    
    public static NevadaTax getInstance(){
        
        if(instance == null) 
            instance = new NevadaTax();
         
        return instance;
    }
    
    public double salesTotal(){           
        double priceTotalTaxes;
        double objectTax;
        final double taxValueInCalifornia =(double) 0.0725;
        double sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print(" Enter the sale value --->  ");
        sale = input.nextFloat();  
       
        objectTax = sale * taxValueInCalifornia;
        priceTotalTaxes= sale + objectTax;
        
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("In the state of California the total price including the 7.25% tax, is ---> " + format.format(priceTotalTaxes) + " dollars");
        return 0;
        } */
}
