
package ec.edu.espe.smart.model;

/**
 *
 * @author Camila
 */
public class ParkingGarage {
    private String user;
    private String licensePlate;
    private String color;
    private String arrivalTime;
    private String exitTime;
    private String type;

    public ParkingGarage(String user, String licensePlate, String color, String arrivalTime, String exitTime, String type) {
        this.user = user;
        this.licensePlate = licensePlate;
        this.color = color;
        this.arrivalTime = arrivalTime;
        this.exitTime = exitTime;
        this.type = type;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the exitTime
     */
    public String getExitTime() {
        return exitTime;
    }

    /**
     * @param exitTime the exitTime to set
     */
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
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

   
}
