
package ec.edu.espe.smart.model;

/**
 *
 * @author SETayoRuiz
 */
public class Device {

    private int id;
    private String description;
    private String room;
    private boolean status; // true --> if the devices is on, falso --> if the device is off
    private int workingdata; //tv and radio --> volumen, microwave --> time, refrigerator --> temperatura

    public Device(int id, String description, String room, boolean status, int workingData) {
        this.id = id;
        this.description = description;
        this.room = room;
        this.status = status;
        this.workingdata = workingData;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the workingdata
     */
    public int getWorkingdata() {
        return workingdata;
    }

    /**
     * @param workingdata the workingdata to set
     */
    public void setWorkingdata(int workingdata) {
        this.workingdata = workingdata;
    }
}
