/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.mathoperation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KERLY CORREA
 */
public class DiscountTest {
    
    public DiscountTest() {
    }

    /**
     * Test of discount method, of class Discount.
     */
    @Test
    public void testDiscount() {
        System.out.println("discount");
        float multiply = 12.0F;
        float multiplier = 2.0F;
        float priceDiscount = 1.0F;
        Discount instance = new Discount();
        float productWithDiscount = 23.76F;
        float expResult = (float)Math.round(productWithDiscount*1000f)/1000;;
        float result = instance.discount(multiply, multiplier, priceDiscount);
        assertEquals(expResult, result, 0.0);
    
    }
    
}
