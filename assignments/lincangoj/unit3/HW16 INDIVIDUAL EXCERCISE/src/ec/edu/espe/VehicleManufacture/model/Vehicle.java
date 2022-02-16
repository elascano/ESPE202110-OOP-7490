
package ec.edu.espe.VehicleManufacture.model;

import java.time.LocalDate;

/**
 *
 * @author Daniel Lincango
 */
public class Vehicle {
    private int vehicleBrand;
    private String model;
    private String color;
    private String fuelType;
    private String transmissionType;
    private float price;


    public Vehicle(int vehicleBrand, String model, String color, String fuelType, String transmissionType, float price ) {
        this.vehicleBrand = vehicleBrand;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.price = price;
        
       
    }

    /**
     * @return the vehicleBrand
     */
    public int getVehicleBrand() {
        return vehicleBrand;
    }

    /**
     * @param vehicleBrand the vehicleBrand to set
     */
    public void setVehicleBrand(int vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the fuelType
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * @param fuelType the fuelType to set
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

 

    
    
    
    
}
