/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class TvBox extends devices{
    private int volume;
    private int channeIsQuantity;
    private ArrayList<String> channels;

    public TvBox(int volume, int channeIsQuantity, ArrayList<String> channels, int id, String description, String room, boolean status, int workingDate) {
        super(id, description, room, status, workingDate);
        this.volume = volume;
        this.channeIsQuantity = channeIsQuantity;
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
     * @return the channeIsQuantity
     */
    public int getChanneIsQuantity() {
        return channeIsQuantity;
    }

    /**
     * @param channeIsQuantity the channeIsQuantity to set
     */
    public void setChanneIsQuantity(int channeIsQuantity) {
        this.channeIsQuantity = channeIsQuantity;
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
