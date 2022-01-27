package ec.edu.espe.stadium.model;

/**
 *
 * @author Javier Paucar
 */
public class Stadium {

    private String id;
    private String name;
    private String country;
    private String sport;
    private int capacity;
    private int yearFundation;

    public Stadium(String id, String name, String country, String sport, int capacity, int yearFundation) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.sport = sport;
        this.capacity = capacity;
        this.yearFundation = yearFundation;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the sport
     */
    public String getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport(String sport) {
        this.sport = sport;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the yearFundation
     */
    public int getYearFundation() {
        return yearFundation;
    }

    /**
     * @param yearFundation the yearFundation to set
     */
    public void setYearFundation(int yearFundation) {
        this.yearFundation = yearFundation;
    }

}
