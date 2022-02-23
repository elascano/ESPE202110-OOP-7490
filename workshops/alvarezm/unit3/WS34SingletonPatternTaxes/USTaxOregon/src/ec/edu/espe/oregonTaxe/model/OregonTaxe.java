package ec.edu.espe.oregonTaxe.model;
import java.util.Scanner;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class OregonTaxe {    // Tax is 9.9%
    
    private static OregonTaxe instance;
    
    private OregonTaxe(){
    }
    
    public static OregonTaxe getInstance(){
        
        if(instance == null) 
            instance = new OregonTaxe();
         
        return instance;
    }
    
    public float introduceTaxe(){
        
        float taxValueInOregon;
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce de value of the taxe in Oregon: ");
        taxValueInOregon = input.nextFloat();
        return taxValueInOregon;
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
        
        System.out.println("In Oregon State, the total amount to pay including the tax of " + taxValueInOregon + " % is " + amoutToPayWithTaxe + " dollars.");
        
        return amoutToPayWithTaxe;
        }
    
    public float getSalesTotal(){
        float amoutToPayWithTaxe;
        amoutToPayWithTaxe = salesTotal();
        return amoutToPayWithTaxe;
    }

}
