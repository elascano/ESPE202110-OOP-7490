/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.VolumeCone;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Mateo Maldonado
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of Volume method, of class BasicOperation.
     */
    
    @Test
    public void testVolumeOnlyIntegers() {
        System.out.println("VolumeIntegers");
        float Radio = 4.0F;
        float Height = 8.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 134.04159545898438F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testVolumeOnlyDecimals() {
        System.out.println("VolumeOnlyDecimals");
        float Radio = 0.65F;
        float Height = 0.84F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.37165123224258423F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testVolumeDecimals() {
        System.out.println("VolumeDecimals");
        float Radio = 1.5F;
        float Height = 4.7F;
        BasicOperation instance = new BasicOperation();
        float expResult = 11.074139595031738F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
                
    }
    
    @Test
    public void testVolumeDecimalsIntegers() {
        System.out.println("VolumeDecimalsIntegers");
        float Radio = 5.5F;
        float Height = 6.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 190.0668F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testVolumeRadioNegative() {
        System.out.println("VolumeRadioNegative");
        float Radio = -1.5F;
        float Height = 7.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 16.49340057373047F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testVolumeHeightNegative() {
        System.out.println("VolumeHeightNegative");
        float Radio = 5.0F;
        float Height = -7.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = -183.26F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testVolumeRadioHeightNegative() {
        System.out.println("VolumeRadioHeightNegative");
        float Radio = -15.0F;
        float Height = -11.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = -2591.82F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testVolumeRadioHeightNegativeDecimals() {
        System.out.println("VolumeRadioHeightNegativeDecimals");
        float Radio = -19.73F;
        float Height = -9.65F;
        BasicOperation instance = new BasicOperation();
        float expResult = -3933.7890625F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testVolume() {
        System.out.println("Volume");
        float Radio = 7.0F;
        float Height = 3.56F;
        BasicOperation instance = new BasicOperation();
        float expResult = 182.67356872558594F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testVolume1() {
        System.out.println("Volume");
        float Radio = 0.5F;
        float Height = 3.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.7854F;
        float result = instance.Volume(Radio, Height);
        assertEquals(expResult, result, 0.0);
        
    }
}
