package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author Joel Zeas
 */
public class TvBox extends Device {
    private int volumen;
    private int channelQuantity;
    private ArrayList<String> channels;

    
    @Override
    public void sleep(int time) {
        System.out.println("see the time for sleeping a TvBox in " + time + " minutes");
    }
    


    public TvBox(int volumen, int channelQuantity, ArrayList<String> channels, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volumen = volumen;
        this.channelQuantity = channelQuantity;
        this.channels = channels;
    }
    

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
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

    public String getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
