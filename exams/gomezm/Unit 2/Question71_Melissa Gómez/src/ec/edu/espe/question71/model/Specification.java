
package ec.edu.espe.question71.model;

/**
 *
 * @author Melissa Gómez
 */
public class Specification {
    private int serialNumber; 
    private String brand;
    private String model;
    private int RAM;
    private int storage;
    private float price;

    public Specification(int serialNumber, String brand, String model, int RAM, int storage, float price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.storage = storage;
        this.price = price;
    }

    public Specification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the RAM
     */
    public int getRAM() {
        return RAM;
    }

    /**
     * @param RAM the RAM to set
     */
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    /**
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
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

    public void AddSpecification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void SearchSpecificationID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
