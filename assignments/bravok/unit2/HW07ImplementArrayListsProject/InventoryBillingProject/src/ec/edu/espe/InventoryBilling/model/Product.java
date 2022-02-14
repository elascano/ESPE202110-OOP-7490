
package ec.edu.espe.InventoryBilling.model;

import java.util.ArrayList;

/**
 *
 * @author Katherin Bravo
 */
public class Product {
    
   private String name;
    private float price;
    private int amount;
    private String mark;

    public Product(String name, float price, int amount, String mark) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.mark = mark;
    }

    public Product(String a, String a0, int i, String a1, String a2, ArrayList<Supplier> suppliers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    public void doStuff() {

    }

    private void ProductPrice() {

    }

    private void ProductAmount() {

    }

    private void ProductMark() {

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
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
}
    

