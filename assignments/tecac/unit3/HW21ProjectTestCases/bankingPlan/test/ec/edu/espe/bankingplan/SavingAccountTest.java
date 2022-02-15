
package ec.edu.espe.bankingplan;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class SavingAccountTest {
    
    public SavingAccountTest() {
    }

    /**
     * Test of deposit method, of class SavingAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double balance = 0.0;
        double amount = 1567900.99;
        SavingAccount instance = new SavingAccount();
        double expResult = 1567900.99;
        double result = instance.deposit(balance, amount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testDepositNegatives() {
        System.out.println("deposit negatives");
        double balance = -890.11;
        double amount = -781.99;
        SavingAccount instance = new SavingAccount();
        double expResult = -1672.1;
        double result = instance.deposit(balance, amount);
        assertEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of withdraw method, of class SavingAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double balance = 511.55;
        double amount = 975.68;
        SavingAccount instance = new SavingAccount();
        double expResult = Math.round(-464.1);
        double result = instance.withdraw(balance, amount);
        assertEquals(expResult, Math.round(result), 0.0);
        
    }
    
     @Test
    public void testWithdrawNegatives() {
        System.out.println("withdraw negatives");
        double balance = -511.55;
        double amount = -975.68;
        SavingAccount instance = new SavingAccount();
        double expResult = Math.round(464.1);
        double result = instance.withdraw(balance, amount);
        assertEquals(expResult, Math.round(result), 0.0);
        
    }
    /**
     * Test of transfer method, of class SavingAccount.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer");
        double balance = 766.03;
        double amount = -90.56;
        SavingAccount instance = new SavingAccount();
        double expResult = Math.round(856.6);
        double result = instance.transfer(balance, amount);
        assertEquals(expResult, Math.round(result), 0.0);
        
    }
    
     @Test
    public void testTransferNegatives() {
        System.out.println("transfer negatives");
        double balance = -76.03;
        double amount = -90.56;
        SavingAccount instance = new SavingAccount();
        double expResult = Math.round(14.5);
        double result = instance.transfer(balance, amount);
        assertEquals(expResult, Math.round(result), 0.0);
        
    }
    /**
     * Test of estimateInterest method, of class SavingAccount.
     */
    @Test
    public void testEstimateInterest() {
        System.out.println("estimateInterest");
        double capital = 568.95;
        double reason = 3.41;
        double time = 10;
        double interest = 1582923185.0;
        double amount = 1582923754.0;
        SavingAccount instance = new SavingAccount();
        double expResult = Math.round(1582923185.0);
        double result = instance.estimateInterest(capital, reason, time, interest, amount);
        assertEquals(expResult, Math.round(result), 0.0);
        
    }
    
    @Test
    public void testEstimateInterestSmallValues() {
        System.out.println("estimateInterest small values");
        double capital = -109.95;
        double reason = 3.10;
        double time = 2;
        double interest = -1738.3;
        double amount = -1848.3;
        SavingAccount instance = new SavingAccount();
        double expResult = Math.round(-1738.3);
        double result = instance.estimateInterest(capital, reason, time, interest, amount);
        assertEquals(expResult, Math.round(result), 0.0);
        
    }
}
