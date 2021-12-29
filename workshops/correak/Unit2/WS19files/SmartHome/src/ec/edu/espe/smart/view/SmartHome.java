/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// file manager que se guarde los datos 
package ec.edu.espe.smart.view;

import utils.FileManager;

/**
 *
 * @author Kerly
 */
public class SmartHome {
    public static void main(String[] args){
     
        System.out.println("list of devices from my home");
        String animal;
        String fileName = "data/animal.csv";
        animal =FileManager.read(fileName);
        System.out.println("-> \n"+ animal);
        
        String devices;
        fileName = "data/devices.csv";
        devices =FileManager.read(fileName);
        System.out.println("-> \n"+ devices);
    }
}
