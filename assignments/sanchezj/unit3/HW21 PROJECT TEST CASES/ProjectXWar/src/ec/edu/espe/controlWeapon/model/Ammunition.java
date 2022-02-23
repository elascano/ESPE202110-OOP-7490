package ec.edu.espe.controlWeapon.model;



/**
 *
 * @author Alexander Ruano
 * @author Leandro Quinga
 * @author Javier Paucar
 * @author Jose Sanchez
 * @author Paul Saltos
 */
public class Ammunition {

    private String name;
    private String color;
    private String model;
    private String value;
    private String deliveryOfDay;
    private String DayOfExit;


    public void save() {

    }

    public void delete() {

    }

    public void organize() {

    }

    public void use() {

    }

    @Override
    public String toString() {
        return "Ammunition{" + "name=" + getName() + ", color=" + getColor() + ", model=" + getModel() + ", value=" + getValue() + ", deliveryOfDay=" + getDeliveryOfDay() + ", DayOfExit=" + getDayOfExit() + '}';
    }

    public Ammunition(String name, String color, String model, String value, String deliveryOfDay, String DayOfExit) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.value = value;
        this.deliveryOfDay = deliveryOfDay;
        this.DayOfExit = DayOfExit;
    }



 
    public Ammunition() {

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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the deliveryOfDay
     */
    public String getDeliveryOfDay() {
        return deliveryOfDay;
    }

    /**
     * @param deliveryOfDay the deliveryOfDay to set
     */
    public void setDeliveryOfDay(String deliveryOfDay) {
        this.deliveryOfDay = deliveryOfDay;
    }

    /**
     * @return the DayOfExit
     */
    public String getDayOfExit() {
        return DayOfExit;
    }

    /**
     * @param DayOfExit the DayOfExit to set
     */
    public void setDayOfExit(String DayOfExit) {
        this.DayOfExit = DayOfExit;
    }


}
