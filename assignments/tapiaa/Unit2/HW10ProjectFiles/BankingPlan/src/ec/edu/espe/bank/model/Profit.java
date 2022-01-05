
package ec.edu.espe.bank.model;

/**
 *
 * @author Rocket Team
 */
public class Profit {

    private float savingsTotal;
    private float checkingTotal;

    public Profit(float savingsTotal, float checkingTotal) {
        this.savingsTotal = savingsTotal;
        this.checkingTotal = checkingTotal;
    }


    public float seeSavings() {

        return 0.0F;

    }

    public float seeChecking() {
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
     * @return the checkingTotal
     */
    public float getCheckingTotal() {
        return checkingTotal;
    }

    /**
     * @param checkingTotal the checkingTotal to set
     */
    public void setCheckingTotal(float checkingTotal) {
        this.checkingTotal = checkingTotal;
    }
}
