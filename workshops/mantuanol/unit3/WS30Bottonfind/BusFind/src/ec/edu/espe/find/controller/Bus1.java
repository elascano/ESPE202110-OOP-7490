
package ec.edu.espe.find.controller;

/**
 *
 * @author Leonel Mantuano
 */
public class Bus1 {
    
    private int Chassis;
    private String name;
    private String Capacity;
    private String Type;
    private String Owner;
    private int Wheels;

    public Bus1(int Chassis, String name, String Capacity, String Type, String Owner, int Wheels) {
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

    public int getWheels() {
        return Wheels;
    }

    public void setWheels(int Wheels) {
        this.Wheels = Wheels;
    }

    
    
}
