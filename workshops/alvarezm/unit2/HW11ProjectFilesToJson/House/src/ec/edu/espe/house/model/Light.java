
package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Light {
    
    private String color;
    private int potencyWatts;
    private boolean on;
    private final boolean open;

    public Light() {
 
    }


    private void turnOnLight() {

    }
    
    private void turnOffLight() {

    }

    public Light(String color, int potencyWatts) {
        this.color = color;
        this.potencyWatts = potencyWatts;
        this.open = on;
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
     * @return the potencyWatts
     */
    public int getPotencyWatts() {
        return potencyWatts;
    }

    /**
     * @param potencyWatts the potencyWatts to set
     */
    public void setPotencyWatts(int potencyWatts) {
        this.potencyWatts = potencyWatts;
    }
    
        /**
     * @return the open
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the open to set
     */
    public void setOn(boolean on) {
        this.on = on;
    }
    
    
    
}
