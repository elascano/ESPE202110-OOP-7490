/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.smart.view;

import utils.FileManager;

/**
 *
 * @author José
 */
public class SmartHome {
    public static void main(String[] args) {
        System.out.println("lis od devices from my home");
        String devices;
        String fileName = "DEVICES.CSV";
        devices = FileManager.read(fileName);
        
        System.out.println("-->\n" + devices );
    }
    
}