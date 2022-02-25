
package ec.edu.espe.tire.model;

/**
 *
 * @author WorkbotsTeam
 */
public class Purchase {
    
    private int quantity;
    private float price;
    private int code;

    public Purchase(int quantity, float price, int code) {
        this.quantity = quantity;
        this.price = price;
        this.code = code;
    }
    
    public Purchase() {
        this.quantity = quantity;
        this.price = price;
        this.code = code;
    }
    public void time(){
        
    }
    
    public void sale(){
        
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
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
}
