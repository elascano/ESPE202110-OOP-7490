package ec.edu.espe.controlWeapon.model;

import java.util.Scanner;

/**
 *
 * @author Alexander Ruano
 */
public class WarMaterial {

    private String name;
    private String color;
    private String model;


    public void save() {

    }

    private void delete() {

    }

    private void organize() {

    }

    private void use() {

    }

    @Override
    public String toString() {
        return "WarMaterial{" + "name=" + name + ", color=" + color + ", model=" + model + '}';
    }

    public WarMaterial(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public WarMaterial() {

        System.out.println("\n---------------> DATA WarMaterial 1 <--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---  name  --> ");
        name = scanner.next();
        System.out.println("---  color --> ");
        color = scanner.next();
        System.out.println("---  model --> ");
        model = scanner.next();

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

}
