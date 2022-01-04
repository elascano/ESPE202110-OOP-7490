package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Cdt {

    private float InvesmentMoney;
    private float InterestRate;
    private float gain;
    private float time;

    public Cdt(float InvesmentMoney, float InterestRate, float gain, float time) {
        this.InvesmentMoney = InvesmentMoney;
        this.InterestRate = InterestRate;
        this.gain = gain;
        this.time = time;
    }

    public float calculatedCDT() {
        return 0.0F;
    }

    /**
     * @return the InvesmentMoney
     */
    public float getInvesmentMoney() {
        return InvesmentMoney;
    }

    /**
     * @param InvesmentMoney the InvesmentMoney to set
     */
    public void setInvesmentMoney(float InvesmentMoney) {
        this.InvesmentMoney = InvesmentMoney;
    }

    /**
     * @return the InterestRate
     */
    public float getInterestRate() {
        return InterestRate;
    }

    /**
     * @param InterestRate the InterestRate to set
     */
    public void setInterestRate(float InterestRate) {
        this.InterestRate = InterestRate;
    }

    /**
     * @return the gain
     */
    public float getGain() {
        return gain;
    }

    /**
     * @param gain the gain to set
     */
    public void setGain(float gain) {
        this.gain = gain;
    }

    /**
     * @return the time
     */
    public float getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(float time) {
        this.time = time;
    }
}
