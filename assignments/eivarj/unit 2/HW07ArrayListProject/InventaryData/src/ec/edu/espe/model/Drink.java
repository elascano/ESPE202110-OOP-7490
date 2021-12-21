package ec.edu.espe.model;

/**
 *
 * @author the1/2programmer's
 */
public class Drink {
    private int product_id;
    private String drink;
    private boolean availability;
    private String expiration;
    private String size;
    private int quantity;
    private double price;

    public Drink(int id, String name, boolean availability, String expiration, double quantity, String size, double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
     public String toString() {
         return "Drink{" + "product_id=" + product_id + ", drink=" + drink + ", availability=" + availability + ", expiration=" + expiration + ", quantity" + quantity + ", size=" + size + ", price=" + price + '}';
        
    }
    
   private void buy(){
       
   }
   
   private void aboutProduct (){
       
   }

   public Drink(){
       
   
        product_id = 12345567;
        drink= "coca-cola";
        availability = true;
        expiration = "2023";
        size = "medium";
        quantity= 1;
        price = 1.30;
        
   }

    public Drink(int product_id, String drink, boolean availability, String expiration, String size, int quantity, double price) {
        this.product_id = product_id;
        this.drink = drink;
        this.availability = availability;
        this.expiration = expiration;
        this.size = size;
        this.quantity = quantity;
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
     * @return the drink
     */
    public String getDrink() {
        return drink;
    }

    /**
     * @param drink the drink to set
     */
    public void setDrink(String drink) {
        this.drink = drink;
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

    
}
