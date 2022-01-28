
package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class Device {
    private int id;
    private String description;
    private String room;
    private boolean status;
    private int workingData;
    private ArrayList<Device> devices1;

    public Device(int id, String description, String room, boolean status, int workingData, ArrayList<Device> devices) {
        this.id = id;
        this.description = description;
        this.room = room;
        this.status = status;
        this.workingData = workingData;
        this.devices1 = devices;
    }

    @Override
    public String toString() {
        return "Device{" + "id=" + id + ", description=" + description + ", room=" + room + ", status=" + status + ", workingData=" + workingData + ", devices1=" + devices1 + '}';
    }
    
    
    public void add(Device device){
        devices1.add(device);
    }
    
    public void remove(int id){
        devices1.removeIf(device -> device.getId() == id);
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

    /**
     * @return the devices
     */
    public ArrayList<Device> getDevices() {
        return devices1;
    }

    /**
     * @param devices the devices to set
     */
    public void setDevices(ArrayList<Device> devices) {
        this.devices1 = devices;
    }
    
    
    
}
