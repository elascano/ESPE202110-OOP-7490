package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Profit {

    private float savingTotal;
    private float checkingTotal;

    public Profit(float savingTotal, float checkingTotal) {
        this.savingTotal = savingTotal;
        this.checkingTotal = checkingTotal;
    }

    @Override
    public String toString() {
        return "Profit{" + "savingTotal=" + savingTotal + ", checkingTotal=" + checkingTotal + '}';
    }

    public float seeSaving() {
        return 0.F;
    }

    public float seeChecking() {
        return 0.F;
    }

    /**
     * @return the savingTotal
     */
    public float getSavingTotal() {
        return savingTotal;
    }

    /**
     * @param savingTotal the savingTotal to set
     */
    public void setSavingTotal(float savingTotal) {
        this.savingTotal = savingTotal;
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
