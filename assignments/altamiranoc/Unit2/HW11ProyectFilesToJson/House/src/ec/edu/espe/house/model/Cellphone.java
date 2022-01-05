
package ec.edu.espe.house.model;


/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Cellphone {
    
    private String model;
    private String userName;
    private String color;

    public Cellphone() {
    
    }
    
    
    private void openDoor() {

    }
    
    private void closeDoor() {

    }  
    
    private void turnOnLight() {

    }
    
    private void turnOffLight() {

    }

    private void turnOnTelevision() {

    }
    
    private void turnOffTelevision() {

    }
    
    private void turnOnSoundSystem() {

    }
    
    private void turnOffSoundSystem() {

    }    
    
    private void activateAlarmSignal() {

    }
    
    private void deactivateAlarmSignal() {

    }     

    public Cellphone(String model, String userName, String color) {
        this.model = model;
        this.userName = userName;
        this.color = color;
    }

    
    
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
    
}
