package ec.edu.espe.computerManagement.model;


/**
 *
 * @author Daniel Lincango

 */


  public class Computer {

    private String SerialNumber;
    private String brand;
    private String model;
    private String Ram;
    private String storage;
    private String price;

    public Computer(String SerialNumber, String brand, String model, String Ram, String storage, String price) {
        this.SerialNumber = SerialNumber;
        this.brand = brand;
        this.model = model;
        this.Ram = Ram;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" + "SerialNumber=" + SerialNumber + ", brand=" + brand + ", model=" + model + ", Ram=" + Ram + ", storage=" + storage + ", price=" + price + '}';
    }

    
    
    
    
    /**
     * @return the SerialNumber
     */
    public String getSerialNumber() {
        return SerialNumber;
    }

    /**
     * @param SerialNumber the SerialNumber to set
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
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
     * @return the storage
     */
    public String getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(String storage) {
        this.storage = storage;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }
    
    
}


    