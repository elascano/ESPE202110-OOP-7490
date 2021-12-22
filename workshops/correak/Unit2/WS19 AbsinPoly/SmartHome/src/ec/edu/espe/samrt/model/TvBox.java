/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.samrt.model;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class TvBox extends Device {
    private int volume;
    private int channelisQuantity;
    private ArrayList <String> channels;
    
     @Override
    public void sleep(int time) {
         System.out.println("seet the time for sleeping Tvbox"+time+"in minutes");
    }

    public TvBox(int volume, int channelisQuantity, ArrayList<String> channels, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volume = volume;
        this.channelisQuantity = channelisQuantity;
        this.channels = channels;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannelisQuantity() {
        return channelisQuantity;
    }

    public void setChannelisQuantity(int channelisQuantity) {
        this.channelisQuantity = channelisQuantity;
    }

    public ArrayList<String> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<String> channels) {
        this.channels = channels;
    }

   
    
}
