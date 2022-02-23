
package ec.edu.espe.chair.model;

/**
 *
 * @author Melissa Gómez
 */
public class Chair {
    private int id;
    private String model;
    private String material;
    private boolean backrest;
    private float price;

    public Chair(int id, String model, String material, boolean backrest, float price) {
        this.id = id;
        this.model = model;
        this.material = material;
        this.backrest = backrest;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the backrest
     */
    public boolean isBackrest() {
        return backrest;
    }

    /**
     * @param backrest the backrest to set
     */
    public void setBackrest(boolean backrest) {
        this.backrest = backrest;
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
