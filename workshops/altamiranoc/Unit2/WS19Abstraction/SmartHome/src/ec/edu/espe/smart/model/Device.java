package ec.edu.espe.smart.model;

/**
 *
 * @author Altamirano Cristhian
 */
public abstract class Device {
    private int id;
    private String description;
    private String Room;
    private boolean status; // true -if the device is on, false -if the device is off
    private int workingData; //tv,radio - volume, microwave -time, refrigerator -temperature

     public abstract void sleep(int time);
    
    public void turnOn(){
        if(status==false){
            status=true;
        }
    }
    
    public void turnOff(){
        if(status==true){
            status=false;
        }
    }
        
    public Device() {
        this.id = 0;
        this.description = "";
        this.Room = "";
        this.status = false;
        this.workingData = 0;
    }
    
   public Device(int id, String description, String room, boolean status, int workingData) {
        this.id = id;
        this.description = description;
        this.Room = room;
        this.status = status;
        this.workingData = workingData;
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
     * @return the Room
     */
    public String getRoom() {
        return Room;
    }

    /**
     * @param Room the Room to set
     */
    public void setRoom(String Room) {
        this.Room = Room;
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
     * @return the workingData
     */
    public int getWorkingData() {
        return workingData;
    }

    /**
     * @param workingData the workingData to set
     */
    public void setWorkingData(int workingData) {
        this.workingData = workingData;
    }
    
    
}
