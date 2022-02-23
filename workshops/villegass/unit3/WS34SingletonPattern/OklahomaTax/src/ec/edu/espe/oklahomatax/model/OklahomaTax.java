package ec.edu.espe.oklahomatax.model;

import java.util.Scanner;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public class OklahomaTax {
    private static OklahomaTax instance;
    float taxRate;
    
    private OklahomaTax() {
        taxRate = 4.5F;
    }

    public static OklahomaTax getInstance() {
        if (instance == null) {
            instance = new OklahomaTax();
        }
        return instance;
    }
    
    public float salesTotal() {
        Scanner keyboard = new Scanner(System.in);
        float priceTotal;
        float objectTotal;
        float OklahomaValueTax = 0.066F;
        float OklahomaTax = 4.5F;
        float value;
        
        System.out.println("The value of your product is:");
        value = keyboard.nextFloat();
        
        objectTotal = value * OklahomaValueTax;
        priceTotal = value  + objectTotal;
        
        System.out.println("In the state of Oklahoma the final price including VAT of " + OklahomaTax +" %" +" is "+ Math.round(priceTotal) +" dollars");
        return 0;
    }
    
    public float getTaxRate(){
        return taxRate;
    }
    
    public void changeTaxRate(float otherTaxRate){
        taxRate = otherTaxRate;
    }
}
