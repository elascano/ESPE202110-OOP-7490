/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Computer.model;

/**
 *
 * @author José
 */
public class Computer {
     private int id;
    private String model; 
    private String Mark;
    private String Ram;
    private int Storage;
    private int cost;

    public Computer(int id, String model, String Mark, String Ram, int Storage, int cost) {
        this.id = id;
        this.model = model;
        this.Mark = Mark;
        this.Ram = Ram;
        this.Storage = Storage;
        this.cost = cost;
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
     * @return the Mark
     */
    public String getMark() {
        return Mark;
    }

    /**
     * @param Mark the Mark to set
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * @return the Ram
     */
    public String getRam() {
        return Ram;
    }

    /**
     * @param Ram the Ram to set
     */
    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    /**
     * @return the Storage
     */
    public int getStorage() {
        return Storage;
    }

    /**
     * @param Storage the Storage to set
     */
    public void setStorage(int Storage) {
        this.Storage = Storage;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
    
  
    
}
