
package ec.edu.espe.food.model;

import java.time.LocalDate;

/**
 *
 * @author Andy Calderon
 */
public class Food {
    private int id;
    private int customerid;
    private String name;
    private String price;
    private String order;

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", customerid=" + customerid + ", name=" + name + ", price=" + price + ", order=" + order + '}';
    }
    


    public Food(int id, int customerid, String name, String price, String order) {
        this.id = id;
        this.customerid = customerid;
        this.name = name;
        this.price = price;
        this.order = order;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

   
    
}
