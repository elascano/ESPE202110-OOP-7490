
package ec.edu.espe.distance;

/**
 *
 * @author Sebastian Caisatoa
 */
public class DistancePoints {
    public float distance(int x1,int x2,int y1,int y2,int z1,int z2){
            double Result = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))+((z2-z1)*(z2-z1)));    
            return (float) Result;
    }
}
