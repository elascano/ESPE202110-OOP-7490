package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Management {

    private float income;
    private float transaction;

    public Management(float income, float transaction) {
        this.income = income;
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Management{" + ", income=" + income + ", transaction=" + transaction + '}';
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
