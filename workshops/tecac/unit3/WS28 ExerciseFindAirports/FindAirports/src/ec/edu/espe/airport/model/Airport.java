
package ec.edu.espe.airport.model;

/**
 *
 * @author Camila
 */
public class Airport {
    private String name;
    private String origin;
    private String destination;
    private int idAirline;
    private String airline;
    private float tickeValue;

    public Airport(String name, String origin, String destination, int idAirline, String airline, float tickeValue) {
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.idAirline = idAirline;
        this.airline = airline;
        this.tickeValue = tickeValue;
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
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the idAirline
     */
    public int getIdAirline() {
        return idAirline;
    }

    /**
     * @param idAirline the idAirline to set
     */
    public void setIdAirline(int idAirline) {
        this.idAirline = idAirline;
    }

    /**
     * @return the airline
     */
    public String getAirline() {
        return airline;
    }

    /**
     * @param airline the airline to set
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * @return the tickeValue
     */
    public float getTickeValue() {
        return tickeValue;
    }

    /**
     * @param tickeValue the tickeValue to set
     */
    public void setTickeValue(float tickeValue) {
        this.tickeValue = tickeValue;
    }
    
    
}
