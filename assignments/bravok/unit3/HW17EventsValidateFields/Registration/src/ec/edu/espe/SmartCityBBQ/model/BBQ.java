package ec.edu.espe.SmartCityBBQ.model;

import com.mongodb.client.MongoCollection;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author Katherin Bravo
 */
public class BBQ {
    
   private float price;
   private int Quantity ;
   private String Types;
   private String dressing;
   private String color;
   private String offer;

    public BBQ(float price, int Quantity, String Types, String dressing, String color, String offer) {
        this.price = price;
        this.Quantity = Quantity;
        this.Types = Types;
        this.dressing = dressing;
        this.color = color;
        this.offer = offer;
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
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * @return the Types
     */
    public String getTypes() {
        return Types;
    }

    /**
     * @param Types the Types to set
     */
    public void setTypes(String Types) {
        this.Types = Types;
    }

    /**
     * @return the dressing
     */
    public String dressing() {
        return dressing;
    }

    /**
     * @param dressing the dressing to set
     */
    public void setdressing(String dressing) {
        this.dressing = dressing;
    }

    /**
     * @return the color
     */
    public String getcolor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setcolor(String color) {
        this.color = color;
    }

    /**
     * @return the offer
     */
    public String getoffer() {
        return offer;
    }

    /**
     * @param offer the offer to set
     */
    public void setoffer(String offer) {
        this.offer = offer;
    }
   
   
   
}
