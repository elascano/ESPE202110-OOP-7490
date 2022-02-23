package esec.edu.espe.calculatorUsTax.model;
import java.util.Scanner;

/**
 *
 * @author darling.cruz
 */
public class NewYork {
    private static NewYork instance;
    private NewYork(){}
    
    public static NewYork getInstance(){
        
        if(instance == null) 
            instance = new NewYork();
         
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
