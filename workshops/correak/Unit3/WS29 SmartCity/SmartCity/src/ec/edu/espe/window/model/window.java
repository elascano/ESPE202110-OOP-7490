/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.window.model;

/**
 *
 * @author USUARIO
 */
public class window {
    
    private int waterTightness,airPermeability;
    private int weight;
    private int endurance;
    private float thermalTransmittance;
    private String type;

    public window(int waterTightness, int airPermeability, int weight, int endurance, float thermalTransmittance, String type) {
        this.waterTightness = waterTightness;
        this.airPermeability = airPermeability;
        this.weight = weight;
        this.endurance = endurance;
        this.thermalTransmittance = thermalTransmittance;
        this.type = type;
    }

    

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    
    public window(){
        
    }

    public int getWaterTightness() {
        return waterTightness;
    }

    public void setWaterTightness(int waterTightness) {
        this.waterTightness = waterTightness;
    }

    public int getAirPermeability() {
        return airPermeability;
    }

    public void setAirPermeability(int airPermeability) {
        this.airPermeability = airPermeability;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getThermalTransmittance() {
        return thermalTransmittance;
    }

    public void setThermalTransmittance(float thermalTransmittance) {
        this.thermalTransmittance = thermalTransmittance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
