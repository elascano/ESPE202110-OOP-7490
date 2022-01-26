
package ec.edu.espe.house.model;

import java.util.ArrayList;

/**
 *
 * @author alex_
 */
public class Room {
    private int roomId;
    private int tvId;
    private int lightId;
    private int doorId;

    private ArrayList <Television> televisions;
    private ArrayList <Light> lights;
    private ArrayList <Door> doors;
        
    public void add(Television television){
        televisions.add(television);        
    }
    public void add(Light light){
        lights.add(light);
    }
    public void add(Door door){
        doors.add(door);
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", tvId=" + tvId + ", lightId=" + lightId + ", doorId=" + doorId + ", televisions=" + televisions + ", lights=" + lights + ", doors=" + doors + '}';
    }

    public Room(int roomId, int tvId, int lightId, int doorId, ArrayList<Television> televisions, ArrayList<Light> lights, ArrayList<Door> doors) {
        this.roomId = roomId;
        this.tvId = tvId;
        this.lightId = lightId;
        this.doorId = doorId;
        this.televisions = televisions;
        this.lights = lights;
        this.doors = doors;
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
     * @return the tvId
     */
    public int getTvId() {
        return tvId;
    }

    /**
     * @param tvId the tvId to set
     */
    public void setTvId(int tvId) {
        this.tvId = tvId;
    }

    /**
     * @return the lightId
     */
    public int getLightId() {
        return lightId;
    }

    /**
     * @param lightId the lightId to set
     */
    public void setLightId(int lightId) {
        this.lightId = lightId;
    }

    /**
     * @return the doorId
     */
    public int getDoorId() {
        return doorId;
    }

    /**
     * @param doorId the doorId to set
     */
    public void setDoorId(int doorId) {
        this.doorId = doorId;
    }

    /**
     * @return the televisions
     */
    public ArrayList <Television> getTelevisions() {
        return televisions;
    }

    /**
     * @param televisions the televisions to set
     */
    public void setTelevisions(ArrayList <Television> televisions) {
        this.televisions = televisions;
    }

    /**
     * @return the lights
     */
    public ArrayList <Light> getLights() {
        return lights;
    }

    /**
     * @param lights the lights to set
     */
    public void setLights(ArrayList <Light> lights) {
        this.lights = lights;
    }

    /**
     * @return the doors
     */
    public ArrayList <Door> getDoors() {
        return doors;
    }

    /**
     * @param doors the doors to set
     */
    public void setDoors(ArrayList <Door> doors) {
        this.doors = doors;
    }

    
    
    
}
