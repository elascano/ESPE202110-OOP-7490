package ec.edu.espe.ohmLaw;

/**
 *
 * @author mealvarez
 */
public class VoltageCalculation {
    
 
    public float voltage(float intensity, float resistance){
        float voltageValue;
        
        voltageValue = intensity * resistance;
        return voltageValue;
        
        }
}
