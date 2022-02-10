
package ec.edu.espe.smart.model;

/**
 *
 * @author Sebas
 */
public class AmusementParkComp {
    private int id;
    private String parkName;
    private String ubication;
    private String food;
    private boolean fastPast;
    private String date;
    private int PersonsThatWillcome;

    public AmusementParkComp(int id, String parkName, String ubication, String food, boolean fastPast, String date, int PersonsThatWillcome) {
        this.id = id;
        this.parkName = parkName;
        this.ubication = ubication;
        this.food = food;
        this.fastPast = fastPast;
        this.date = date;
        this.PersonsThatWillcome = PersonsThatWillcome;
    }



    /**
     * @return the parkName
     */
    public String getParkName() {
        return parkName;
    }

    /**
     * @param parkName the parkName to set
     */
    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    /**
     * @return the ubication
     */
    public String getUbication() {
        return ubication;
    }

    /**
     * @param ubication the ubication to set
     */
    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return the fastPasr
     */
    public boolean isFastPast() {
        return fastPast;
    }

    /**
     * @param fastPasr the fastPasr to set
     */
    public void setFastPast(boolean fastPast) {
        this.fastPast = fastPast;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the PersonsThatWillcome
     */
    public int getPersonsThatWillcome() {
        return PersonsThatWillcome;
    }

    /**
     * @param PersonsThatWillcome the PersonsThatWillcome to set
     */
    public void setPersonsThatWillcome(int PersonsThatWillcome) {
        this.PersonsThatWillcome = PersonsThatWillcome;
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
    
}
