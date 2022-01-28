package ec.edu.espe.smart.view;

import utils.FileManager;

/**
 *
 * @author dylanasumaza
 */
public class SmartHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("list of devices from my home");
        String devices;
        String fileName = "data/devices.csv";
        devices = FileManager.Read(fileName);

        System.out.println(" --> \n " + devices);

    }
}
