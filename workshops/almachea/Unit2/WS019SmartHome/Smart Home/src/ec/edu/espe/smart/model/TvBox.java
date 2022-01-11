package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class TvBox extends Device{
    private int volume;
    private int channelQuantity;
    private ArrayList<String> channels;

    public TvBox(int volume, int channelQuantity, ArrayList<String> channels, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volume = volume;
        this.channelQuantity = channelQuantity;
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
     * @return the channelQuantity
     */
    public int getChannelQuantity() {
        return channelQuantity;
    }

    /**
     * @param channelQuantity the channelQuantity to set
     */
    public void setChannelQuantity(int channelQuantity) {
        this.channelQuantity = channelQuantity;
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

    @Override
    public void sleep(int time) {
        System.out.println("seet the time for sleeping a TvBox in " + time + "minutes");
    }

       
    
}
