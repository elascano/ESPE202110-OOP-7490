/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mayerly Garcia
 */
public class CaffeineBeverageTest {
    
    public CaffeineBeverageTest() {
    }

    /**
     * Test of prepareRecipe method, of class CaffeineBeverage.
     */
    @Test
    public void testPrepareRecipe() {
        System.out.println("prepareRecipe");
        CaffeineBeverage instance = new CaffeineBeverageImpl();
        instance.prepareRecipe();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of boilWater method, of class CaffeineBeverage.
     */
    @Test
    public void testBoilWater() {
        System.out.println("boilWater");
        CaffeineBeverage instance = new CaffeineBeverageImpl();
        instance.boilWater();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of brew method, of class CaffeineBeverage.
     */
    @Test
    public void testBrew() {
        System.out.println("brew");
        CaffeineBeverage instance = new CaffeineBeverageImpl();
        instance.brew();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pourlnCup method, of class CaffeineBeverage.
     */
    @Test
    public void testPourlnCup() {
        System.out.println("pourlnCup");
        CaffeineBeverage instance = new CaffeineBeverageImpl();
        instance.pourlnCup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCondiments method, of class CaffeineBeverage.
     */
    @Test
    public void testAddCondiments() {
        System.out.println("addCondiments");
        CaffeineBeverage instance = new CaffeineBeverageImpl();
        instance.addCondiments();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wantsCondiments method, of class CaffeineBeverage.
     */
    @Test
    public void testWantsCondiments() {
        System.out.println("wantsCondiments");
        CaffeineBeverage instance = new CaffeineBeverageImpl();
        boolean expResult = false;
        boolean result = instance.wantsCondiments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CaffeineBeverageImpl extends CaffeineBeverage {

        public void brew() {
        }

        public void addCondiments() {
        }
    }
    
}
