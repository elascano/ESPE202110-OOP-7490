
package ec.edu.espe.struck.model;

/**
 *
 * @author Anthony Morales
 */
public class Semitruck {
    private int id;
    private String brand;
    private String color;
    private String styles;
    private float price;

    public Semitruck(int id, String brand, String color, String type, float price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.styles = type;
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
     * @return the type
     */
    public String getType() {
        return styles;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.styles = type;
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
