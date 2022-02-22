package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author --> Tayo Sebastian
 */
public class TexasTax {

    private static TexasTax instance;
    private TexasTax(){}
    
    public static TexasTax getInstance(){
        
        if(instance == null) 
            instance = new TexasTax();
         
        return instance;
    }
    
    public double salesTotal(){
           
        double taxtopay;
        double taxeApliedToSale;
        final double taxValueInOregon =(double) 0.145;
        double sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print(" Please  enter the value of your sale --->  ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInOregon;
        taxtopay= sale + taxeApliedToSale;
        
        System.out.println("In the state of Nevada, the total amount due, including the 14.5% tax, is:---> " + taxtopay + " dollars.");
        return 0;
        }

}
