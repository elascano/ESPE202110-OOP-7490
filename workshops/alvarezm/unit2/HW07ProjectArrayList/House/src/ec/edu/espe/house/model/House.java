
package ec.edu.espe.house.model;

import java.util.ArrayList;

/**
 *
 * @author mealvarez
 */
public class House {
    private int roomId;
    private int soundSystemId;
    private boolean alamrSignal;
    
    private ArrayList <Room> rooms;
    private ArrayList <SoundSystem> soundSystems;
    
    public void add(Room room){
        rooms.add(room);
    }
   public void add(SoundSystem soundSystem){
        soundSystems.add(soundSystem);
   }

    @Override
    public String toString() {
        return "House{" + "roomId=" + roomId + ", soundSystemId=" + soundSystemId + ", alamrSignal=" + alamrSignal + ", rooms=" + rooms + ", soundSystems=" + soundSystems + '}';
    }


    public House(int roomId, int soundSystemId, boolean alamrSignal, ArrayList<Room> rooms, ArrayList<SoundSystem> soundSystems) {
        this.roomId = roomId;
        this.soundSystemId = soundSystemId;
        this.alamrSignal = alamrSignal;
        this.rooms = rooms;
        this.soundSystems = soundSystems;
    }

   
    /**
     * @return the roomId
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the soundSystemId
     */
    public int getSoundSystemId() {
        return soundSystemId;
    }

    /**
     * @param soundSystemId the soundSystemId to set
     */
    public void setSoundSystemId(int soundSystemId) {
        this.soundSystemId = soundSystemId;
    }

    /**
     * @return the alamrSignal
     */
    public boolean isAlamrSignal() {
        return alamrSignal;
    }

    /**
     * @param alamrSignal the alamrSignal to set
     */
    public void setAlamrSignal(boolean alamrSignal) {
        this.alamrSignal = alamrSignal;
    }

    /**
     * @return the rooms
     */
    public ArrayList <Room> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(ArrayList <Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * @return the soundSystems
     */
    public ArrayList <SoundSystem> getSoundSystems() {
        return soundSystems;
    }

    /**
     * @param soundSystems the soundSystems to set
     */
    public void setSoundSystems(ArrayList <SoundSystem> soundSystems) {
        this.soundSystems = soundSystems;
    }

    public void add(int roomId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
