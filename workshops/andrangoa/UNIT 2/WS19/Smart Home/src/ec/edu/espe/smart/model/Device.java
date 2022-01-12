
<<<<<<< HEAD
=======
<<<<<<< HEAD:assignments/lincangoj/unit2/HW10Files/SmartHome/src/ec/edu/epe/smart/model/Device.java
package ec.edu.epe.smart.model;

/**
 *
 * @author Daniel Lincango
=======
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
package ec.edu.espe.smart.model;

/**
 *
 * @author alex_
<<<<<<< HEAD
=======
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066:workshops/andrangoa/UNIT 2/WS19/Smart Home/src/ec/edu/espe/smart/model/Device.java
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
 */
public abstract class Device {
    
    private int id;
    private String description;
    private String room;
<<<<<<< HEAD
=======
<<<<<<< HEAD:assignments/lincangoj/unit2/HW10Files/SmartHome/src/ec/edu/epe/smart/model/Device.java
    private boolean status;//tru-if the divice is on , false-if the divice is off
    private int workingData;//tv,radio-volume,microwave-time,refrigerator-temperature

    public void turnOn(){
        if(status==false){
            status=true;
        }
    }
=======
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
    private boolean status;
    private int workingData;
    
    public abstract void sleep(int time);
    
    
    public void turnOn(){
        if(status==false){
            status=true;
        }
    }

<<<<<<< HEAD
=======
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066:workshops/andrangoa/UNIT 2/WS19/Smart Home/src/ec/edu/espe/smart/model/Device.java
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
    public void turnOff(){
        if(status==true){
            status=false;
        }
<<<<<<< HEAD
    }
=======
<<<<<<< HEAD:assignments/lincangoj/unit2/HW10Files/SmartHome/src/ec/edu/epe/smart/model/Device.java
            
    }
    
=======
    }
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066:workshops/andrangoa/UNIT 2/WS19/Smart Home/src/ec/edu/espe/smart/model/Device.java
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
    public Device(int id, String description, String room, boolean status, int workingData) {
        this.id = id;
        this.description = description;
        this.room = room;
        this.status = status;
        this.workingData = workingData;
    }

    
<<<<<<< HEAD
    
=======
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
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
    
    
<<<<<<< HEAD
    
    
=======
<<<<<<< HEAD:assignments/lincangoj/unit2/HW10Files/SmartHome/src/ec/edu/epe/smart/model/Device.java
=======
    
    
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066:workshops/andrangoa/UNIT 2/WS19/Smart Home/src/ec/edu/espe/smart/model/Device.java
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
}
