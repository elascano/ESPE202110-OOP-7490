
package ec.edu.espe.Computer.model;

/**
 *
 * @author JaimeEivarEaxam
 */
public class Computer {
    private int SerialNumber;
    private String BrandModel; 
    private int Ram;
    private int Storage;
    private float Price;


    public Computer(int SerialNumber, String BrandModel, int Ram, int Storage, float Price) {
        this.SerialNumber = SerialNumber;
        this.BrandModel = BrandModel;
        this.Ram = Ram;
        this.Storage = Storage;
        this.Price = Price;
    }

    
    
    
    /**
     * @return the SerialNumber
     */
    public int getSerialNumber() {
        return SerialNumber;
    }

    /**
     * @param id the id to set
     */
    public void setSerialNumber(int id) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * @return the Brandmodel
     */
    public String getBrandModel() {
        return BrandModel;
    }

    /**
     * @param model the model to set
     */
    public void setBrandModell(String model) {
        this.BrandModel = BrandModel;
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
     * @return the Price
     */
    public float getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPricer(float Price) {
        this.Price = Price;
    }
    
    
    
    
}
