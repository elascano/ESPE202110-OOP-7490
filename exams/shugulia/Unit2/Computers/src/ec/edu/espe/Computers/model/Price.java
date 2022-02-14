
package ec.edu.espe.Computers.model;

/**
 *
 * @author Alan
 */
public class Price {
    private float Cash;
    private float Credit;

    public Price(float Cash, float Credit) {
        this.Cash = Cash;
        this.Credit = Credit;
    }

    /**
     * @return the Cash
     */
    public float getCash() {
        return Cash;
    }

    /**
     * @param Cash the Cash to set
     */
    public void setCash(float Cash) {
        this.Cash = Cash;
    }

    /**
     * @return the Credit
     */
    public float getCredit() {
        return Credit;
    }

    /**
     * @param Credit the Credit to set
     */
    public void setCredit(float Credit) {
        this.Credit = Credit;
    }
}
