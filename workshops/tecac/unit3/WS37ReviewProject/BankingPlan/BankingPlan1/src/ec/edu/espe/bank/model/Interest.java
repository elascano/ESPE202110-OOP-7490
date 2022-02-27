package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Interest {

    private float interest;

    public Interest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Interest{" + "interest=" + interest + '}';
    }

    public void generateInterestSaving() {

    }

    public Interest() {

    }

    /**
     * @return the interest
     */
    public float getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(float interest) {
        this.interest = interest;
    }

}
