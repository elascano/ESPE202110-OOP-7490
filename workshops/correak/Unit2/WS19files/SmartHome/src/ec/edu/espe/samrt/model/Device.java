/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.samrt.model;

/**
 *
 * @author USUARIO
 */
public class Device {
    int id;
    String description;
    String room;
    boolean status;// true - if device is on, false -if the deviceis off
    int workingData;//tv,radio-volume,microwave -time,refrigator -temperature

    public Device(int id, String description, String room, boolean status, int workingData) {
        this.id = id;
        this.description = description;
        this.room = room;
        this.status = status;
        this.workingData = workingData;
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

    public int getWorkingData() {
        return workingData;
    }

    public void setWorkingData(int workingData) {
        this.workingData = workingData;
    }

    

}
