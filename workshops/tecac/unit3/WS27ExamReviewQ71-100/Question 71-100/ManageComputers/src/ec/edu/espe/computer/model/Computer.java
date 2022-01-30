
package ec.edu.espe.computer.model;

/**
 *
 * @author Camila
 */
public class Computer {
    private int serialNumber;
    private String brand;
    private String model;
    private float ram;
    private float storage;
    private float price;

    public Computer(int serialNumber, String brand, String model, float ram, float storage, float price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }
    
    public void manageComputers(){
    
    }

    /**
     * @return the serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
     * @return the ram
     */
    public float getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(float ram) {
        this.ram = ram;
    }

    /**
     * @return the storage
     */
    public float getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(float storage) {
        this.storage = storage;
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

}
