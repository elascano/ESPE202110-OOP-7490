
package ec.edu.espe.door.model;

import com.mongodb.client.result.DeleteResult;
import java.time.LocalDate;
import org.bson.Document;

/**
 *
 * @author Andy Calderon
 */
public class Door {

    public static void insertOne(Document data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static DeleteResult deleteOne(Document document) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object find() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int id;
    private int customerid;
    private String color;
    private String price;
    private String model;

    @Override
    public String toString() {
        return "Door{" + "id=" + id + ", customerid=" + customerid + ", color=" + color + ", price=" + price + ", model=" + model + '}';
    }



    public Door(int id, int customerid, String color, String price, String model) {
        this.id = id;
        this.customerid = customerid;
        this.color = color;
        this.price = price;
        this.model = model;
        
        

   
    
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}