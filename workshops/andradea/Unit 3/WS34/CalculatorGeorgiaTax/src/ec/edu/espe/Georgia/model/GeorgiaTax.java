
package ec.edu.espe.Georgia.model;

import java.util.Scanner;

/**
 *
 * @author Andrade Alan
 */
public class GeorgiaTax {
    
    //The Tax in Georgia is 8.5%
    
    private static GeorgiaTax instance;
    private GeorgiaTax(){}
    
    public static GeorgiaTax getInstance(){
        
        if(instance == null) 
            instance = new GeorgiaTax();
         
        return instance;
    }
    
    public float salesTotal(){
           
        float amoutToPayWithTaxe;
        float taxeApliedToSale;
        final float taxValueInGeorgia = (float) 0.085;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print(" Introduce sale amount: ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInGeorgia;
        amoutToPayWithTaxe = sale + taxeApliedToSale;
        
        System.out.println(" The total amount due in Georgia including the 8.5% tax is ------>  " + amoutToPayWithTaxe + " dollars");
        return 0;
        }

}
    

