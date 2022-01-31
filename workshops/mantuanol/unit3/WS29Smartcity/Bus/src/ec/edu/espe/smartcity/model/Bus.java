
package ec.edu.espe.smartcity.model;

import java.time.LocalDate;

/**
 *
 * @author Leonel Mantuano
 */
public class Bus {

    private int Chassis;
    private String name;
    private int Capacity;
    private String Type;
    private String Owner;
    private int Wheels; 
 
    
    
    
    public Bus(int Chassis, String name, int Capacity, String Type, String Owner, int Wheels) {
        this.Chassis = Chassis;
        this.name = name;
        this.Capacity = Capacity;
        this.Type = Type;
        this.Owner = Owner;
        this.Wheels = Wheels;
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

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
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

    public int getWheels() {
        return Wheels;
    }

    public void setWheels(int Wheels) {
        this.Wheels = Wheels;
    }
    
    
   

   
}
