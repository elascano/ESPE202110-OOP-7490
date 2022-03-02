
package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Jaime Eivar DEEL-ESPE
 */
    
public class KansasRate {    
    
    private static KansasRate instance;
    
    private KansasRate(){
    }
    
    public static KansasRate getInstance(){
        
        if(instance == null) 
            instance = new KansasRate();
         
        return instance;
    }
    
    public float introduceTaxe(){
        
        float rateValueInKansas;
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce de value of the rate in Kansas: ");
        rateValueInKansas = input.nextFloat();
        return rateValueInKansas;
    }
    
    public float getTaxe(){
        float taxValueInOregon;
        taxValueInOregon = introduceTaxe();
        return taxValueInOregon;
    }
    
    public float salesTotal(){
           
        float amoutToPayWithTaxe;
        float taxeApliedToSale;
        float sale;
        float taxValueInOregon = getTaxe();
            
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce de amount of your sale: ");
        sale = input.nextFloat();  
        
        taxeApliedToSale = sale * taxValueInOregon/100;
        amoutToPayWithTaxe = sale + taxeApliedToSale;
        
        System.out.println("In Kansas State, the total amount to pay including the rate of " + taxValueInOregon + " % is " + amoutToPayWithTaxe + " dollars.");
        
        return amoutToPayWithTaxe;
        }
    
    public float getSalesTotal(){
        float amoutToPayWithTaxe;
        amoutToPayWithTaxe = salesTotal();
        return amoutToPayWithTaxe;
    }

}
    
