
package ec.edu.espe.microwave.model;

/**
 *
 * @author mealvarez
 */
public class Microwave {

    private int id;
    private String brand;
    private String model;
    private String color;
    private int capacity;      //  Liters
    private int potency;        // Watts
    private boolean energySave;
    private boolean grill;
    private boolean status;    // On - Off
    private int price;

    public Microwave(int id, String brand, String model, String color, int capacity, int potency, boolean energySave, boolean grill, boolean status, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.potency = potency;
        this.energySave = energySave;
        this.grill = grill;
        this.status = status;
        this.price = price;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the potency
     */
    public int getPotency() {
        return potency;
    }

    /**
     * @param potency the potency to set
     */
    public void setPotency(int potency) {
        this.potency = potency;
    }

    /**
     * @return the energySave
     */
    public boolean isEnergySave() {
        return energySave;
    }

    /**
     * @param energySave the energySave to set
     */
    public void setEnergySave(boolean energySave) {
        this.energySave = energySave;
    }

    /**
     * @return the grill
     */
    public boolean isGrill() {
        return grill;
    }

    /**
     * @param grill the grill to set
     */
    public void setGrill(boolean grill) {
        this.grill = grill;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
  
    
}
