package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Profit {

    private float savingsTotal;
    private float chekingTotal;

    public Profit(float savingsTotal, float chekingTotal) {
        this.savingsTotal = savingsTotal;
        this.chekingTotal = chekingTotal;
    }

    public float seeSavings() {
        return 0.0F;
    }

    float seeCheking() {
        return 0.0F;
    }

    /**
     * @return the savingsTotal
     */
    public float getSavingsTotal() {
        return savingsTotal;
    }

    /**
     * @param savingsTotal the savingsTotal to set
     */
    public void setSavingsTotal(float savingsTotal) {
        this.savingsTotal = savingsTotal;
    }

    /**
     * @return the chekingTotal
     */
    public float getChekingTotal() {
        return chekingTotal;
    }

    /**
     * @param chekingTotal the chekingTotal to set
     */
    public void setChekingTotal(float chekingTotal) {
        this.chekingTotal = chekingTotal;
    }
}
