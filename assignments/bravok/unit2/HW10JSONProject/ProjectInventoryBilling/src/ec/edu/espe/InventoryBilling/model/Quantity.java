
package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author Katherin Bravo
 */
public class Quantity {
     private int id;
    private float number_of_products;
    private String date_of_delivery;
    private double size;

    public Quantity(int id, float number_of_products, String date_of_delivery, double size) {
        this.id = id;
        this.number_of_products = number_of_products;
        this.date_of_delivery = date_of_delivery;
        this.size = size;
    }
    
    

    public void doStuff() {

    }
    public void product_registration() {
        
    }

    private void receipt_date_record() {

    }

    private void size_log() {

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
     * @return the number_of_products
     */
    public float getNumber_of_products() {
        return number_of_products;
    }

    /**
     * @param number_of_products the number_of_products to set
     */
    public void setNumber_of_products(float number_of_products) {
        this.number_of_products = number_of_products;
    }

    /**
     * @return the date_of_delivery
     */
    public String getDate_of_delivery() {
        return date_of_delivery;
    }

    /**
     * @param date_of_delivery the date_of_delivery to set
     */
    public void setDate_of_delivery(String date_of_delivery) {
        this.date_of_delivery = date_of_delivery;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }
}
    



