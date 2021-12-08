package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Savings {

    private String accountNumber;
    private String depositDate;
    private String retirementDate;

    public Savings(String accountNumber, String depositDate, String retirementDate) {
        this.accountNumber = accountNumber;
        this.depositDate = depositDate;
        this.retirementDate = retirementDate;
    }

    public float deposit() {

        return 0.0F;
    }

    public float withdraw() {

        return 0.0F;
    }

    public float transfer() {

        return 0.0F;
    }

    public float interestEstimated() {

        return 0.0F;
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
     * @return the depositDate
     */
    public String getDepositDate() {
        return depositDate;
    }

    /**
     * @param depositDate the depositDate to set
     */
    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }

    /**
     * @return the retirementDate
     */
    public String getRetirementDate() {
        return retirementDate;
    }

    /**
     * @param retirementDate the retirementDate to set
     */
    public void setRetirementDate(String retirementDate) {
        this.retirementDate = retirementDate;
    }
}
