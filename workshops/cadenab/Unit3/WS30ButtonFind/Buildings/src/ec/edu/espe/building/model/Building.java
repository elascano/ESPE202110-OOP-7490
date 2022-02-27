/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.building.model;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class Building {
    private String color;
    private String name;
    private int floors;
    private String country;
    private String city;

    public Building(String color, String name, int floors, String country, String city) {
        this.color = color;
        this.name = name;
        this.floors = floors;
        this.country = country;
        this.city = city;
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
     * @return the floors
     */
    public int getFloors() {
        return floors;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
}
