
package ec.edu.espe.smart.model;

/**
 *
 * @author Simbaña J
 */
public abstract class Device {
    private int id;
    private String description;
    private String room;
    private boolean status; // true -if the device is on, false -if the device is off
    private int workinDate; //tv,radio -volume, microwave -time, refrigerator -temperature

    public abstract void sleep(int time);
        
    
    public void turnOn(){
       if(status==false){
           status=true;
       }
    }
    
    public void turnOff(){
        if(status==true){
            status = false;
        }
    }
    
    
    public Device(int id, String description, String room, boolean status, int workinDate) {
        this.id = id;
        this.description = description;
        this.room = room;
        this.status = status;
        this.workinDate = workinDate;
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
     * @return the statuts
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the statuts to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the workinDate
     */
    public int getWorkinDate() {
        return workinDate;
    }

    /**
     * @param workinDate the workinDate to set
     */
    public void setWorkinDate(int workinDate) {
        this.workinDate = workinDate;
    }
    
    
    
    
}
