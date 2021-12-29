package ec.edu.espe.model;

/**
 *
 * @author the1/2programmer's
 */
public class DairyProduct {
    
    private int product_id;
    private String dairy;
    private boolean availability;
    private String expiration;
    private int quantity;
    private double price;
    
    @Override
     public String toString() {
         return "DairyProduct{" + "product_id=" + product_id + ", dairy=" + dairy + ", availability=" + availability + ", expiration=" + expiration + ", quantity" + quantity + ", price=" + price + '}';
        
    }
    
   private void buy(){
       
   }
   
   private void aboutProduct (){
       
   }

    public DairyProduct(int product_id, String dairy, boolean availability, String expiration, int quantity, double price) {
        this.product_id = product_id;
        this.dairy = dairy;
        this.availability = availability;
        this.expiration = expiration;
        this.quantity = quantity;
        this.price = price;
    }

    public DairyProduct() {
        
        product_id = 874625;
        dairy = "eggs";
        availability = true;
        expiration = "2021";
        quantity = 6;
        price = 1.00;
        
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
     * @return the dairy
     */
    public String getDairy() {
        return dairy;
    }

    /**
     * @param dairy the dairy to set
     */
    public void setDairy(String dairy) {
        this.dairy = dairy;
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

          
    

