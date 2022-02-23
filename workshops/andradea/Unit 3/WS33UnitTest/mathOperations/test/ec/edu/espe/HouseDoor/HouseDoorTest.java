
package ec.edu.espe.HouseDoor;

import ec.edu.espe.HouseDoor.HouseDoor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrade Alan
 */
public class HouseDoorTest {
    
    public HouseDoorTest() {
    }

    /**
     * Test of add method, of class BasicOperations.HouseDoorTest
     */
    @Test
    public void testAddDoor1() {
        System.out.println("add Door");
        float door1 = 1.5F;
        float door2 = 1.4F;
        HouseDoor instance = new HouseDoor();
        float expResult = 2.9F;
        float result = instance.add(door1, door2);
        assertEquals(expResult, result, 2.9F);
        
    }
     @Test
        public void testAddDoor2() {
            System.out.println("add Door");
            float door1 = 1.7F;
            float door2 = 1.3F;
            HouseDoor instance = new HouseDoor();
            float expResult = 3.0F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 3.0F);

        }    
             @Test
        public void testAddDoor3() {
            System.out.println("add Door");
            float door1 = 1F;
            float door2 = 7F;
            HouseDoor instance = new HouseDoor();
            float expResult = 8F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 0F);

        }
             @Test
        public void testAddDoor4() {
            System.out.println("add Door");
            float door1 = 2F;
            float door2 = 1.5F;
            HouseDoor instance = new HouseDoor();
            float expResult = 3.5F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 3.5F);

        }
            @Test
        public void testAddDoor5() {
            System.out.println("add Door");
            float door1 = 1.6F;
            float door2 = 1.2F;
            HouseDoor instance = new HouseDoor();
            float expResult = 2.8F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 2.8F);

        }
             @Test
        public void testAddDoor6() {
            System.out.println("add Door");
            float door1 = 1.9F;
            float door2 = 1.4F;
            HouseDoor instance = new HouseDoor();
            float expResult = 3.3F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 3.3F);

        }
             @Test
        public void testAddDoor7() {
            System.out.println("add Door");
            float door1 = 1.5F;
            float door2 = 2.7F;
            HouseDoor instance = new HouseDoor();
            float expResult = 4.2F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 4.2F);

        }
             @Test
        public void testAddDoor8() {
            System.out.println("add Door");
            float door1 = 1.8F;
            float door2 = 1.0F;
            HouseDoor instance = new HouseDoor();
            float expResult = 2.8F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 2.8F);

        }
             @Test
        public void testAddDoor9() {
            System.out.println("add Door");
            float door1 = 2.9F;
            float door2 = 1.1F;
            HouseDoor instance = new HouseDoor();
            float expResult = 4.0F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 4.0F);

        }
             @Test
        public void testAddDoor10() {
            System.out.println("add Door");
            float door1 = 2.3F;
            float door2 = 2.7F;
            HouseDoor instance = new HouseDoor();
            float expResult = 5.0F;
            float result = instance.add(door1, door2);
            assertEquals(expResult, result, 5.0F);

        }
}

