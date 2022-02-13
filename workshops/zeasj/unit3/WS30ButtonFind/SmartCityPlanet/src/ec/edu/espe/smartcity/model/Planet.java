package ec.edu.espe.smartcity.model;

/**
 *
 * @author Joel Zeas 
 */
public class Planet {
    
    private String name; 
    private String gravity;
    private String type;
    private String diameter;
    private String satellites;
    private String temperature;

    public Planet(String name, String gravity, String type, String diameter, String satellites, String temperature) {
        this.name = name;
        this.gravity = gravity;
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
     * @return the gravity
     */
    public String getGravity() {
        return gravity;
    }

    /**
     * @param gravity the gravity to set
     */
    public void setGravity(String gravity) {
        this.gravity = gravity;
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

    public void add(Planet planet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
