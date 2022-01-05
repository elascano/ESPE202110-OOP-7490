
package ec.edu.espe.model;

/**
 *
 * @author Mayerly 
 */
public class CleaningSupply {

    public static String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int product_id;
    private String cleaningSupply;
    private boolean availability;
    private double price;

    public CleaningSupply(int product_id, String cleaningSupply, boolean availability, double price) {
        this.product_id = product_id;
        this.cleaningSupply = cleaningSupply;
        this.availability = availability;
        this.price = price;
    }

    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the cleaningSupply
     */
    public String getCleaningSupply() {
        return cleaningSupply;
    }

    /**
     * @param cleaningSupply the cleaningSupply to set
     */
    public void setCleaningSupply(String cleaningSupply) {
        this.cleaningSupply = cleaningSupply;
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
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
    
    
    
}
