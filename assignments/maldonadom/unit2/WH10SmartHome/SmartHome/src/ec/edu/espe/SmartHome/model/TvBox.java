/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SmartHome.model;

import java.util.ArrayList;

/**
 *
 * @author andresmaldonado
 */
public class TvBox extends Device{
    
    private int volume;
    private int channelsQuality;
    private ArrayList<String> channels;
    
    @Override
    public void sleep(int time) {
        System.out.println("seet the time for sleeping a TvBox");
    }

    public TvBox(int volume, int channelsQuality, ArrayList<String> channels, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volume = volume;
        this.channelsQuality = channelsQuality;
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
     * @return the channelsQuality
     */
    public int getChannelsQuality() {
        return channelsQuality;
    }

    /**
     * @param channelsQuality the channelsQuality to set
     */
    public void setChannelsQuality(int channelsQuality) {
        this.channelsQuality = channelsQuality;
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
