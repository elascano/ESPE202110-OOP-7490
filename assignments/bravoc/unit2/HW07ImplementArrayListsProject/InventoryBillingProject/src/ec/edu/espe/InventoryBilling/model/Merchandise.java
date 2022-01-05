
package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author Christian Bravo
 */
public class Merchandise {
    private int Price;
    private int Quanty;

    public Merchandise(int Price, int Quanty) {
        this.Price = Price;
        this.Quanty = Quanty;
    }
    
    public void doStuff(){
        
    }
    private void RegisterPrice(){
        
    }
    private void RegisterQuantity(){
        
    } 

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    /**
     * @return the Quanty
     */
    public int getQuanty() {
        return Quanty;
    }

    /**
     * @param Quanty the Quanty to set
     */
    public void setQuanty(int Quanty) {
        this.Quanty = Quanty;
    }
}

    

