package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author darling.cruz
 */
public class TvBox extends Device{
    private int volume;
    private int channelsQuantity;
    private ArrayList<String> Channels;

    public TvBox(int volume, int channelsQuantity, ArrayList<String> Channels,int id, String description, String room, boolean status, int workingData) {
        super(id,description,room,status,workingData);
        this.volume = volume;
        this.channelsQuantity = channelsQuantity;
        this.Channels = Channels;
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
     * @return the Channels
     */
    public ArrayList<String> getChannels() {
        return Channels;
    }

    /**
     * @param Channels the Channels to set
     */
    public void setChannels(ArrayList<String> Channels) {
        this.Channels = Channels;
    }
    
    
}
