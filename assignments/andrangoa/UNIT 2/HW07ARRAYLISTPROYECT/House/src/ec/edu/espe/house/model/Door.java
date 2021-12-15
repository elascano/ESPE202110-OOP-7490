
package ec.edu.espe.house.model;

/**
 *
 * @author alex_
 */
public class Door {
    private int doorId;
    private boolean satatusDoor;  

    @Override
    public String toString() {
        return "Door{" + "DoorId=" + doorId + ", satatusDoor=" + satatusDoor + '}';
    }

    public Door(int DoorId, boolean satatusDoor) {
        this.doorId = DoorId;
        this.satatusDoor = satatusDoor;
    }

    /**
     * @return the DoorId
     */
    public int getDoorId() {
        return doorId;
    }

    /**
     * @param DoorId the DoorId to set
     */
    public void setDoorId(int DoorId) {
        this.doorId = DoorId;
    }

    /**
     * @return the satatusDoor
     */
    public boolean isSatatusDoor() {
        return satatusDoor;
    }

    /**
     * @param satatusDoor the satatusDoor to set
     */
    public void setSatatusDoor(boolean satatusDoor) {
        this.satatusDoor = satatusDoor;
    }

   
}


