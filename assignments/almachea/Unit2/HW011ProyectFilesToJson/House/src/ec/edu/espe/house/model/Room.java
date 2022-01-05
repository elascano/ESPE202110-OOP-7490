
package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Room {
    
    private String size;
    private String color;
    private int numberOfRoom;
    private Door door = new Door(numberOfRoom, numberOfRoom, color, numberOfRoom, size, true); 
    private Light light = new Light();

    public Room() {
        
    }
    
    
    private void hasDoor() {

    }
        
    private void hasLight() {

    }

    public Room(String size, String color, int numberOfRoom) {
        this.size = size;
        this.color = color;
        this.numberOfRoom = numberOfRoom;
    }

    
    
    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numberOfRoom
     */
    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    /**
     * @param numberOfRoom the numberOfRoom to set
     */
    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    /**
     * @return the door
     */
    public Door getDoor() {
        return door;
    }

    /**
     * @param door the door to set
     */
    public void setDoor(Door door) {
        this.door = door;
    }

    /**
     * @return the light
     */
    public Light getLight() {
        return light;
    }

    /**
     * @param light the light to set
     */
    public void setLight(Light light) {
        this.light = light;
    }
    
    
    
}
