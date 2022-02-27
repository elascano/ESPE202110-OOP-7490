package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Cdt {

    private float investmentMoney;
    private float interestRate;
    private int timeInDays;

    public Cdt(float investmentMoney, float interestRate, int timeInDays) {
        this.investmentMoney = investmentMoney;
        this.interestRate = interestRate;
        this.timeInDays = timeInDays;

    }

    @Override
    public String toString() {
        return "Cdt{" + "investmentMoney=" + investmentMoney + ", interestRate=" + interestRate + ", timeInDays=" + timeInDays + '}';
    }

    public float calculateCdt() {

        return 0.F;

    }

    /**
     * @return the investmentMoney
     */
    public float getInvestmentMoney() {
        return investmentMoney;
    }

    /**
     * @param investmentMoney the investmentMoney to set
     */
    public void setInvestmentMoney(float investmentMoney) {
        this.investmentMoney = investmentMoney;
    }

    /**
     * @return the interestRate
     */
    public float getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @return the timeInDays
     */
    public int getTimeInDays() {
        return timeInDays;
    }

    /**
     * @param timeInDays the timeInDays to set
     */
    public void setTimeInDays(int timeInDays) {
        this.timeInDays = timeInDays;
    }

}
