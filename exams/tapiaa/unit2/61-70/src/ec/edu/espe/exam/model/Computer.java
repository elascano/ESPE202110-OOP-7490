
package ec.edu.espe.exam.model;

/**
 *
 * @author Andrea Tapia
 */
public class Computer {
    private int serialNumber;
    private char brand;
    private String model;
    private int Ram;
    private int storage;
    private float price;

    public Computer(int serialNumber, char brand, String model, int Ram, int storage, float price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.Ram = Ram;
        this.storage = storage;
        this.price = price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public char getBrand() {
        return brand;
    }

    public void setBrand(char brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}

    