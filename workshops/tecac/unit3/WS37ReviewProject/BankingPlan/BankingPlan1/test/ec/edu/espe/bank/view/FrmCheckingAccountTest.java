package ec.edu.espe.bank.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class FrmCheckingAccountTest {

    public FrmCheckingAccountTest() {
    }

    /**
     * Test of deposit method, of class FrmCheckingAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        float balance = 23.45F;
        float amount = 25.34F;
        FrmCheckingAccount instance = new FrmCheckingAccount();
        instance.deposit(balance, amount);
        float expResult = 48.79F;
        float result = (float) Double.sum(balance, amount);
        assertEquals(expResult, result, 0.001);

    }

    /**
     * Test of withDraw method, of class FrmCheckingAccount.
     */
    @Test
    public void testWithDraw() {
        System.out.println("withDraw");
        float balance = 23.45F;
        float amount = -25.34F;
        FrmCheckingAccount instance = new FrmCheckingAccount();
        instance.withDraw(balance, amount);
        float expResult = -1.89F;
        float result = (float) Double.sum(balance, amount);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of transfer method, of class FrmCheckingAccount.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer");
        float balance = 23.45F;
        float amount = 25.34F;
        FrmCheckingAccount instance = new FrmCheckingAccount();
        instance.transfer(balance, amount);
        float expResult = 48.79F;
        float result = (float) Double.sum(balance, amount);
        assertEquals(expResult, result, 0.001);
    }

}
