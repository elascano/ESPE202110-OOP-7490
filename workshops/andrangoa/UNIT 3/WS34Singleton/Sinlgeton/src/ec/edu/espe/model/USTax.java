
package ec.edu.espe.model;

/**
 *
 * @author Alex Andrango
 */
public class USTax {
    private static USTax instance;
    float taxRate;
    private USTax(){
        taxRate=12.0F;
    };
    
    public static USTax getInstance() {
        if(instance == null)
        instance = new USTax();
        return instance;
}
    public float salesTotal(float base) {
        float total;
        total = base + base*taxRate/100;
        return total;
       
    
    }

    public float getTaxRate(){
        return taxRate;
    }
    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(USTax aInstance) {
        instance = aInstance;
    }
    
    
    
}
