
package ec.edu.espe.bankingplan;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class CheckingAccount {
    public double deposit(double balance, double amount){
        double availableBalance;
        availableBalance = balance+amount;
        
        return availableBalance;
    }
    
    public double advance(double balance, double amount){
        double availableBalance;
        availableBalance = balance-amount;
        
        return availableBalance;
    }
    
    public double transfer(double balance, double amount){
        double availableBalance;
        availableBalance = balance-amount;
        
        return availableBalance;
    }
}
