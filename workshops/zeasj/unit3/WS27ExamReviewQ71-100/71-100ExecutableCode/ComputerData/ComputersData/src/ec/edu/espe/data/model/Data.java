package ec.edu.espe.data.model;

/**
 *
 * @author Joel Zeas
 */
public class Data {
    private int serialNumber;
    private String brand;
    private String model;
    private String ram;
    private String Storage;
    private float price; 

    public Data(int serialNumber, String brand, String model, String ram, String Storage, float price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.Storage = Storage;
        this.price = price;
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
    public String getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * @return the Storage
     */
    public String getStorage() {
        return Storage;
    }

    /**
     * @param Storage the Storage to set
     */
    public void setStorage(String Storage) {
        this.Storage = Storage;
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