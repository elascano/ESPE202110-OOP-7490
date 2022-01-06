
package ec.edu.espe.inventory.model;

/**
 *
 * @author darling.cruz
 .c*/
public class Price {
    
    private float price;
    private int code;

    public Price(float price, int code) {
        this.price = price;
        this.code = code;
    }
    
    public Price() {
        this.price = price;
        this.code = code;
    }
        
    public void sell(){
        
    }
    public void buy(){
        
    }
    public void kindOfProduct(){
        
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
