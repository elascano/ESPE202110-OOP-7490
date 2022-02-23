
package ec.edu.espe.Georgia.model;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class GeorgiaTax {
    
 
    
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
        final float taxValueInGeorgia = (float) 0.06;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print(" Introduce sale amount: ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInGeorgia;
        amoutToPayWithTaxe = sale + taxeApliedToSale;
        
        System.out.println(" Michigan tax is 6%, total amount: $" + amoutToPayWithTaxe );
        return 0;
        }

}
    

