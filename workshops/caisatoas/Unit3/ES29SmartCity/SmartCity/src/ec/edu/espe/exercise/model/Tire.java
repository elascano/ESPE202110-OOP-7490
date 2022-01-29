
package ec.edu.espe.exercise.model;

/**
 *
 * @author Caisatoa
 */
public class Tire {
    private int id;
    private String typeOftire;
    private int radial;
    private int loadCapacity;
    private String brand;

    public Tire(int id, String typeOftire, int radial, int loadCapacity, String brand) {
        this.id = id;
        this.typeOftire = typeOftire;
        this.radial = radial;
        this.loadCapacity = loadCapacity;
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
    public String getTypeOftire() {
        return typeOftire;
    }

    /**
     * @param typeOftire the typeOftire to set
     */
    public void setTypeOftire(String typeOftire) {
        this.typeOftire = typeOftire;
    }

    /**
     * @return the radial
     */
    public int getRadial() {
        return radial;
    }

    /**
     * @param radial the radial to set
     */
    public void setRadial(int radial) {
        this.radial = radial;
    }

    /**
     * @return the loadCapacity
     */
    public int getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * @param loadCapacity the loadCapacity to set
     */
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
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
