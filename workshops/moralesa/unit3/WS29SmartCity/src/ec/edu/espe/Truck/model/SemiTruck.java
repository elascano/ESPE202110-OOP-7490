
package ec.edu.espe.Truck.model;

/**
 *
 * @author Anthony Morales
 */
public class SemiTruck {
    
    private int id;
    private String brand;
    private float price;
    private String color;
    private String styles;

    public SemiTruck(int id, String brand, float price, String color, String styles) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.styles = styles;
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
     * @return the styles
     */
    public String getStyles() {
        return styles;
    }

    /**
     * @param styles the styles to set
     */
    public void setStyles(String styles) {
        this.styles = styles;
    }
}
