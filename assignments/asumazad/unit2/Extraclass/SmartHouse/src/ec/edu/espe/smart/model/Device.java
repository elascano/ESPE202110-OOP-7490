package ec.edu.espe.smart.model;

/**
 *
 * @author dylanasumaza
 */
public class Device {

    int id;
    String description;
    String room;
    boolean status;
    int workingDate;

    public Device(int id, String description, String room, boolean status, int workingDate) {
        this.id = id;
        this.description = description;
        this.room = room;
        this.status = status;
        this.workingDate = workingDate;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getWorkingDate() {
        return workingDate;
    }

    public void setWorkingDate(int workingDate) {
        this.workingDate = workingDate;
    }
    
    
}
