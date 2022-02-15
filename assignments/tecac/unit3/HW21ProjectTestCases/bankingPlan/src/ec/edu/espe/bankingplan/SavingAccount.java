
package ec.edu.espe.bankingplan;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class SavingAccount {
    public double deposit(double balance, double amount){
        double availableBalance;
        availableBalance = balance+amount;
        
        return availableBalance;
    }
    
    public double withdraw(double balance, double amount){
        double availableBalance;
        availableBalance = balance-amount;
        
        return availableBalance;
    }
    
     public double transfer(double balance, double amount){
        double availableBalance;
        availableBalance = balance-amount;
        
        return availableBalance;
    }
     
    public double estimateInterest(double capital,double reason, double time , double interest, double amount){
        amount = Math.pow(1+reason,time)*capital;
        interest= amount-capital;
        return interest;
    } 
}
