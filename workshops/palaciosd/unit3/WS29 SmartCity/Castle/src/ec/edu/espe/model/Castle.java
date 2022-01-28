
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Palacios
 */
public class Castle {
    private String name;
    private String country;
    private int zipCode;
    private int dimensions;
    private int numberOfFloors;
    private ArrayList<Castle> castles;

    @Override
    public String toString() {
        return "Castle{" + "name=" + name + ", country=" + country + ", zipCode=" + zipCode + ", dimensions=" + dimensions + ", numberOfFloors=" + numberOfFloors + ", castles=" + castles + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the zipCode
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the dimensions
     */
    public int getDimensions() {
        return dimensions;
    }

    /**
     * @param dimensions the dimensions to set
     */
    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * @return the numberOfFloors
     */
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * @param numberOfFloors the numberOfFloors to set
     */
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    /**
     * @return the castles
     */
    public ArrayList<Castle> getCastles() {
        return castles;
    }

    /**
     * @param castles the castles to set
     */
    public void setCastles(ArrayList<Castle> castles) {
        this.castles = castles;
    }

    
}
