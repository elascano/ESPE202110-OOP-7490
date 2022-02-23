package ec.edu.espe.ProjectTest;

/**
 *
 * @author Andrea Tapia
 */
public class Interest {

    public float amount(float capital, float time, float reason) {
        float amount;
        amount = (float) (Math.pow(1 + reason, time) * capital);
        return amount;

    }

    public float Interest(float amount, float capital) {
        float interest;
        interest = amount - capital;
        return interest;
    }
}
