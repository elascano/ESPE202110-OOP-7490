package ec.edu.espe.ustax.model;


import java.util.Scanner;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class ArizonaTax {

    private static ArizonaTax instance;
    float taxRate;
    
    private ArizonaTax() {
        taxRate = 5.6F;
    }

    public static ArizonaTax getInstance() {
        if (instance == null) {
            instance = new ArizonaTax();
        }
        return instance;
    }
    
    public float salesTotal() {
        Scanner keyboard = new Scanner(System.in);
        float priceTotal;
        float objectTotal;
        float ArizonaValueTax = 0.056F;
        float ArizonaTax = 5.60F;
        float value;
        
        System.out.println("The value of your product is:");
        value = keyboard.nextFloat();
        
        objectTotal = value * ArizonaValueTax;
        priceTotal = value  + objectTotal;
        
        System.out.println("In Arizona state the total price including the tax of " + ArizonaTax +" %" +" is "+ Math.round(priceTotal) +" dollars");
        return 0;
    }
    
    public float getTaxRate(){
        return taxRate;
    }
    
    public void changeTaxRate(float otherTaxRate){
        taxRate = otherTaxRate;
    }
    
}
