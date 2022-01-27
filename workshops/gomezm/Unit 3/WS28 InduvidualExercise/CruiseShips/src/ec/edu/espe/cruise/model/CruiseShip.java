
package ec.edu.espe.cruise.model;

/**
 *
 * @author melig
 */
public class CruiseShip {
    private int id;
    private String destination;
    private String travelDate;
    private boolean availability;
    private float price;

    public CruiseShip(int id, String destination, String travelDate, boolean availability, float price) {
        this.id = id;
        this.destination = destination;
        this.travelDate = travelDate;
        this.availability = availability;
        this.price = price;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the travelDate
     */
    public String getTravelDate() {
        return travelDate;
    }

    /**
     * @param travelDate the travelDate to set
     */
    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    /**
     * @return the availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
}
