package ec.edu.espe.city.model;

/**
 *
 * @author Altamirano Cristhian
 */
public class Pants {
    private String Color;
    private String Model;
    private String Material;
    private String Brand;
    private String size;
    private float Price;

    public Pants(String Color, String Model, String Material, String Brand, String size, float Price) {
        this.Color = Color;
        this.Model = Model;
        this.Material = Material;
        this.Brand = Brand;
        this.size = size;
        this.Price = Price;
    }

    
    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
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
     * @return the Material
     */
    public String getMaterial() {
        return Material;
    }

    /**
     * @param Material the Material to set
     */
    public void setMaterial(String Material) {
        this.Material = Material;
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
     * @return the Price
     */
    public float getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(float Price) {
        this.Price = Price;
    }
    
    
}
