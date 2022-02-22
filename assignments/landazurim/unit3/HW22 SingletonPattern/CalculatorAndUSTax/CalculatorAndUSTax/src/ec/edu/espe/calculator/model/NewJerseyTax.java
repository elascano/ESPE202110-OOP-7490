
package ec.edu.espe.calculator.model;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Mateo Lndazuri OOP
 */

//Iva en NewJerseyTax  de 625%

public class NewJerseyTax {
    
    private static NewJerseyTax instance;
    private NewJerseyTax(){}
    
    public static NewJerseyTax getInstance(){
        
        if(instance == null) 
            instance = new NewJerseyTax();
         
        return instance;
    }
    
    public double salesTotal(){           
        double priceTotalTaxes;
        double objectTax;
        final double taxValueInCalifornia =(double) 0.0625;
        double sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print(" Enter the sale value --->  ");
        sale = input.nextFloat();  
       
        objectTax = sale * taxValueInCalifornia;
        priceTotalTaxes= sale + objectTax;
        
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("In the state of New Jersey the total price including the 6.25% tax, is ---> " + format.format(priceTotalTaxes) + " dollars");
        return 0;
        } 
}
