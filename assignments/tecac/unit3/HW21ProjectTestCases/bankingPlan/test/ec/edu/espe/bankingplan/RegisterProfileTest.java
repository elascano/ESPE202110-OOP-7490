
package ec.edu.espe.bankingplan;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class RegisterProfileTest {
    
    public RegisterProfileTest() {
    }

    /**
     * Test of register method, of class RegisterProfile.
     */
    @Test
    public void testRegisterCamila() {
        System.out.println("register Camila");
        String name = "Camila";
        String lastname = "Teca";
        int id = 1750288969;
        int age = 19;
        String password = "psw123";
        String user = name +""+ lastname +""+ id +""+ age +""+ password;
        RegisterProfile instance = new RegisterProfile();
        String result = instance.register(name, lastname, id, age, password);
        assertEquals(user, result);
    }
    @Test
    public void testRegisterInes() {
        System.out.println("register Inés");
        String name = "Inés";
        String lastname = "Baño";
        int id = 1109809671;
        int age = 33;
        String password = "pñotu78";
        String user = name +""+ lastname +""+ id +""+ age +""+ password;
        RegisterProfile instance = new RegisterProfile();
        String result = instance.register(name, lastname, id, age, password);
        assertEquals(user, result);
    }
    
    @Test
    public void testRegisterPedro() {
        System.out.println("register Pedro");
        String name = "Pedro";
        String lastname = "Muñoz";
        int id = 1940284064;
        int age = 18;
        String password = "peMuñz12";
        String user = name +""+ lastname +""+ id +""+ age +""+ password;
        RegisterProfile instance = new RegisterProfile();
        String result = instance.register(name, lastname, id, age, password);
        assertEquals(user, result);
    }
    
    @Test
    public void testRegisterMiranda() {
        System.out.println("register Miranda");
        String name = "Miranda";
        String lastname = "James";
        int id = 1309573849;
        int age = 14;
        String password = "miJa12";
        String user = name +""+ lastname +""+ id +""+ age +""+ password;
        RegisterProfile instance = new RegisterProfile();
        String result = instance.register(name, lastname, id, age, password);
        assertEquals(user, result);
    }
    
    @Test
    public void testRegisterLuna() {
        System.out.println("register Luna");
        String name = "Luna";
        String lastname = "Gómez";
        int id = 1726688911;
        int age = 10;
        String password = "lugome1";
        String user = name +""+ lastname +""+ id +""+ age +""+ password;
        RegisterProfile instance = new RegisterProfile();
        String result = instance.register(name, lastname, id, age, password);
        assertEquals(user, result);
    }
}
