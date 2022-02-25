package ec.edu.espe.singleton.model;

/**
 *
 * @author Andrea Tapia
 */
public class USTax {

    private static USTax instance;
    private USTax (){
        float taxRate = 12.0F;
    }
    

    public static USTax getInstance() {
        if (instance == null) 
            instance = new USTax();
            return instance;
        }
      
    public float salesTotal() {
      return 2500;
    }
}

