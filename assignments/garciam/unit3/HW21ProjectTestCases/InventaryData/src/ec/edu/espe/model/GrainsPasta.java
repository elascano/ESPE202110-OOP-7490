package ec.edu.espe.model;

/**
 *
 * @author the1/2programmer's
 */
public class GrainsPasta {
    
    private int product_id;
    private String grainsPasta;
    private boolean availability;
    private String expiration;
    private double price;

    public GrainsPasta(int id, String name, boolean availability, Double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "grainsPasta{"+ "product_id=" + product_id + ", grainsPasta=" + grainsPasta + ", availability=" + availability + ", expiration=" + expiration + ", price=" + price + '}';
    }
    
    private void sell(){
       
   }
   
    private void aboutProduct (){
       
   }

    public GrainsPasta(int product_id, String gainsPasta, boolean availability, String expiration, double price) {
        this.product_id = product_id;
        this.grainsPasta = gainsPasta;
        this.availability = availability;
        this.expiration = expiration;
        this.price = price;
    }

    public GrainsPasta() {
        product_id = 56845;
        grainsPasta = "noodles";
        availability = true;
        expiration = "2024";
        price = 1.10;
        
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
     * @return the gainsPasta
     */
    public String getGainsPasta() {
        return grainsPasta;
    }

    /**
     * @param gainsPasta the gainsPasta to set
     */
    public void setGainsPasta(String gainsPasta) {
        this.grainsPasta = gainsPasta;
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
    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
