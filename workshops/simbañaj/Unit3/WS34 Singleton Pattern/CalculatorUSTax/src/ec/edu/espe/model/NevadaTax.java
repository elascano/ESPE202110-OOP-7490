
package ec.edu.espe.model;
import java.util.Scanner;

/**
 *
 * @author Simbaña J 
 */
public class NevadaTax {
    private static NevadaTax instance;
    private NevadaTax(){}
    
    public static NevadaTax getInstance(){
        
        if(instance == null) 
            instance = new NevadaTax();
         
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
    

