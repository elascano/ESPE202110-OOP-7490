package ec.edu.espe.ustax.model;

import java.util.Scanner;

/**
 *
 * @author Anthony Morales, DEEL-ESPE
 */
public class FloridaTax {
    private static FloridaTax instance;
    private FloridaTax(){}
    
    public static FloridaTax getInstance(){
        if(instance == null)
            instance = new FloridaTax();
        return instance;
    }
    public double salesTotal(){
           
        double taxtopay;
        double taxeApliedToSale;
        final double taxValueInOregon =(double) 0.06;
        double sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the value of your sale: ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInOregon;
        taxtopay= sale + taxeApliedToSale;
        
        System.out.println("In the state of Florida the total value to be paid, including the 6% tax is: " + taxtopay + " dollars");
        return 0;
    }
}
