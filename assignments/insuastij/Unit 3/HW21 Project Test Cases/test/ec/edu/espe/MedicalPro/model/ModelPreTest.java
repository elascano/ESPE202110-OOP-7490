/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MedicalPro.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Insuasti DEEE-ESPE
 */
public class ModelPreTest {
    
    public ModelPreTest() {
    }

    /**
     * Test of add method, of class ModelPre.
     */
    @Test
    public void testAdd() {
        System.out.println("ID");
        String addend1 = "";
        String addend2 = "";
        ModelPre instance = new ModelPre();
        String expResult = "";
        String result = instance.add(addend1, addend2);

    }

    /**
     * Test of add1 method, of class ModelPre.
     */
    @Test
    public void testAdd1() {
        System.out.println("ID");
        String addend1 = "";
        String addend2 = "";
        ModelPre instance = new ModelPre();
        String expResult = "";
        String result = instance.add1(addend1, addend2);
        assertEquals(expResult, result);

    }

    /**
     * Test of add2 method, of class ModelPre.
     */
    @Test
    public void testAdd2() {
        System.out.println("ID");
        String addend1 = "F005-";
        String addend2 = "Secretary";
        ModelPre instance = new ModelPre();
        String expResult = "F005-Secretary";
        String result = instance.add2(addend1, addend2);
        assertEquals(expResult, result);

    }
    
}
