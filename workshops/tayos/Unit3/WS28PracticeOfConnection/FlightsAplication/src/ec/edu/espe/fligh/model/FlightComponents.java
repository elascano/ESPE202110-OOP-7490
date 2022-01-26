package ec.edu.espe.fligh.model;

/**
 *
 * @author Sebas
 */
public class FlightComponents {

    private int id;
    private String DateofFlight;
    private String PlaceOfDeparture;
    private String Destiny;

    public FlightComponents(int id, String DateofFlight, String PlaceOfDeparture, String Destiny) {
        this.id = id;
        this.DateofFlight = DateofFlight;
        this.PlaceOfDeparture = PlaceOfDeparture;
        this.Destiny = Destiny;
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
     * @return the DateofFlight
     */
    public String getDateofFlight() {
        return DateofFlight;
    }

    /**
     * @param DateofFlight the DateofFlight to set
     */
    public void setDateofFlight(String DateofFlight) {
        this.DateofFlight = DateofFlight;
    }

    /**
     * @return the PlaceOfDeparture
     */
    public String getPlaceOfDeparture() {
        return PlaceOfDeparture;
    }

    /**
     * @param PlaceOfDeparture the PlaceOfDeparture to set
     */
    public void setPlaceOfDeparture(String PlaceOfDeparture) {
        this.PlaceOfDeparture = PlaceOfDeparture;
    }

    /**
     * @return the Destiny
     */
    public String getDestiny() {
        return Destiny;
    }

    /**
     * @param Destiny the Destiny to set
     */
    public void setDestiny(String Destiny) {
        this.Destiny = Destiny;
    }

}

