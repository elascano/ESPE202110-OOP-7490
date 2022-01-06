
package ec.edu.espe.smart.model;

/**
 *
 * @author Paul Saltos
 */
public class MicrowaveOven extends Device {
    
    private int time;
    private float supportedWeight;
    private float cc;

    public MicrowaveOven(int i, int i0, int i1, int i2, String status, String status0, boolean b, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void sleep(int time) {
        System.out.println("Slleping a microwave in " + time+ " seconds");
    }

    public MicrowaveOven(int time, float supportedWeight, float cc, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.time = time;
        this.supportedWeight = supportedWeight;
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
