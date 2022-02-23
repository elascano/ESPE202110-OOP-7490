
package ec.edu.espe.model;

/**
 *
 * @author Alexander Ruano, DEEL-ESPE
 */
public class USTax {
    private static USTax instance;
    float taxRate;
    float base;

    private USTax(){
        taxRate=6.25F;
        base = 15.0F;
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float salesTotal() {
        float total;
        total=base+base*taxRate/100;
        return total;

    }

    public float getTaxRate() {
        return taxRate;
    }
    public void changeTaxRate(float otherTaxRate){
        taxRate=otherTaxRate;
    }
    
}
