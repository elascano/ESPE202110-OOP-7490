package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Guide {

    private String accountManagement;
    private String savingAccount;
    private String checkingAccount;
    private String cdtAccount;
    private String interestManagement;

    public Guide(String accountManagement, String savingAccount, String checkingAccount, String cdtAccount, String interestManagement) {
        this.accountManagement = accountManagement;
        this.savingAccount = savingAccount;
        this.checkingAccount = checkingAccount;
        this.cdtAccount = cdtAccount;
        this.interestManagement = interestManagement;
    }

    @Override
    public String toString() {
        return "Guide{" + "accountManagement=" + accountManagement + ", savingAccount=" + savingAccount + ", checkingAccount=" + checkingAccount + ", cdtAccount=" + cdtAccount + ", interestManagement=" + interestManagement + '}';
    }

    public void learnAccount() {

    }

    public void learnSaving() {

    }

    public void learnChecking() {

    }

    public void learnCdt() {

    }

    public void learnInterest() {

    }

    public Guide() {

    }

    /**
     * @return the accountManagement
     */
    public String getAccountManagement() {
        return accountManagement;
    }

    /**
     * @param accountManagement the accountManagement to set
     */
    public void setAccountManagement(String accountManagement) {
        this.accountManagement = accountManagement;
    }

    /**
     * @return the savingAccount
     */
    public String getSavingAccount() {
        return savingAccount;
    }

    /**
     * @param savingAccount the savingAccount to set
     */
    public void setSavingAccount(String savingAccount) {
        this.savingAccount = savingAccount;
    }

    /**
     * @return the checkingAccount
     */
    public String getCheckingAccount() {
        return checkingAccount;
    }

    /**
     * @param checkingAccount the checkingAccount to set
     */
    public void setCheckingAccount(String checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    /**
     * @return the cdtAccount
     */
    public String getCdtAccount() {
        return cdtAccount;
    }

    /**
     * @param cdtAccount the cdtAccount to set
     */
    public void setCdtAccount(String cdtAccount) {
        this.cdtAccount = cdtAccount;
    }

    /**
     * @return the interestManagement
     */
    public String getInterestManagement() {
        return interestManagement;
    }

    /**
     * @param interestManagement the interestManagement to set
     */
    public void setInterestManagement(String interestManagement) {
        this.interestManagement = interestManagement;
    }

}
