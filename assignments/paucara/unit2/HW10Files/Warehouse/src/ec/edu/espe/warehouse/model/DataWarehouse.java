package ec.edu.espe.warehouse.model;

/**
 *
 * @author Javier Paucar
 */
public class DataWarehouse {

    private int number;
    private String name;
    private String country;
    private String city;
    private int yearFundation;

    public DataWarehouse(int number, String name, String country, String city, int yearFundation) {
        this.number = number;
        this.name = name;
        this.country = country;
        this.city = city;
        this.yearFundation = yearFundation;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
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
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
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
