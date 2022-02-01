
package ec.edu.espe.bank.model;

/**
 *
 * @author Camila
 */
public class Movement {
    private String dateMovement;
    private String deposit;
    private String withdraw;
    private String transfer;
    private double amount;

    /**
     * @return the dateMovement
     */
    public String getDateMovement() {
        return dateMovement;
    }

    /**
     * @param dateMovement the dateMovement to set
     */
    public void setDateMovement(String dateMovement) {
        this.dateMovement = dateMovement;
    }

    /**
     * @return the deposit
     */
    public String getDeposit() {
        return deposit;
    }

    /**
     * @param deposit the deposit to set
     */
    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    /**
     * @return the withdraw
     */
    public String getWithdraw() {
        return withdraw;
    }

    /**
     * @param withdraw the withdraw to set
     */
    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    /**
     * @return the transfer
     */
    public String getTransfer() {
        return transfer;
    }

    /**
     * @param transfer the transfer to set
     */
    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
