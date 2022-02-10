
package ec.edu.espe.sock.model;

/**
 *
 * @author mealvarez
 */
public class Sock {

    private int id;
    private String color;
    private String size;            //  Smal - Medium - Large
    private String material;        
    private float price;              // Dollars

    public Sock(int id, String color, String size, String material, float price) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.material = material;
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
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
