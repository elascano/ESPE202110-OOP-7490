/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ed.edu.espe.IndividualExerciseTestCases;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mateo Landazuri
 */
public class IndividualExerciseTestCasesTest {
    
    public IndividualExerciseTestCasesTest() {
    }

    /**
     * Test of area method, of class IndividualExerciseTestCases.
     */
    @Test
    public void testArea1cero() {
        System.out.println("area");
        float base = 0.0F;
        float height = 0.0F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 0.0F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    
    }
    @Test
    public void testArea2int() {
        System.out.println("area");
        float base = 4.0F;
        float height = 3.0F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 12.0F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testArea3float() {
        System.out.println("area");
        float base = 6.5F;
        float height = 8.9F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 57.85F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testArea4ceroint() {
        System.out.println("area");
        float base = 0F;
        float height = 8.0F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 0F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testArea5cerofloat() {
        System.out.println("area");
        float base = 0F;
        float height = 8.9F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 0F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testArea6intfloat() {
        System.out.println("area");
        float base = 150.0F;
        float height = 80.90F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 12135F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }    
    @Test
    public void testArea7onenegative() {
        System.out.println("area");
        float base = -150.0F;
        float height = 80.90F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 0F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }   
    @Test
    public void testArea8() {
        System.out.println("area");
        float base = 1000000F;
        float height = 10111F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 10111F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }   
    @Test
    public void testArea9() {
        System.out.println("area");
        float base = -150.0F;
        float height = 80.90F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 0F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }   
 @Test
    public void testArea10float() {
        System.out.println("area");
        float base = 6.5F;
        float height = 8.9F;
        IndividualExerciseTestCases instance = new IndividualExerciseTestCases();
        float expResult = 57.85F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);
    }  
    
    
    
}
