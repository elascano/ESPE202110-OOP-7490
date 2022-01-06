package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Money {

    private float minValue;
    private float maxValue;

    public Money(float minValue, float maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return "Money{" + "minValue=" + minValue + ", maxValue=" + maxValue + '}';
    }

    public void estimateMaximum() {

    }

    public void estimateMinimum() {

    }

    /**
     * @return the minValue
     */
    public float getMinValue() {
        return minValue;
    }

    /**
     * @param minValue the minValue to set
     */
    public void setMinValue(float minValue) {
        this.minValue = minValue;
    }

    /**
     * @return the maxValue
     */
    public float getMaxValue() {
        return maxValue;
    }

    /**
     * @param maxValue the maxValue to set
     */
    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }

}
