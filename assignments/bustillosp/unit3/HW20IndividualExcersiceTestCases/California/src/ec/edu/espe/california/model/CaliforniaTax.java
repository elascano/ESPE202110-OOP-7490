package ec.edu.espe.california.model;
import java.util.Scanner;

/**
 *
 * @author Pablo Bustillos
 */
// California Tax is 7.25%
public class CaliforniaTax {          
    private static CaliforniaTax instance;
    private CaliforniaTax(){}
    
    public static CaliforniaTax getInstance(){
        
        if(instance == null) 
            instance = new CaliforniaTax();
         
        return instance;
    }
    
    public float salesTotal(){
           
        float amoutToPayWithTaxe;
        float taxeApliedToSale;
        final float taxCalifornia = (float) 0.0725;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Start by indicating the amount of your sale: ");
        sale = input.nextFloat();  
       
        taxeApliedToSale = sale * taxCalifornia;
        amoutToPayWithTaxe = sale + taxeApliedToSale;
        
        System.out.println("In California State the tax of 7.25% is: " + amoutToPayWithTaxe + " dollars.");
        return 0;
        }

}
