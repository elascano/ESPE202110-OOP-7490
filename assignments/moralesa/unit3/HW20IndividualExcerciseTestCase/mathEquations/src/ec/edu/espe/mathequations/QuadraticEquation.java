
package ec.edu.espe.mathequations;

/**
 *
 * @author Anthony Morales, DEEL-ESPE
 */
public class QuadraticEquation {
    public float equation(float valuea, float valueb, float valuec){
        float equation;
        double number = (valueb*valueb) - (4*valuea*valuec);
        equation = (float) (-valueb + Math.sqrt(number)) / 2*valuea;
        return equation;
    }
}
