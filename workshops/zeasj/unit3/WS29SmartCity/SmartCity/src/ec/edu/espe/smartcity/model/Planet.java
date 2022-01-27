package ec.edu.espe.smartcity.model;

import org.bson.Document;

/**
 *
 * @author Joel Zeas
 */
public class Planet {

    public static void insertOne(Document data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    private String name;
    private String size;
    private String type;
    private String diameter;
    private String satellites;
    private String temperature; 

    public Planet(String name, String size, String type, String diameter, String satellites, String temperature) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.diameter = diameter;
        this.satellites = satellites;
        this.temperature = temperature;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the diameter
     */
    public String getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the satellites
     */
    public String getSatellites() {
        return satellites;
    }

    /**
     * @param satellites the satellites to set
     */
    public void setSatellites(String satellites) {
        this.satellites = satellites;
    }

    /**
     * @return the temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    
    
}
