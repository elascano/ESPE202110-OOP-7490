package ec.edu.espe.smart.view;


import ec.edu.espe.smart.model.MicrowaveOven;
import ec.edu.espe.smart.model.TvBox;
import java.util.ArrayList;

/**
 *
 * @author Melanie
 */
public class SmartHome {

    public static void main(String[] args) {
        System.out.println("WS19-AbsInhPoly --> Melanie Terán <--");

        ArrayList<String> channels = new ArrayList<>();
        TvBox tvBox;
        tvBox = new TvBox(100, 50, channels, 1, "samsung 52 inches", "bedroom", true, 5);
        String status = "";
        System.out.println("device class --> " + tvBox.getClass());
        System.out.println("Device id --> " + tvBox.getId());
        System.out.println("Device Description " + tvBox.getDescription());

        if (tvBox.isStatus()) {
            status = "on";
        } else {
            status = "off";
        }

        System.out.println("Device " + tvBox.getClass().getSimpleName() + " --> " + tvBox.isStatus());

        System.out.println("Device volume --> " + tvBox.getVolume());
        System.out.println("TV is sleeping");
        tvBox.sleep(20);

        MicrowaveOven microwaveOven = new MicrowaveOven(0, 0, 0, 0, "", "", true, 0);
        System.out.println("microwave is sleeping");
        microwaveOven.sleep(20);
    }
}
