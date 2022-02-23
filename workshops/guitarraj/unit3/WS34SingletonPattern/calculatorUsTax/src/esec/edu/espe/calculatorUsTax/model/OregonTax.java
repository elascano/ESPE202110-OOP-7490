package esec.edu.espe.calculatorUsTax.model;
import java.util.Scanner;

/**
 *
 * @author GUITARRA JHON, ESPE
 */
public class OregonTax {
    private static OregonTax instance;
    private OregonTax(){}
    
    public static OregonTax getInstance(){
        
        if(instance == null) 
            instance = new OregonTax();
         
        return instance;
    }
    
    public float salesTotal(){
           
        float TaxesIncluded;
        float ProductTaxes;
        final float taxValueInOregon = (float) 0.099;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce de amount of your sale: ");
        sale = input.nextFloat();  
       
        ProductTaxes = sale * taxValueInOregon;
        TaxesIncluded = sale + ProductTaxes;
        
        System.out.println("Value included tax is: " + TaxesIncluded + " dollars.");
        return 0;
        }

}
