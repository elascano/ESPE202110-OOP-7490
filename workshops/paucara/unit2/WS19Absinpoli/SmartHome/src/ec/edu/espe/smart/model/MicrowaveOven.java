package ec.edu.espe.smart.model;

/**
 *
 * @author Javier Paucar
 */
public class MicrowaveOven extends Device {

    private int time;
    private float supportedWeigth;
    private float cc;

    public MicrowaveOven(int time, float supportedWeigth, float cc, int id, String description, String room, boolean status, int workingDate) {
        super(id, description, room, status, workingDate);
        this.time = time;
        this.supportedWeigth = supportedWeigth;
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
     * @return the supportedWeigth
     */
    public float getSupportedWeigth() {
        return supportedWeigth;
    }

    /**
     * @param supportedWeigth the supportedWeigth to set
     */
    public void setSupportedWeigth(float supportedWeigth) {
        this.supportedWeigth = supportedWeigth;
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

    @Override
    public void sleep(int time) {
        System.out.println("Sleeping a microwave oven to" + time + "seconds");
    }

}
