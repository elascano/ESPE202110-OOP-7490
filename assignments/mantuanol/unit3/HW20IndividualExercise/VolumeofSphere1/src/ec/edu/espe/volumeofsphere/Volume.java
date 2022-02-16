package ec.edu.espe.volumeofsphere;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonel.M
 */
public class Volume {
    
    public static void main(String[] args)
    {
        volumeSphere();
    }

    private static void volumeSphere() {
        
        
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Enter the radius value"));
        double volume=(4/3)* Math.PI*(Math.pow(radio, 3));
        System.out.println("the volume of the sphere is:" +volume);
        
    }
    

} 


