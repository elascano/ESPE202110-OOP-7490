
package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Room {
    
    private String nameOfRoom;
    private int []door = new int [2];
    private int []light = new int [1];

    public Room(String nameOfRoom) {
        this.nameOfRoom = nameOfRoom;
    }

    
    private void hasDoor() {

    }
        
    private void hasLight() {

    }

    /**
     * @return the nameOfRoom
     */
    public String getNameOfRoom() {
        return nameOfRoom;
    }

    /**
     * @param nameOfRoom the nameOfRoom to set
     */
    public void setNameOfRoom(String nameOfRoom) {
        this.nameOfRoom = nameOfRoom;
    }

    /**
     * @return the door
     */
    public int[] getDoor() {
        return door;
    }

    /**
     * @param door the door to set
     */
    public void setDoor(int[] door) {
        this.door = door;
    }

    /**
     * @return the light
     */
    public int[] getLight() {
        return light;
    }

    /**
     * @param light the light to set
     */
    public void setLight(int[] light) {
        this.light = light;
    }
    
}
    