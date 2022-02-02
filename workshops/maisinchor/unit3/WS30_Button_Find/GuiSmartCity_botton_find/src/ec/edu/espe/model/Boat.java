
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Maisincho Richar
 */
public abstract class Boat {
    ArrayList id;
    private ArrayList yearofproduction;
    private ArrayList capacity;
    private ArrayList size;
    private ArrayList origin;
    private ArrayList color;

    public Boat(ArrayList id, ArrayList yearofproduction, ArrayList capacity, ArrayList size, ArrayList origin, ArrayList color) {
        this.id = id;
        this.yearofproduction = yearofproduction;
        this.capacity = capacity;
        this.size = size;
        this.origin = origin;
        this.color = color;
    }

    public ArrayList getColor() {
        return color;
    }

    public void setColor(ArrayList color) {
        this.color = color;
    }

    public ArrayList getId() {
        return id;
    }

    public void setId(ArrayList id) {
        this.id = id;
    }

    public ArrayList getYearofproduction() {
        return yearofproduction;
    }

    public void setYearofproduction(ArrayList yearofproduction) {
        this.yearofproduction = yearofproduction;
    }

    public ArrayList getCapacity() {
        return capacity;
    }

    public void setCapacity(ArrayList capacity) {
        this.capacity = capacity;
    }

    public ArrayList getSize() {
        return size;
    }

    public void setSize(ArrayList size) {
        this.size = size;
    }

    public ArrayList getOrigin() {
        return origin;
    }

    public void setOrigin(ArrayList origin) {
        this.origin = origin;
    }

    public abstract void IngresarId (int id);
    
    
}
