
package ec.edu.espe.smart.model;

/**
 *
 * @author Caisatoa
 */
public class MicrowaveOwen extends Device{
    private int time;
    private float suppportedWeight;
    private float cc;

    @Override
    public void sleep(int time) {
        System.out.println("Sleping a microwave oven to " + time +"segundos");
    }


    public MicrowaveOwen(int time, float suppportedWeight, float cc, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.time = time;
        this.suppportedWeight = suppportedWeight;
        this.cc = cc;
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
     * @return the suppportedWeight
     */
    public float getSuppportedWeight() {
        return suppportedWeight;
    }

    /**
     * @param suppportedWeight the suppportedWeight to set
     */
    public void setSuppportedWeight(float suppportedWeight) {
        this.suppportedWeight = suppportedWeight;
    }

    /**
     * @return the cc
     */
    public float getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(float cc) {
        this.cc = cc;
    }

}
