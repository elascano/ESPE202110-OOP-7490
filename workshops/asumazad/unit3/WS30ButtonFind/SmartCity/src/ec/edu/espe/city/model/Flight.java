
package ec.edu.espe.city.model;

/**
 *
 * @author dylanasumaza
 */
public class Flight {
    private int id;
    private String name;
    private float price;
    private String flightDate;
    private String originCity;
    private String destinationCity;

    public Flight(int id, String name, float price, String flightDate, String originCity, String destinationCity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.flightDate = flightDate;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
    
    
}
