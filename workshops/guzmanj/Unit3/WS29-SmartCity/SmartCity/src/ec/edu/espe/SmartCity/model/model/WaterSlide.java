/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SmartCity.model.model;

/**
 *
 * @author Jose Guzman
 */
public class WaterSlide {
    private int id;
    private int high;
    private int length;
    private int inclinationAngle;
    private String color;
    private String material;

    public WaterSlide(int id, int high, int length, int inclinationAngle, String color, String material) {
        this.id = id;
        this.high = high;
        this.length = length;
        this.inclinationAngle = inclinationAngle;
        this.color = color;
        this.material = material;
    }

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the high
     */
    public int getHigh() {
        return high;
    }

    /**
     * @param high the high to set
     */
    public void setHigh(int high) {
        this.high = high;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the inclinationAngle
     */
    public int getInclinationAngle() {
        return inclinationAngle;
    }

    /**
     * @param inclinationAngle the inclinationAngle to set
     */
    public void setInclinationAngle(int inclinationAngle) {
        this.inclinationAngle = inclinationAngle;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
    
}
