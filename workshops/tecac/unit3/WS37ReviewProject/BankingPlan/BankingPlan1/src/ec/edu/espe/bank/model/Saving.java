package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Saving {

    private String name;
    private String accountNumber;
    private float amount;

    public Saving(String name, String accountNumber, float amount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Saving{" + "accountNumber=" + getAccountNumber() + '}';
    }

    public float deposit() {
        return 0.F;
    }

    public float withdraw() {
        return 0.F;
    }

    public float transfer() {
        return 0.F;
    }

    public Interest estimateInterest() {
        return new Interest();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

}
