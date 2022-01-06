
package ec.edu.espe.smart.model;

/**
 *
 * @author Camila
 */
public class MicrowaveOven extends Device {
    private int time;
    private float supportedWeight;
    private float CC;

@Override
    public void sleep(int time) {
        System.out.println("Sleeping a microwave to " + time + "seconds" );
    }    
    
    
    public MicrowaveOven(int time, float supportedWeight, float CC, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.time = time;
        this.supportedWeight = supportedWeight;
        this.CC = CC;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the supportedWeight
     */
    public float getSupportedWeight() {
        return supportedWeight;
    }

    /**
     * @param supportedWeight the supportedWeight to set
     */
    public void setSupportedWeight(float supportedWeight) {
        this.supportedWeight = supportedWeight;
    }

    /**
     * @return the CC
     */
    public float getCC() {
        return CC;
    }

    /**
     * @param CC the CC to set
     */
    public void setCC(float CC) {
        this.CC = CC;
    }
    
}
