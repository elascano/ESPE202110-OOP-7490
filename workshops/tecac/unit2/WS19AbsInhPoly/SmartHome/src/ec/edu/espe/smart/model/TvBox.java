
package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author Camila
 */
public class TvBox extends Device{
    private int volume;
    private int channelsQuantity;
    private ArrayList <String> channels;

@Override
    public void sleep(int time) {
        System.out.println("Seet the time for sleeping a TvBox in " + time + " minutes");
    }
    
    
    public TvBox(int volume, int channelsQuantity, ArrayList<String> channels, int id, String description, String room, boolean status, int workingData) {
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
    public ArrayList <String> getChannels() {
        return channels;
    }

    /**
     * @param channels the channels to set
     */
    public void setChannels(ArrayList <String> channels) {
        this.channels = channels;
    }

    
}
