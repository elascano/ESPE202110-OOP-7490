package ec.edu.espe.farm.view;

import utils.FileManager;

/**
 *
 * @author darling.cruz 
 */
public class SmartHome {
    public static void main(String[] args){
        System.out.println("List of devices of the home ");
        String devices;
        String fileName = "data/devices.csv";
        devices = FileManager.read(fileName);
        
        System.out.println("  --> \n"+ devices);
    }
}

