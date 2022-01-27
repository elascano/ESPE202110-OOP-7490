
package ec.edu.espe.SmartCityBBQ.model;

/**
 *
 * @author Katherin Bravo
 */

public class Inventory {
    private int id;
    private String name;
    private int quantity;
    private float price;
    private String condition;
    private String date;
    private String comments;

    public Inventory(int id, String name,int quantity, float price, String condition, String date, String comments) {
        this.id = id;
        this.name = name;        
        this.quantity = quantity;
        this.price = price;
        this.condition = condition;
        this.date = date;
        this.comments = comments;
    }

    public Inventory() {
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
//
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
//
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
     * @return the condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
