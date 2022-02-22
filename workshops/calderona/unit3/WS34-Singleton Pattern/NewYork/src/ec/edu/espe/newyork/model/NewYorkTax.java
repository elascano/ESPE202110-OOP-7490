package ec.edu.espe.newyork.model;
import java.util.Scanner;

/**
 *
 * @author Andy Calderon
 */
public class NewYorkTax {  
    //The Tax in New York is 4%
    private static NewYorkTax instance;
    private NewYorkTax(){}
    
    public static NewYorkTax getInstance(){
        
        if(instance == null) 
            instance = new NewYorkTax();
         
        return instance;
    }
    
    public float salesTotal(){
           
        float amoutToPayWithTaxe;
        float taxeApliedToSale;
        final float taxValueInNewYork = (float) 0.04;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce your sale's amount: ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxValueInNewYork;
        amoutToPayWithTaxe = sale + taxeApliedToSale;
        
        System.out.println("The entire amount to pay in New York State including the 4% tax is: " + amoutToPayWithTaxe + " dollars.");
        return 0;
        }

}
