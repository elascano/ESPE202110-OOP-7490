
package ec.edu.espe.insect.model;

/**
 *
 * @author Salma Villegas
 */
public class Insect {
    
    private int Id;
    private String name;
    private String type;
    private String color;
    private boolean flightability;
    private int paws;

    @Override
    public String toString() {
        return "Insect{" + "Id=" + getId() + ", name=" + getName() + ", type=" + getType() + ", color=" + getColor() + ", flightability=" + isFlightability() + ", paws=" + getPaws() + '}';
    }

    public Insect(int Id, String name, String type, String color, boolean flightability, int paws) {
        this.Id = Id;
        this.name = name;
        this.type = type;
        this.color = color;
        this.flightability = flightability;
        this.paws = paws;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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
     * @return the flightability
     */
    public boolean isFlightability() {
        return flightability;
    }

    /**
     * @param flightability the flightability to set
     */
    public void setFlightability(boolean flightability) {
        this.flightability = flightability;
    }

    /**
     * @return the paws
     */
    public int getPaws() {
        return paws;
    }

    /**
     * @param paws the paws to set
     */
    public void setPaws(int paws) {
        this.paws = paws;
    }
    
    
}
