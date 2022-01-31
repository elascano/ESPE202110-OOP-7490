
package ec.edu.espe.controller;

import java.time.LocalDate;

/**
 *
 * @author Leonel Mantuano
 */
public class Headphones {
 
    private int Price;
    private String model;
    private String Frequency;
    private String Type;
    private String Volume;

    public Headphones(int Price, String model, String Frequency, String Type, String Volume) {
        this.Price = Price;
        this.model = model;
        this.Frequency = Frequency;
        this.Type = Type;
        this.Volume = Volume;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String Volume) {
        this.Volume = Volume;
    }
    
    
   
   
   

}
