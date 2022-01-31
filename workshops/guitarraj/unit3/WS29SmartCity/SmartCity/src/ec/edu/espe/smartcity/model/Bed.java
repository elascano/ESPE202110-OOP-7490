package ec.edu.espe.smartcity.model;

import com.mongodb.client.MongoCollection;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author Guitarra Jhon
 */
public class Bed {
    
   private float price;
   private String mattressType;
   private String frames;
   private String materials;
   private String plazas;

    public Bed(float price, String mattressType, String frames, String materials, String plazas) {
        this.price = price;
        this.mattressType = mattressType;
        this.frames = frames;
        this.materials = materials;
        this.plazas = plazas;
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
     * @return the mattressType
     */
    public String getMattressType() {
        return mattressType;
    }

    /**
     * @param mattressType the mattressType to set
     */
    public void setMattressType(String mattressType) {
        this.mattressType = mattressType;
    }

    /**
     * @return the frames
     */
    public String getFrames() {
        return frames;
    }

    /**
     * @param frames the frames to set
     */
    public void setFrames(String frames) {
        this.frames = frames;
    }

    /**
     * @return the materials
     */
    public String getMaterials() {
        return materials;
    }

    /**
     * @param materials the materials to set
     */
    public void setMaterials(String materials) {
        this.materials = materials;
    }

    /**
     * @return the plazas
     */
    public String getPlazas() {
        return plazas;
    }

    /**
     * @param plazas the plazas to set
     */
    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }
   
   
   
   
}
