
package ec.edu.espe.house.model;

/**
 *
 * @author mealvarez
 */
public class Light {
    private int lightId;
    private boolean statusLight;

    @Override
    public String toString() {
        return "Light{" + "lightId=" + lightId + ", statusLight=" + statusLight + '}';
    }

    public Light(int lightId, boolean statusLight) {
        this.lightId = lightId;
        this.statusLight = statusLight;
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
     * @return the statusLight
     */
    public boolean isStatusLight() {
        return statusLight;
    }

    /**
     * @param statusLight the statusLight to set
     */
    public void setStatusLight(boolean statusLight) {
        this.statusLight = statusLight;
    }

   
    
    
}
