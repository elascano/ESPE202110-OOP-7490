/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.computerManagement.model;

/**
 *
 * @author Leandro Quinga 
 */
public class ComputerManagement {
    private String serialNumber;
    private String brand;
    private String model;
    private String ram;
    private String storage;
    
    public void Delete(){
        
    }

    @Override
    public String toString() {
        return "ComputerManagement{" + "serialNumber=" + serialNumber + ", brand=" + brand + ", model=" + model + ", ram=" + ram + ", storage=" + storage + '}';
    }

    public ComputerManagement(String serialNumber, String brand, String model, String ram, String storage) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
    
}

    