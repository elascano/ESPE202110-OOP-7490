package ec.edu.espe.bank.model;

import java.util.ArrayList;

/**
 *
 * @author RocketTeam
 */
public class Account {

    private float balanceInquiry;
    private float withdrawal;
    private float transfer;
    private ArrayList<Saving> savings;
    private ArrayList<Checking> checking;
    private ArrayList<Cdt> cdt;

    public Account(float balanceInquiry, float withdrawal, float transfer, ArrayList<Saving> savings, ArrayList<Checking> checking, ArrayList<Cdt> cdt) {
        this.balanceInquiry = balanceInquiry;
        this.withdrawal = withdrawal;
        this.transfer = transfer;
        this.savings = savings;
        this.checking = checking;
        this.cdt = cdt;
    }

    @Override
    public String toString() {
        return "Account{" + "balanceInquiry=" + balanceInquiry + ", withdrawal=" + withdrawal + ", transfer=" + transfer + ", savings=" + savings + ", checking=" + checking + ", cdt=" + cdt + '}';
    }

    public void requestBalanceInquiry() {

    }

    public void seeWithdraw() {

    }

    public void transfer() {

    }

    public Guide useGuide() {

        return new Guide();

    }
    public Account(){
        
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
     * @return the withdrawal
     */
    public float getWithdrawal() {
        return withdrawal;
    }

    /**
     * @param withdrawal the withdrawal to set
     */
    public void setWithdrawal(float withdrawal) {
        this.withdrawal = withdrawal;
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

    /**
     * @return the savings
     */
    public ArrayList<Saving> getSavings() {
        return (ArrayList<Saving>) savings;
    }

    /**
     * @param savings the savings to set
     */
    public void setSavings(ArrayList<Saving> savings) {
        this.savings = savings;
    }

    /**
     * @return the checking
     */
    public ArrayList<Checking> getChecking() {
        return checking;
    }

    /**
     * @param checking the checking to set
     */
    public void setChecking(ArrayList<Checking> checking) {
        this.checking = checking;
    }

    /**
     * @return the cdt
     */
    public ArrayList<Cdt> getCdt() {
        return cdt;
    }

    /**
     * @param cdt the cdt to set
     */
    public void setCdt(ArrayList<Cdt> cdt) {
        this.cdt = cdt;
    }

}