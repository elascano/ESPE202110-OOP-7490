
package ec.edu.espe.VolumeCone;

/**
 *
 * @author Mateo Maldonado
 */
public class BasicOperation {
    public float Volume(float Radio, float Height){
        float VolumeCone;
        
        
        VolumeCone = (float) (3.1416*Radio*Radio*Height/3);
        
        return VolumeCone;
    }
}
