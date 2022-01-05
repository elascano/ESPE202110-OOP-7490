/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.samrt.model;

/**
 *
 * @author USUARIO
 */
public class MicrowaveOven {
    private int time;
    private float supportedWeight;
    private float cc;

    

    public void sleep(int time) {
         System.out.println("Sleeping a microwave oven to time in second"+time);
    }
    
    public MicrowaveOven(int time, float supportedWeight, float cc) {
        this.time = time;
        this.supportedWeight = supportedWeight;
        this.cc = cc;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public float getSupportedWeight() {
        return supportedWeight;
    }

    public void setSupportedWeight(float supportedWeight) {
        this.supportedWeight = supportedWeight;
    }

    public float getCc() {
        return cc;
    }

    public void setCc(float cc) {
        this.cc = cc;
    }
    
    
}
