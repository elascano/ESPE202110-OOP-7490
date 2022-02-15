
package ec.edu.espe.bankingplan;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class CheckingAccountTest {
    
    public CheckingAccountTest() {
    }

    /**
     * Test of deposit method, of class CheckingAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double balance = 19087.65;
        double amount = 1789.01;
        CheckingAccount instance = new CheckingAccount();
        double expResult = Math.round(20876.7);
        double result = instance.deposit(balance, amount);
        assertEquals(expResult,  Math.round(result), 0.0);
    }
    
    @Test
    public void testDepositNegatives() {
        System.out.println("deposit negatives");
        double balance = -234.99;
        double amount = -573.01;
        CheckingAccount instance = new CheckingAccount();
        double expResult = -808.0;
        double result = instance.deposit(balance, amount);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of advance method, of class CheckingAccount.
     */
    @Test
    public void testAdvance() {
        System.out.println("advance");
        double balance = 19087.65;
        double amount = -1892.05;
        CheckingAccount instance = new CheckingAccount();
        double expResult = 20979.7;
        double result = instance.advance(balance, amount);
        assertEquals(expResult, result, 0.0);
    }
    public void testAdvanceNegatives() {
        System.out.println("advance negatives");
        double balance = -48291.33;
        double amount = -3212.05;
        CheckingAccount instance = new CheckingAccount();
        double expResult = -45079.3;
        double result = instance.advance(balance, amount);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of transfer method, of class CheckingAccount.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer");
        double balance = -0.0;
        double amount = 1295.99;
        CheckingAccount instance = new CheckingAccount();
        double expResult =  Math.round(-1296.0);
        double result = instance.transfer(balance, amount);
        assertEquals(expResult,  Math.round(result), 0.0);
    }
    @Test
    public void testTransferNegatives() {
        System.out.println("transfer negatives");
        double balance = -89.0;
        double amount = -12.99;
        CheckingAccount instance = new CheckingAccount();
        double expResult =  Math.round(-76.0);
        double result = instance.transfer(balance, amount);
        assertEquals(expResult,  Math.round(result), 0.0);
    }
}
