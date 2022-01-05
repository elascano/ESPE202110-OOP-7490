package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Management {

    private String checkStatus;
    private float income;
    private float transaction;

    public Management(String checkStatus, float income, float transaction) {
        this.checkStatus = checkStatus;
        this.income = income;
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Management{" + "checkStatus=" + checkStatus + ", income=" + income + ", transaction=" + transaction + '}';
    }

    public void checkAccount() {

    }

    public void registerIncome() {

    }

    public void registerTransaction() {

    }

    public Account manageAccount() {

        return new Account();

    }

    /**
     * @return the checkStatus
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    /**
     * @param checkStatus the checkStatus to set
     */
    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * @return the income
     */
    public float getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(float income) {
        this.income = income;
    }

    /**
     * @return the transaction
     */
    public float getTransaction() {
        return transaction;
    }

    /**
     * @param transaction the transaction to set
     */
    public void setTransaction(float transaction) {
        this.transaction = transaction;
    }

}