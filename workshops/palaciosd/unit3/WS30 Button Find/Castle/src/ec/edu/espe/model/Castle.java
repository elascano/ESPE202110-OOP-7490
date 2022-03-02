
package ec.edu.espe.model;


/**
 *
 * @author Sebastian Palacios
 */
public class Castle {
    private String name;
    private String country;
    private String zipCode;
    private String dimensions;
    private String numberOfFloor;

    public Castle(String name, String country, String zipCode, String dimensions, String numberOfFloor) {
        this.name = name;
        this.country = country;
        this.zipCode = zipCode;
        this.dimensions = dimensions;
        this.numberOfFloor = numberOfFloor;
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
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the dimensions
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * @param dimensions the dimensions to set
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * @return the numberOfFloor
     */
    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    /**
     * @param numberOfFloor the numberOfFloor to set
     */
    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}    