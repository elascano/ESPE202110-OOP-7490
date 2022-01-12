package ec.edu.espe.computer.model;

/**
 *
 * @author Javier Paucar
 */
public class Computer {

    private String serialNumber;
    private String model;
    private int ram;
    private int storage;

    public Computer(String serialNumber, String model, int Ram, int storage) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.ram = Ram;
        this.storage = storage;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
    public int getRam() {
        return ram;
    }

    /**
     * @param Ram the ram to set
     */
    public void setRam(int Ram) {
        this.ram = Ram;
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

}
