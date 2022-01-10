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
    private int volumen;
    private int channelsQuantity;
    private ArrayList<String> channels;
  
    @Override
    public void sleep(int time) {
        System.out.println("set the time for sleeping a TvBox in "+ time+"minutes");
        
    }
    
    public void sleep(){
        System.out.println(""); 
    }

    public TvBox(int volumen, int channelsQuantity, ArrayList<String> channels, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volumen = volumen;
        this.channelsQuantity = channelsQuantity;
        this.channels = channels;
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

    /**
     * @return the volumen
     */
    public int getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

   
    
    
    
}