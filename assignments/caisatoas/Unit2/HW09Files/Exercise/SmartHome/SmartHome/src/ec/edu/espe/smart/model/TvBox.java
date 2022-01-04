
package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author Caisatoa
 */
public class TvBox extends Device{
    private int volument;
    private int channelsQuantity;
    private ArrayList<String> chaneels;

    @Override
    public void sleep(int time) {
        System.out.println("Sleping a microwave oven to "+ time+"minutos");
    }
    
    public TvBox(int volument, int channelsQuantity, ArrayList<String> chaneels, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volument = volument;
        this.channelsQuantity = channelsQuantity;
        this.chaneels = chaneels;
    }

    /**
     * @return the volument
     */
    public int getVolument() {
        return volument;
    }

    /**
     * @param volument the volument to set
     */
    public void setVolument(int volument) {
        this.volument = volument;
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
     * @return the chaneels
     */
    public ArrayList<String> getChaneels() {
        return chaneels;
    }

    /**
     * @param chaneels the chaneels to set
     */
    public void setChaneels(ArrayList<String> chaneels) {
        this.chaneels = chaneels;
    }

}
