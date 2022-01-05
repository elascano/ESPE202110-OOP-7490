/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.smartHome.model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TvBox extends Device{
    private int volume;
    private int channelsQuantity;
    private ArrayList<String> channels;

    public TvBox(int volume, int channelsQuantity, ArrayList<String> channels, int id, String description, String rook, boolean status, int workingData) {
        super(id, description, rook, status, workingData);
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
