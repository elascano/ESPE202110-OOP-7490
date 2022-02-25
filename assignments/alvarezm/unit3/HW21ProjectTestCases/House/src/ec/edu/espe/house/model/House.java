
package ec.edu.espe.house.model;

import java.util.ArrayList;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class House {
    private ArrayList<Room> room = new ArrayList<Room>();
    private ArrayList<Television> television = new ArrayList<Television>();
    private int []soundSystem = new int [1];
    private int []alarmSignal = new int [1];

    public House() {
    }

    
    /**
     * @return the room
     */
    public ArrayList<Room> getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(ArrayList<Room> room) {
        this.room = room;
    }

    /**
     * @return the television
     */
    public ArrayList<Television> getTelevision() {
        return television;
    }

    /**
     * @param television the television to set
     */
    public void setTelevision(ArrayList<Television> television) {
        this.television = television;
    }

    /**
     * @return the soundSystem
     */
    public int[] getSoundSystem() {
        return soundSystem;
    }

    /**
     * @param soundSystem the soundSystem to set
     */
    public void setSoundSystem(int[] soundSystem) {
        this.soundSystem = soundSystem;
    }

    /**
     * @return the alarmSignal
     */
    public int[] getAlarmSignal() {
        return alarmSignal;
    }

    /**
     * @param alarmSignal the alarmSignal to set
     */
    public void setAlarmSignal(int[] alarmSignal) {
        this.alarmSignal = alarmSignal;
    }
    
}


   
