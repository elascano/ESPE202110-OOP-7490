
package ec.edu.espe.book.controller;

/**
 *
 * @author darling.cruz
 */
public class Price {
    
    private float price;
    
    
    public Price( ) {
        price = 0;
    }
    
    public Price(float price) {
        this.price = price;
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
