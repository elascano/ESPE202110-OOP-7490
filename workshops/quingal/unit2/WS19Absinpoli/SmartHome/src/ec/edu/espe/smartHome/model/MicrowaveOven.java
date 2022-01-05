/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.smartHome.model;

/**
 *
 * @author Leandro Quinga 
 */
public class MicrowaveOven extends Device{
    private int time;
    private float supportedWeight;
    private float cc;
   
    @Override
    public void sleep(int time) {
        System.out.println("Sleeping a microwave oven to "+time+"seconds");
    }
        
    public MicrowaveOven(int time, float supportedWeight, float cc, int id, String description, String room, boolean status, int workingData) {
        super(id, description, room, status, workingData);
        this.time = time;
        this.supportedWeight = supportedWeight;
        this.cc = cc;
    }
        
    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the supportedWeight
     */
    public float getSupportedWeight() {
        return supportedWeight;
    }

    /**
     * @param supportedWeight the supportedWeight to set
     */
    public void setSupportedWeight(float supportedWeight) {
        this.supportedWeight = supportedWeight;
    }

    /**
     * @return the cc
     */
    public float getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(float cc) {
        this.cc = cc;
    }

    
    
    
   
    
}
