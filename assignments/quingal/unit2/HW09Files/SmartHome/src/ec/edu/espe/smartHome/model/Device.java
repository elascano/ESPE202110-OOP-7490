/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.smartHome.model;

/**
 *
 * @author Usuario
 */
public abstract class Device {
    private int id;
    private String description;
    private String rook;
    private boolean status;//true -if yhe device is on, false -if the device is off
    private int workingData;//tv,radio -volume,microwave -time,refrigerator -temperat
    
    public abstract void sleep(int time);
        
    
    public void turnOn(){
        if(status == false){
            status = true;
        }
    }
    
    public void turnOff(){
        if(status == true){
            status = false;
        }
    }

    public  Device(int id, String description, String rook, boolean status, int workingData) {
        this.id = id;
        this.description = description;
        this.rook = rook;
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
     * @return the rook
     */
    public String getRook() {
        return rook;
    }

    /**
     * @param rook the rook to set
     */
    public void setRook(String rook) {
        this.rook = rook;
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
