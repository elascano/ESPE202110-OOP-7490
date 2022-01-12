/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cinformation.model;

/**
 *
 * @author andresmaldonado
 */
public class Computer {
    
     int SerialNumber;
    String Brand;
     String Model;
    int Ram;
    int Storage;
    float Price;

    public Computer(int SerialNumber, String Brand, String Model, int Ram, int Storage, float Price) {
        this.SerialNumber = SerialNumber;
        this.Brand = Brand;
        this.Model = Model;
        this.Ram = Ram;
        this.Storage = Storage;
        this.Price = Price;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int Storage) {
        this.Storage = Storage;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
}
