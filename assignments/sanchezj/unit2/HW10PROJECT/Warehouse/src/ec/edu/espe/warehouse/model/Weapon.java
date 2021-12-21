
package ec.edu.espe.warehouse.model;

/**
 *
 * @author José
 */
public class Weapon {
    private int id;
    private String description;
    private String type;
    private boolean status; // true  if the device is operble, false if the devoce is not operable
    private int ammunition;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the ammunition
     */
    public int getAmmunition() {
        return ammunition;
    }

    /**
     * @param ammunition the ammunition to set
     */
    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }
   
    
    
}
