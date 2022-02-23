package ec.edu.espe.model;

/**
 *
 * @author alex_
 */
public class TvBox {
    private int id;
    private String brand;
    private int sizeByInches;
    private int yearReleased;
    private String color;
    private String price;  

    public TvBox(int id, String brand, int sizeByInches, int yearReleased, String color, String price) {
        this.id = id;
        this.brand = brand;
        this.sizeByInches = sizeByInches;
        this.yearReleased = yearReleased;
        this.color = color;
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
     * @return the sizeByInches
     */
    public int getSizeByInches() {
        return sizeByInches;
    }

    /**
     * @param sizeByInches the sizeByInches to set
     */
    public void setSizeByInches(int sizeByInches) {
        this.sizeByInches = sizeByInches;
    }

    /**
     * @return the yearReleased
     */
    public int getYearReleased() {
        return yearReleased;
    }

    /**
     * @param yearReleased the yearReleased to set
     */
    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
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
