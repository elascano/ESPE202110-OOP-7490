package ec.edu.espe.TexasTax.model;

import java.util.Scanner;

/**
 *
 * @author Mateo Maldonado
 *
 */

public class TexasTax {
    
    private static TexasTax instance;
    private TexasTax(){
    
    }
    
    public static TexasTax getInstance(){
        
        if(instance == null) 
            instance = new TexasTax();
         
        return instance;
    }
    
    public float salesTotal(){
           
        float amoutToPayWithTaxe;
        float taxeApliedToSale;
        final float taxValueInTexas = (float) 0.0625;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Please introduce de amount of your sale ---> ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInTexas;
        amoutToPayWithTaxe = sale + taxeApliedToSale;
        
        System.out.println("In Texas State, the total amount to pay including the tax of 6.25% is ---> " + amoutToPayWithTaxe + " dollars.");
        return 0;
        }
}
