
package ec.edu.espe.exercise.model;

/**
 *
 * @author ALEJANDRODELACRUZ
 */
public class WildShield {
    private int id;
    private String windshieldtype;
    private int color;
    private int armoredwindshield;
    private String brand;

    public WildShield(int id, String windshieldtype, int color, int armoredwindshield, String brand) {
        this.id = id;
        this.windshieldtype = windshieldtype;
        this.color = color;
        this.armoredwindshield = armoredwindshield;
        this.brand = brand;
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
     * @return the typeOftire
     */
    public String getwindshieldtype() {
        return windshieldtype;
    }

    /**
     * @param typeOftire the typeOftire to set
     */
    public void setwindshieldtype(String typeOftire) {
        this.windshieldtype = typeOftire;
    }

    /**
     * @return the radial
     */
    public int getcolor() {
        return color;
    }

    /**
     * @param radial the radial to set
     */
    public void setcolor(int radial) {
        this.color = radial;
    }

    /**
     * @return the loadCapacity
     */
    public int getarmoredwindshield() {
        return armoredwindshield;
    }

    /**
     * @param loadCapacity the loadCapacity to set
     */
    public void setarmoredwindshield(int loadCapacity) {
        this.armoredwindshield = loadCapacity;
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
    
    
}
