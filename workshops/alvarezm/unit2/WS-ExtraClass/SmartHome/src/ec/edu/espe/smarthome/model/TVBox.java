
package ec.edu.espe.smarthome.model;

import java.util.ArrayList;

/**
 *
 * @author malvarez
 */
public class TVBox extends Device{
    int volume;
    int channelQuantity;
    ArrayList<String> channels;

    public TVBox(int volume, int channelsQuantity, ArrayList<String> channels, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.volume = volume;
        this.channelsQuantity = channelsQuantity
        this.channels = channels;
    }
    
    
}
