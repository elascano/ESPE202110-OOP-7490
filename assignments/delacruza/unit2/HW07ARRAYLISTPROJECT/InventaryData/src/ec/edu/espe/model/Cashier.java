package ec.edu.espe.model;

/**
 *
 * @author the1/2programmer's
 */
public class Cashier {
    private int id;
    private int product;
    
    
    public void sell() {
        
    }

    public Cashier(int id, int product) {
        this.id = id;
        this.product = product;
    }
    
    public Cashier() {
        id =0;
        product = 3;
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the product
     */
    public int getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(int product) {
        this.product = product;
    }
    
}
