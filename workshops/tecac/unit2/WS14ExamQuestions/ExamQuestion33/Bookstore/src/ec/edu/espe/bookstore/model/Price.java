
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Camila
 */
public class Price {
    private float price;

    public Price(float price) {
        this.price = price;
    }

    public Price() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
