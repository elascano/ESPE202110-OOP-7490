package ec.edu.espe.circlearea;
import java.text.DecimalFormat;

/**
 *
 * @author Mayerly Garcia
 */
public class CircleArea {

    public double Area( double radio) {
        double area;
        double PI = Math.PI;
        area = Math.PI * Math.pow(radio, 2);
        DecimalFormat df = new DecimalFormat("#.000");
        return area;
    }
}
