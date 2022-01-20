/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exam.model;



/**
 *
 * @author Daniel Lincango
 */
public class B {
    
    private String name;
    private String color;
    private String model;
    private String serie;
    private String type;
    private String deliveryOfDay;
    private String DayOfExit;

    public void propeelProyectiles() {

    }

    private void destroy() {

    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + getName() + ", color=" + getColor() + ", model=" + getModel() + ", serie=" + getSerie() + ", type=" + getType() + ", deliveryOfDay=" + getDeliveryOfDay() + ", DayOfExit=" + getDayOfExit() + '}';
    }

    public B(String name, String color, String model, String serie, String type, String deliveryOfDay, String DayOfExit) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.serie = serie;
        this.type = type;
        this.deliveryOfDay = deliveryOfDay;
        this.DayOfExit = DayOfExit;
    }


    public B() {


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
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
