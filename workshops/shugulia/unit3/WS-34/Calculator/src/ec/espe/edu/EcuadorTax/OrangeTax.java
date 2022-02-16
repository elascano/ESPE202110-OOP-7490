
package ec.espe.edu.EcuadorTax;

import java.util.Scanner;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class OrangeTax {          //Tax is 6.00%
    private static OrangeTax instance;
    private OrangeTax(){}
    
    public static OrangeTax getInstance() {
        if(instance == null)
            instance = new OrangeTax();
        
        return instance;
    }

    public float salesTotal() {
                
        double taxtopay;
        double taxeApliedToSale;
        final double taxValueInOrange =(double) 0.6;
        double sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print(" Please  enter the value of your sale --->  ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInOrange;
        taxtopay= sale + taxeApliedToSale;
        
        System.out.println("In the state of Nevada, the total amount due, including the 6% tax, is:---> " + taxtopay + " dollars.");
        return 0;
    }
}
