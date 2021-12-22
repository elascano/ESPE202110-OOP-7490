package ec.edu.espe.model;



/**
 *
 * @author the1/2programmer's
 */
public class Canned {
    
    private int product_id;
    private String canned;
    private boolean availability;
    private String expiration;
    private String size;
    private double price;

   
  
    
    
    
    
    
    @Override
    public String toString() {
        return "Canned{" + "product_id=" + product_id + ", canned=" + canned + ", availability=" + availability + ", expiration=" + expiration + ", size=" + size + ", price=" + price + '}';
    }

    
    
   private void sell(){
       
   }
   
   private void aboutProduct (){
       
   }

   public Canned(){
       
   
        product_id = 12345567;
        canned = "tuna";
        availability = true;
        expiration = "2021";
        size = "medium";
        price = 4.76;
        
   }
        
    public Canned(int product_id, String canned, boolean availability, String expiration, String size, double price) {
        this.product_id = product_id;
        this.canned = canned;
        this.availability = availability;
        this.expiration = expiration;
        this.size = size;
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
     * @return the canned
     */
    public String getCanned() {
        return canned;
    }

    /**
     * @param canned the canned to set
     */
    public void setCanned(String canned) {
        this.canned = canned;
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
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
        
