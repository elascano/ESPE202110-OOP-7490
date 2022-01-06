
package ec.edu.espe.inventory.model;

/**
 *
 * @author darling.cruz
 */
public class Sale {
    private float price;
    private String name;
    private int quantity;

    public Sale(float price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }
    
    public Sale() {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }
    
    public boolean buy(int stock){
        return false;
    }
    
    public void time(){
        
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
}
