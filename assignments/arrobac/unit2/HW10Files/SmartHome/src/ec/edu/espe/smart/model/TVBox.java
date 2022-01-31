
package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author Cristian Arroba
 */
public class TVBox extends Device {
    private int volume;
    private int channelsQuantity;
    private ArrayList<String> channels;
    
    @Override
    public void sleep(int time) {
        System.out.println("Set the time for sleeping a TV Box in " + time + "minutes");
    }
    
    
    
    public void sleep() {
        System.out.println("Sleepping for 30 minutes");
    }
    
    @Override
    public void turnOn(){
        System.out.println("Turning on the TVBox");
    }
    
    
    

    public TVBox(int volume, int channelsQuantity, ArrayList<String> channels, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volume = volume;
        this.channelsQuantity = channelsQuantity;
        this.channels = channels;
    }
    
    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the channelsQuantity
     */
    public int getChannelsQuantity() {
        return channelsQuantity;
    }

    /**
     * @param channelsQuantity the channelsQuantity to set
     */
    public void setChannelsQuantity(int channelsQuantity) {
        this.channelsQuantity = channelsQuantity;
    }

    /**
     * @return the channels
     */
    public ArrayList<String> getChannels() {
        return channels;
    }

    /**
     * @param channels the channels to set
     */
    public void setChannels(ArrayList<String> channels) {
        this.channels = channels;
    }

    
    
    
    
    
}
