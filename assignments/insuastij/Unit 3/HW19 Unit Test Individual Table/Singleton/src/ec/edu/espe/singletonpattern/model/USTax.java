
package ec.edu.espe.singletonpattern.model;

/**
 *
 * @author Jonathan Insuasti DEEE-ESPE
 */
public class USTax {
    private static USTax instance;
    
    public static USTax getInstance(){
        if(instance ==null)
        instance = new USTax();
        return instance;
    }
    
    public float salesTotal(float base){
        float total;
        total = (float) (base +base*4.7/100);
        return total;
               
    }
    
    public float getTaxRate(){
        return (float) 4.7;
        
    }
    public void changeTaxRate(float otherTaxRate){
        
    }
    
}
