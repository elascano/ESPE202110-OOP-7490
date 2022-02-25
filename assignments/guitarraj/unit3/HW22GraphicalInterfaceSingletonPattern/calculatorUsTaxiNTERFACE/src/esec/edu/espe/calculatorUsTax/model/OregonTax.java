package esec.edu.espe.calculatorUsTax.model;

/**
 *
 * @author GUITARRA JHON, ESPE
 */

public class OregonTax {
    private static OregonTax instance;
    private OregonTax(){}
    
    public static OregonTax getInstance(){
        
        if(instance == null) 
            instance = new OregonTax();
         
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
