
package ec.edu.espe.smart.model;

/**
 *
 * @author Simbaña J
 */
public class MicrowaveOven extends Device{
    private int time;
    private float supportdWeight;
    private float cc;
    
     @Override
    public void sleep(int time) {
         System.out.println("Sleeping a microwave oven to " + time+ "seconds");
    }
    

    public MicrowaveOven(int time, float supportdWeight, float cc, int id, String description, String room, boolean status, int workinDate) {
        super(id, description, room, status, workinDate);
        this.time = time;
        this.supportdWeight = supportdWeight;
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
     * @return the supportdWeight
     */
    public float getSupportdWeight() {
        return supportdWeight;
    }

    /**
     * @param supportdWeight the supportdWeight to set
     */
    public void setSupportdWeight(float supportdWeight) {
        this.supportdWeight = supportdWeight;
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
