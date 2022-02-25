
package ec.edu.espe.house.model;

import java.util.ArrayList;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class User {
    
    private String name;
    private int age;
    private int []cellphone = new int [1];
    private ArrayList<House> house = new ArrayList<House>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the cellphone
     */
    public int[] getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(int[] cellphone) {
        this.cellphone = cellphone;
    }
    /**
     * @return the house
     */
    public ArrayList<House> getHouse() {
        return house;
    }

    /**
     * @param house the house to set
     */
    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }
    
}
