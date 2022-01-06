package ec.edu.espe.bank.model;

import java.util.ArrayList;

/**
 *
 * @author RocketTeam
 */
public class Saving {

    private String accountNumber;
    private ArrayList<Money> money;
    private ArrayList<Profit> profits;

    public Saving(String accountNumber, ArrayList<Money> money, ArrayList<Profit> profits) {
        this.accountNumber = accountNumber;
        this.money = money;
        this.profits = profits;
    }

    @Override
    public String toString() {
        return "Saving{" + "accountNumber=" + accountNumber + ", money=" + money + ", profits=" + profits + '}';
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
        return  new Interest();
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
     * @return the money
     */
    public ArrayList<Money> getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(ArrayList<Money> money) {
        this.money = money;
    }

    /**
     * @return the profits
     */
    public ArrayList<Profit> getProfits() {
        return profits;
    }

    /**
     * @param profits the profits to set
     */
    public void setProfits(ArrayList<Profit> profits) {
        this.profits = profits;
    }

}