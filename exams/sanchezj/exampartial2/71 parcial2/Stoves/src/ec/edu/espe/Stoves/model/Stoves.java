/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Stoves.model;

/**
 *
 * @author José
 */
public class Stoves {
     private int id;
    private String model; 
    private String Size;
    private String Color;
    private int Weight;


    public Stoves(int id, String model, String size, String Ram, int Storage, int cost) {
        this.id = id;
        this.model = model;
        this.Size = size;
        this.Color = Ram;
        this.Weight = Storage;

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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the Size
     */
    public String getSize() {
        return Size;
    }

    /**
     * @param Mark the Size to set
     */
    public void setSize(String Mark) {
        this.Size = Mark;
    }

    /**
     * @return the Color
     */
    public String getRam() {
        return Color;
    }

    /**
     * @param Ram the Color to set
     */
    public void setRam(String Ram) {
        this.Color = Ram;
    }

    /**
     * @return the Weight
     */
    public int getStorage() {
        return Weight;
    }

    /**
     * @param Storage the Weight to set
     */
    public void setStorage(int Storage) {
        this.Weight = Storage;
    }

  
    
  
    
}
  

