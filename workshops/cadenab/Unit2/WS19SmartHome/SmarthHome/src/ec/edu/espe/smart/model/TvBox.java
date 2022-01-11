/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class TvBox {
    private int volume;
    private int channelQuantity;
    private ArrayList<String> channels;

    public TvBox(int volume, int channelQuantity, ArrayList<String> channels) {
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
    
    
}
