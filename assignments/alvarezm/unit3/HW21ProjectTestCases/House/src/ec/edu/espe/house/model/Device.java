package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Device {
    private boolean status;

    public Device(boolean status) {
        this.status = status;
    }
    
    
    private void turnOn() {
        
    }
    
    private void turnOff() {

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
    
    
}
