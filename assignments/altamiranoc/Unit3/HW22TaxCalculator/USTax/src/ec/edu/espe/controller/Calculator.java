package ec.edu.espe.controller;

import ec.edu.espe.model.USTax;

/**
 *
 * @author Altamirano Cristhian
 */
public class Calculator {
    private static USTax instance;
    float taxRate;

    
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
