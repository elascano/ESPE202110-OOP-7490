package ec.edu.espe.model;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Richar Maisincho ESPE
 */
public class ColombiaTax {

    
    private static ColombiaTax instance;
    private ColombiaTax(){}
    
    public static ColombiaTax getInstance(){
        
        if(instance == null) 
            instance = new ColombiaTax();
         
        return instance;
    }
    
    public double salesTotal(){           
        double priceTotalTaxes;
        double objectTax;
        final double taxValueInColombia =(double) 0.10;
        double sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print(" Enter the sale value --->  ");
        sale = input.nextFloat();  
       
        objectTax = sale * taxValueInColombia;
        priceTotalTaxes= sale + objectTax;
        
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("Total price is: ---> " + format.format(priceTotalTaxes) + " dollars");
        return 0;
        } 
    
}
