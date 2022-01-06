package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author Paul Saltos
 */
public class TvBox extends Device {

    private int volume;
    private int channelisQuantity;
    private ArrayList<String>channels;
    
    @Override
    public void sleep(int time) {
        System.out.println("Slleping a tvbox in " + time + " minutes");
    }
    
    public void sleep(){
        System.out.println("sleeping for 30 minutes");
    }
    
    
    @Override
    public void turnOn(){
        System.out.println("turning on the tvbox");
    }
    

    public TvBox(int volume, int channelisQuantity, ArrayList<String> channels, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volume = volume;
        this.channelisQuantity = channelisQuantity;
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
     * @return the channelisQuantity
     */
    public int getChannelisQuantity() {
        return channelisQuantity;
    }

    /**
     * @param channelisQuantity the channelisQuantity to set
     */
    public void setChannelisQuantity(int channelisQuantity) {
        this.channelisQuantity = channelisQuantity;
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
