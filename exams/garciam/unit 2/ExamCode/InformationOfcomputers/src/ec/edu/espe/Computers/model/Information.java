
package ec.edu.espe.Computers.model;

/**
 *
 * @author mayerly Garcia
 */
public class Information {
    private int SerialNumber;
    private String Brand;
    private String Model;
    private int Ram;
    private String Storage;
    private float price;

    public Information(int SerialNumber, String Brand, String Model, int Ram, String Storage, float price) {
        this.SerialNumber = SerialNumber;
        this.Brand = Brand;
        this.Model = Model;
        this.Ram = Ram;
        this.Storage = Storage;
        this.price = price;
    }

    
    
    /**
     * @return the SerialNumber
     */
    public int getSerialNumber() {
        return SerialNumber;
    }

    /**
     * @param SerialNumber the SerialNumber to set
     */
    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the Ram
     */
    public int getRam() {
        return Ram;
    }

    /**
     * @param Ram the Ram to set
     */
    public void setRam(int Ram) {
        this.Ram = Ram;
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
