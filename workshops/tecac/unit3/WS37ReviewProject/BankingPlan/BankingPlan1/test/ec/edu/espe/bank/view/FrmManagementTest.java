/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.bank.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class FrmManagementTest {

    public FrmManagementTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        float transaction = 23.45F;
        float income = 25.34F;
        FrmManagement instance = new FrmManagement();
        instance.add(transaction, income);
        float expResult = 48.79F;
        float result = (float) Double.sum(transaction, income);
        assertEquals(expResult, result, 0.001);

    }

    @Test
    public void testDeposit() {
        System.out.println("add");
        float transaction = 25.45F;
        float income = 25.34F;
        FrmManagement instance = new FrmManagement();
        instance.add(transaction, income);
        float expResult = 50.79F;
        float result = (float) Double.sum(transaction, income);
        assertEquals(expResult, result, 0.001);
    }
}
