
package ec.edu.espe.city.model;

/**
 *
 * @author Alexander Ruano
 */
public class Dog {
    private int code;
    private String name;
    private String color;
    private String race;
    private String height;
    private String weinght;
    private String dateOfBirth;

    public Dog(int code, String name, String color, String race, String height, String weinght, String dateOfBirth) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.race = race;
        this.height = height;
        this.weinght = weinght;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
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
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the weinght
     */
    public String getWeinght() {
        return weinght;
    }

    /**
     * @param weinght the weinght to set
     */
    public void setWeinght(String weinght) {
        this.weinght = weinght;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
}
