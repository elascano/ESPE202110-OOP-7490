
package ec.edu.espe.SmartCity.model;

import java.time.LocalDate;

/**
 *
 * @author Daniel Lincango
 */
public class Bone {
    private int size;
    private String boneType;
    private String location;
    private String boneBelongs;
    private String transmissionType;
    private float numerBone;


    public Bone(int vehicleBrand, String model, String color, String fuelType, String transmissionType, float price ) {
        this.size = vehicleBrand;
        this.boneType = model;
        this.location = color;
        this.boneBelongs = fuelType;
        this.transmissionType = transmissionType;
        this.numerBone = price;
        
       
    }

    /**
     * @return the size
     */
    public int getVehicleBrand() {
        return size;
    }

    /**
     * @param vehicleBrand the size to set
     */
    public void setVehicleBrand(int vehicleBrand) {
        this.size = vehicleBrand;
    }

    /**
     * @return the boneType
     */
    public String getModel() {
        return boneType;
    }

    /**
     * @param model the boneType to set
     */
    public void setModel(String model) {
        this.boneType = model;
    }

    /**
     * @return the location
     */
    public String getColor() {
        return location;
    }

    /**
     * @param color the location to set
     */
    public void setColor(String color) {
        this.location = color;
    }

    /**
     * @return the boneBelongs
     */
    public String getFuelType() {
        return boneBelongs;
    }

    /**
     * @param fuelType the boneBelongs to set
     */
    public void setFuelType(String fuelType) {
        this.boneBelongs = fuelType;
    }

    /**
     * @return the transmissionType
     */
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * @param transmissionType the transmissionType to set
     */
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    /**
     * @return the numerBone
     */
    public float getPrice() {
        return numerBone;
    }

    /**
     * @param price the numerBone to set
     */
    public void setPrice(float price) {
        this.numerBone = price;
    }

 

    
    
    
    
}
