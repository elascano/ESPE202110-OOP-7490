
package ec.edu.espe.controller;

import java.time.LocalDate;

/**
 *
 * @author Leonel Mantuano
 */
public class Vehiclesp {
 
    private int Chassis;
    private String name;
    private String Capacity;
    private String Type;
    private String Owner;

    
    
    public Vehiclesp(int Chassis, String name, String Capacity, String Type, String Owner) {
        this.Chassis = Chassis;
        this.name = name;
        this.Capacity = Capacity;
        this.Type = Type;
        this.Owner = Owner;
    }
    public int getChassis() {
        return Chassis;
    }

    public void setChassis(int Chassis) {
        this.Chassis = Chassis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }
    
    
    
    
   
   

}
