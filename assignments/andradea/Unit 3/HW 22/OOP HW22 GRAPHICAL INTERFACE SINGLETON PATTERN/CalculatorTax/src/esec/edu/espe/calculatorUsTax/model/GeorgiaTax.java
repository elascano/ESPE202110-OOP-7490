package esec.edu.espe.calculatorUsTax.model;

/**
 *
 * @author Alan Andrade
 */

public class GeorgiaTax {
    private static GeorgiaTax instance;
    private GeorgiaTax(){}
    
    public static GeorgiaTax getInstance(){
        
        if(instance == null) 
            instance = new GeorgiaTax();
         
        return instance;
    }
    
    public float salesTotal(float sale,float taxValueInOregon){
           
        float TaxesIncluded;
        float ProductTaxes;
        
        ProductTaxes = sale * taxValueInOregon;
        TaxesIncluded = sale + ProductTaxes;

        return TaxesIncluded;
        }

}
