package ec.edu.espe.MedicalPro.Bill;

/**
 *
 * @author Jose Guzman
 */
public class BillOperation {
    public float add(float value){
        
        float iva= (float) (value*0.12);
        float bill;
        bill=value+iva;
        return bill;
    }
}
