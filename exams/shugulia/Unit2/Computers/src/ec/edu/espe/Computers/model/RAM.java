
package ec.edu.espe.Computers.model;

/**
 *
 * @author Alan
 */
public class RAM {
    private float Capacity;

    public RAM(float Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * @return the Capacity
     */
    public float getCapacity() {
        return Capacity;
    }

    /**
     * @param Capacity the Capacity to set
     */
    public void setCapacity(float Capacity) {
        this.Capacity = Capacity;
    }
}
