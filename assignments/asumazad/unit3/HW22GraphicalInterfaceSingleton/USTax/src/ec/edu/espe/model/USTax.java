<<<<<<< HEAD

package ec.edu.espe.model;

/**
 *
 * @author Dylan Asumaza
 */
public class USTax {
    private static USTax instance;
    float taxRate;
    public USTax(){
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
=======

package ec.edu.espe.model;

/**
 *
 * @author Dylan Asumaza
 */
public class USTax {
    private static USTax instance;
    float taxRate;
    public USTax(){
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
>>>>>>> ae7d89acb2e025d477c15b0b6c0f0f787722c643
