/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Icomputer.model;

/**
 *
 * @author USUARIO
 */
public class Computer {
    private int serialNumber;
    private String brand;
    private String model;
    private String rAM;
    private String storage;
    private float price;

    public Computer(int serialNumber, String brand, String model, String rAM, String storage, float price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.rAM = rAM;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" + "serialNumber=" + serialNumber + ", brand=" + brand + ", model=" + model + ", rAM=" + rAM + ", storage=" + storage + ", price=" + price + '}';
    }
    
    

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getrAM() {
        return rAM;
    }

    public void setrAM(String rAM) {
        this.rAM = rAM;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
       
}
