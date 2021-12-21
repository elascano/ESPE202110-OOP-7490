package ec.edu.espe.smart.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mayerly
 */
public class Device {
    private int id;
    private String description;
    private String room;
    private boolean status;// true- if the device is on, false -if the device is off
    private int WorkingDate; //tv,radio-volume, microwave-time, refrigerator-temperature

    public Device(int id, String description, String room, boolean status, int WorkingDate) {
        this.id = id;
        this.description = description;
        this.room = room;
        this.status = status;
        this.WorkingDate = WorkingDate;
        
    }
private ArrayList<Device>devices;

public void add(Device device){
    devices.add(device);
    }
    
    public void remove(Device device){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the device to delete it: ");
        int id=read.nextInt();
        for(int i=0; i<devices.size(); i++){
            if(devices.get(i).getId()== id){
            } else {
                devices.remove(i);
            }
        }
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
     * @return the WorkingDate
     */
    public int getWorkingDate() {
        return WorkingDate;
    }

    /**
     * @param WorkingDate the WorkingDate to set
     */
    public void setWorkingDate(int WorkingDate) {
        this.WorkingDate = WorkingDate;
    }

    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
