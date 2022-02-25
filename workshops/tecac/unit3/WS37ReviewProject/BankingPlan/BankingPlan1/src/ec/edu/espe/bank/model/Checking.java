package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Checking {

    public float Totalbalance(float deposist, float advance, float transfer) {

        float balance;
        balance = deposist - (advance + transfer);
        return balance;
    }
    private String accountNumber;

    public Checking(String accountNumber) {
        this.accountNumber = accountNumber;

    }

    public float deposit() {
        return 0.F;
    }

    public float advance() {
        return 0.F;
    }

    public float transfer() {
        return 0.F;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
