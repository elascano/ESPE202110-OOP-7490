
package ec.edu.espe.cbook.model;

/**
 *
 * @author Sanchez Jose
 */
public class Cars {
    private int id;
    private String name;
    private String motor;
    private String HoursePower;
    private String tires;
    private String model;
 

    public Cars(int id, String name, String hobby, String cellPhoneNumber, String sex, String group, float salary, String birthdate, String comments) {
        this.id = id;
        this.name = name;
        this.motor = hobby;
        this.HoursePower = cellPhoneNumber;
        this.tires = sex;
        this.model = group;
        
    }


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
     * @return the motor
     */
    public String getHobby() {
        return motor;
    }

    /**
     * @param hobby the motor to set
     */
    public void setHobby(String hobby) {
        this.motor = hobby;
    }

    /**
     * @return the HoursePower
     */
    public String getCellPhoneNumber() {
        return HoursePower;
    }

    /**
     * @param cellPhoneNumber the HoursePower to set
     */
    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.HoursePower = cellPhoneNumber;
    }

    /**
     * @return the tires
     */
    public String getSex() {
        return tires;
    }

    /**
     * @param sex the tires to set
     */
    public void setSex(String sex) {
        this.tires = sex;
    }

    /**
     * @return the model
     */
    public String getGroup() {
        return model;
    }

    /**
     * @param group the model to set
     */
    public void setGroup(String group) {
        this.model = group;
    }
    
}
