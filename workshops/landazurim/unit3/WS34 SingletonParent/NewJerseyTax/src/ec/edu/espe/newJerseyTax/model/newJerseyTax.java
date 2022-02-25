package ec.edu.espe.newJerseyTax.model;
import java.util.Scanner;

/**
 *
 * @Mateo Landazuri OOP
 */
public class newJerseyTax {          
    //The New Jersey sales tax rate is 6.625%
    private static newJerseyTax instance;
    private newJerseyTax(){}
    
    public static newJerseyTax getInstance(){
        
        if(instance == null) 
            instance = new newJerseyTax();
         
        return instance;
    }
    
    public float salesTotal(){
           
        float amoutToPayWithTaxe;
        float taxeApliedToSale;
        final float taxValueInOregon = (float) 0.625;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the price of your sale: ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInOregon;
        amoutToPayWithTaxe = sale + taxeApliedToSale;
        
        System.out.println("In New Jersey the total value to pay is:: " + amoutToPayWithTaxe + " Including 6.625% tax");
        return 0;
        }

}




