/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculateWeight;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quinga Leandro DEEE-ESPE
 */
public class CalculateWeightTest {
    
    public CalculateWeightTest() {
    }

    /**
     * Test of weight1 method, of class CalculateWeight.
     */
    @Test
    public void testWeight1() {
        System.out.println("weight1");
        float mass = 6.0F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = 58.86F;
        float result = instance.weight1(mass, gravity);
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of weight2 method, of class CalculateWeight.
     */
    @Test
    public void testWeight2() {
        System.out.println("weight2");
        float mass = 159.0F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = 1559.79F;
        float result = instance.weight2(mass, gravity);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of weight3 method, of class CalculateWeight.
     */
    @Test
    public void testWeight3() {
        System.out.println("weight3");
        float mass = -19.34F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = -189.7254F;
        float result = instance.weight3(mass, gravity);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of weight4 method, of class CalculateWeight.
     */
    @Test
    public void testWeight4() {
        System.out.println("weight4");
        float mass = 19735.335F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = 193603.65625F;
        float result = instance.weight4(mass, gravity);
        assertEquals(expResult, result, 0.01);
       
    }

    /**
     * Test of weight5 method, of class CalculateWeight.
     */
    @Test
    public void testWeight5() {
        System.out.println("weight5");
        float mass = 1.889F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = 18.53109F;
        float result = instance.weight5(mass, gravity);
        assertEquals(expResult, result, 0.01);
       
    }

    /**
     * Test of weight6 method, of class CalculateWeight.
     */
    @Test
    public void testWeight6() {
        System.out.println("weight6");
        float mass = -173.638F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = -1703.38878F;
        float result = instance.weight6(mass, gravity);
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of weight7 method, of class CalculateWeight.
     */
    @Test
    public void testWeight7() {
        System.out.println("weight7");
        float mass = 0.0F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = 0.0F;
        float result = instance.weight7(mass, gravity);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of weight8 method, of class CalculateWeight.
     */
    @Test
    public void testWeight8() {
        System.out.println("weight8");
        float mass = -0.17729F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = -1.7392149F;
        float result = instance.weight8(mass, gravity);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of weight9 method, of class CalculateWeight.
     */
    @Test
    public void testWeight9() {
        System.out.println("weight9");
        float mass = 0.17729F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = 1.7392149F;
        float result = instance.weight9(mass, gravity);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of weight10 method, of class CalculateWeight.
     */
    @Test
    public void testWeight10() {
        System.out.println("weight10");
        float mass = 33.2F;
        float gravity = 9.81F;
        CalculateWeight instance = new CalculateWeight();
        float expResult = 325.692F;
        float result = instance.weight10(mass, gravity);
        assertEquals(expResult, result, 0.01);
        
    }
    
}
