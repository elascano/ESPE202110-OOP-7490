package ec.edu.espe.model;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Leonel.M
 */
public class JaponTax {

    
    private static JaponTax instance;
    private JaponTax(){}
    
    public static JaponTax getInstance(){
        
        if(instance == null) 
            instance = new JaponTax();
         
        return instance;
    }
    
    public double salesTotal(){           
        double priceTotalTaxes;
        double objectTax;
        final double taxValueInJapon =(double) 0.10;
        double sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print(" Enter the sale value --->  ");
        sale = input.nextFloat();  
       
        objectTax = sale * taxValueInJapon;
        priceTotalTaxes= sale + objectTax;
        
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("Total price is: ---> " + format.format(priceTotalTaxes) + " dollars");
        return 0;
        } 
    
}
