package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Account {

    private float balanceInquiry;
    private float withdrawals;
    private float savings;
    private float checking;
    private float CDT;
    private float transfer;

    
   
    public Account(float balanceInquiry, float withdrawals, float savings, float checking, float CDT, float transfer) {
        this.balanceInquiry = balanceInquiry;
        this.withdrawals = withdrawals;
        this.savings = savings;
        this.checking = checking;
        this.CDT = CDT;
        this.transfer = transfer;
    }

    public void requestBalance() {

    }

    public void seewithdraws() {

    }

    public void transfer() {

    }

    /**
     * @return the balanceInquiry
     */
    public float getBalanceInquiry() {
        return balanceInquiry;
    }

    /**
     * @param balanceInquiry the balanceInquiry to set
     */
    public void setBalanceInquiry(float balanceInquiry) {
        this.balanceInquiry = balanceInquiry;
    }

    /**
     * @return the withdrawals
     */
    public float getWithdrawals() {
        return withdrawals;
    }

    /**
     * @param withdrawals the withdrawals to set
     */
    public void setWithdrawals(float withdrawals) {
        this.withdrawals = withdrawals;
    }

    /**
     * @return the savings
     */
    public float getSavings() {
        return savings;
    }

    /**
     * @param savings the savings to set
     */
    public void setSavings(float savings) {
        this.savings = savings;
    }

    /**
     * @return the checking
     */
    public float getChecking() {
        return checking;
    }

    /**
     * @param checking the checking to set
     */
    public void setChecking(float checking) {
        this.checking = checking;
    }

    /**
     * @return the CDT
     */
    public float getCDT() {
        return CDT;
    }

    /**
     * @param CDT the CDT to set
     */
    public void setCDT(float CDT) {
        this.CDT = CDT;
    }

    /**
     * @return the transfer
     */
    public float getTransfer() {
        return transfer;
    }

    /**
     * @param transfer the transfer to set
     */
    public void setTransfer(float transfer) {
        this.transfer = transfer;
    }

}
