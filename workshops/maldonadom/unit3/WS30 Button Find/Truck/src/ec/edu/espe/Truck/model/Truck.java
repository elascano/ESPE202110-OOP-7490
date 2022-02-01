/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Truck.model;

/**
 *
 * @author andresmaldonado
 */
public class Truck {
    
    private int id;
    private String brand;
    private float price;
    private String color;
    private int numberOfTires;
    private float LoadingCapacity;

    public Truck(int id, String brand, float price, String color, int numberOfTires, float LoadingCapacity) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.numberOfTires = numberOfTires;
        this.LoadingCapacity = LoadingCapacity;
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
     * @return the numberOfTires
     */
    public int getNumberOfTires() {
        return numberOfTires;
    }

    /**
     * @param numberOfTires the numberOfTires to set
     */
    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    /**
     * @return the LoadingCapacity
     */
    public float getLoadingCapacity() {
        return LoadingCapacity;
    }

    /**
     * @param LoadingCapacity the LoadingCapacity to set
     */
    public void setLoadingCapacity(float LoadingCapacity) {
        this.LoadingCapacity = LoadingCapacity;
    }
    
}
