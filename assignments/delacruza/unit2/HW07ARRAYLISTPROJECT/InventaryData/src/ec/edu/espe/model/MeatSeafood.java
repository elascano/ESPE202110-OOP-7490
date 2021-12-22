
package ec.edu.espe.model;

/**
 *
 * @author the1/2programmer's
 */
public class MeatSeafood {
    
    private int product_id;
    private String meatSeafood;
    private boolean availability;
    private String expiration;
    private double price;

    @Override
    public String toString() {
        return "MeatSeafood{" + "product_id=" + product_id + ", meatSeafood=" + meatSeafood + ", availability=" + availability + ", expiration=" + expiration + ", price=" + price + '}';
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
     * @return the meatSeafood
     */
    public String getMeatSeafood() {
        return meatSeafood;
    }

    /**
     * @param meatSeafood the meatSeafood to set
     */
    public void setMeatSeafood(String meatSeafood) {
        this.meatSeafood = meatSeafood;
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
     * @return the expiration
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
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

    public MeatSeafood(int product_id, String meatSeafood, boolean availability, String expiration, double price) {
        this.product_id = product_id;
        this.meatSeafood = meatSeafood;
        this.availability = availability;
        this.expiration = expiration;
        this.price = price;
    }

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
