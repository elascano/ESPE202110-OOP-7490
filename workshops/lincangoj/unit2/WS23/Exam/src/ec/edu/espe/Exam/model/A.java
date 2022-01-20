/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exam.model;

/**
 *
 * @author MATRIZ PC
 */
public class A {
        private String name;
    private String color;
    private String model;
    private String deliveryOfDay;
    private String DayOfExit;


    public void save() {

    }

    public void delete() {

    }

    public void organize() {

    }

    public void use() {

    }

    @Override
    public String toString() {
        return "Ammunition{" + "name=" + getName() + ", color=" + getColor() + ", model=" + getModel() + ", deliveryOfDay=" + getDeliveryOfDay() + ", DayOfExit=" + getDayOfExit() + '}';
    }

    public A(String name, String color, String model, String deliveryOfDay, String DayOfExit) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.deliveryOfDay = deliveryOfDay;
        this.DayOfExit = DayOfExit;
    }

 
    public A() {

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the deliveryOfDay
     */
    public String getDeliveryOfDay() {
        return deliveryOfDay;
    }

    /**
     * @param deliveryOfDay the deliveryOfDay to set
     */
    public void setDeliveryOfDay(String deliveryOfDay) {
        this.deliveryOfDay = deliveryOfDay;
    }

    /**
     * @return the DayOfExit
     */
    public String getDayOfExit() {
        return DayOfExit;
    }

    /**
     * @param DayOfExit the DayOfExit to set
     */
    public void setDayOfExit(String DayOfExit) {
        this.DayOfExit = DayOfExit;
    }



}
