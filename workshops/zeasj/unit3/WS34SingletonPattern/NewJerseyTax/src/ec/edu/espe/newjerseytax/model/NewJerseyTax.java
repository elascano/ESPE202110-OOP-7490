package ec.edu.espe.newjerseytax.model;

import java.util.Scanner;

/**
 *
 * @author Joel Zeas, DEEL-ESPE
 */
public class NewJerseyTax {
    private static NewJerseyTax instance;
    float taxRate;
    
    private NewJerseyTax() {
        taxRate = 6.62F;
    }

    public static NewJerseyTax getInstance() {
        if (instance == null) {
            instance = new NewJerseyTax();
        }
        return instance;
    }
    
    public float salesTotal() {
        Scanner keyboard = new Scanner(System.in);
        float priceTotal;
        float objectTotal;
        float NewJerseyValueTax = 0.066F;
        float NewJerseyTax = 6.62F;
        float value;
        
        System.out.println("The value of your product is:");
        value = keyboard.nextFloat();
        
        objectTotal = value * NewJerseyValueTax;
        priceTotal = value  + objectTotal;
        
        System.out.println("In the state of New Jersey the final price including VAT of " + NewJerseyTax +" %" +" is "+ Math.round(priceTotal) +" dollars");
        return 0;
    }
    
    public float getTaxRate(){
        return taxRate;
    }
    
    public void changeTaxRate(float otherTaxRate){
        taxRate = otherTaxRate;
    }
}
