package ec.edu.espe.model;

import com.mongodb.client.MongoCollection;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author Guitarra Jhon
 */
public class Hotel {
    
    private String name;
    private int bedrooms;
    private String address;
    private float price;
    private boolean availability;
    
    public Hotel(String name, int bedrooms, String address, float price, boolean availability) {
                
        this.name = name;
        this.bedrooms = bedrooms;
        this.address = address;
        this.price = price;
        this.availability = availability;
        
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
     * @return the bedrooms
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     * @param bedrooms the bedrooms to set
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @return the availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
