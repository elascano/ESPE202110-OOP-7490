
package ec.edu.espe.house.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class TelevisionDimensions {
    
    public float calculateHighOfTv(double diagonalSize){
        
       double high;
 
       high = diagonalSize*2.21;
       BigDecimal bd = new BigDecimal(high).setScale(2, RoundingMode.HALF_UP);
       double highRounded = bd.doubleValue();
       
       
       System.out.println("Rounded High Tv value: " + highRounded);
  
       return (float) highRounded;
    
        }
    
    
      
    public double calculateWidthOfTv(double diagonalSize){
        
        double width;
        
        width = (diagonalSize*1.245);
        BigDecimal bd = new BigDecimal(width).setScale(2, RoundingMode.HALF_UP);
        double widthRounded = bd.doubleValue();
       
        System.out.println("Rounded Width Tv value: " + widthRounded);
        
        return (float) widthRounded;
        
        }  
    
}
