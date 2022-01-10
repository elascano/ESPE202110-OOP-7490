
package ec.edu.espe.time.model;


/**
 *
 * @author Paul Saltos
 */
public class Time {
    private String id;
    private String color;
    private String model;


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
        return "Time{" + "id=" + id + ", color=" + color + ", model=" + model + '}';
    }

    public Time(String id, String color, String model) {
        this. id = id;
        this.color = color;
        this.model = model;
    }


    /**
     * @return the id
     */
    public String getid() {
        return id;
    }

    /**
     * @param name the id to set
     */
    public void setid(String name) {
        this.id = id;
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
}
