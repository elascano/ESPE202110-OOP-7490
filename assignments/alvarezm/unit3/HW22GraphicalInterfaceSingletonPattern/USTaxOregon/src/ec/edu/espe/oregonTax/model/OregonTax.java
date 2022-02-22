package ec.edu.espe.oregonTax.model;
import java.util.Scanner;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class OregonTax {    // Tax is 9.9%
    
    private static OregonTax instance;
    
    private OregonTax(){
    }
    
    public static OregonTax getInstance(){
        
        if(instance == null) 
            instance = new OregonTax();
         
        return instance;
    }
    
    public float salesTotal(){
           
        float amoutToPayWithTaxe;
        float taxeApliedToSale;
        final float taxValueInOregon = (float) 0.099;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce de amount of your sale: ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInOregon;
        amoutToPayWithTaxe = sale + taxeApliedToSale;
        
        System.out.println("In Oregon State, the total amount to pay including the tax of 9.9% is: " + amoutToPayWithTaxe + " dollars.");
        return 0;
        }

}
