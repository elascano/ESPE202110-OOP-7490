/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.controlWeapon.Controller;

import javax.swing.table.DefaultTableModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Sanchez, DEEL-ESPE
 */
public class AmmunitionControllerTest {
    
    public AmmunitionControllerTest() {
    }

    /**
     * Test of find method, of class AmmunitionController.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String name = "";
        DefaultTableModel table = null;
        AmmunitionController.find(name, table);
       
    }
    
}
