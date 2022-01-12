
package ec.edu.espe.model;

/**
 *
 * @author AlexanderRuano
 */
public class Computer {
    private String serianNumber;
    private String brad;
    private String model;
    private String ram;
    private String storage;
    private String price;

    public Computer(String serianNumber, String brad, String model, String ram, String storage, String price) {
        this.serianNumber = serianNumber;
        this.brad = brad;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" + "serianNumber=" + serianNumber + ", brad=" + brad + ", model=" + model + ", ram=" + ram + ", storage=" + storage + ", price=" + price + '}';
    }
    
    

    /**
     * @return the serianNumber
     */
    public String getSerianNumber() {
        return serianNumber;
    }

    /**
     * @param serianNumber the serianNumber to set
     */
    public void setSerianNumber(String serianNumber) {
        this.serianNumber = serianNumber;
    }

    /**
     * @return the brad
     */
    public String getBrad() {
        return brad;
    }

    /**
     * @param brad the brad to set
     */
    public void setBrad(String brad) {
        this.brad = brad;
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
