/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.exam1.model;

/**
 *
 * @author José
 */
public class book {
    private String name;
    private String pubisher;
    private int cost;

    public book(String name, String pubisher, int cost) {
        this.name = name;
        this.pubisher = pubisher;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "book{" + "name=" + name + ", pubisher=" + pubisher + ", cost=" + cost + '}';
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
     * @return the pubisher
     */
    public String getPubisher() {
        return pubisher;
    }

    /**
     * @param pubisher the pubisher to set
     */
    public void setPubisher(String pubisher) {
        this.pubisher = pubisher;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
    
}
