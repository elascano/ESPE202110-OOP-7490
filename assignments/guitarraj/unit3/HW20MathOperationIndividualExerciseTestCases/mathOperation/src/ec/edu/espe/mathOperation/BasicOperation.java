
package ec.edu.espe.mathOperation;
import java.lang.Math;
/**
 *
 * @author jGuitarra Jhon
 */
public class BasicOperation {

    public double add(double addend1,double addend2){
        double sum,result;
        sum = addend1*2*Math.PI*1000 + addend2*20;
        result = 2*Math.sin(sum);
        double scale = Math.pow(10,7);
        double rounded = Math.round(result*scale)/scale;
        return rounded;
    }
}
