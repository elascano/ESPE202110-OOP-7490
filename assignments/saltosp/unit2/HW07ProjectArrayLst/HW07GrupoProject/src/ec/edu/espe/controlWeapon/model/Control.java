package ec.edu.espe.controlWeapon.model;

import java.util.Scanner;

/**
 *
 * @author Javier Paucar
 */
public class Control {

    private String name;
    private String color;
    private String model;
    private int yearFabrication;

    public void organize() {

    }

    private void change() {

    }

    private void doPlan() {

    }

    public void calculate() {

    }

    @Override
    public String toString() {
        return "Control{" + "name=" + name + ", color=" + color + ", model=" + model + ", yearFabrication=" + yearFabrication + '}';
    }

    public Control(String name, String color, String model, int yearFabrication) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.yearFabrication = yearFabrication;
    }

    public Control() {

        System.out.println("\n--------> DATA Control 1 <--------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---> name <---");
        name = scanner.next();
        System.out.println("---> color <---");
        color = scanner.next();
        System.out.println("---> model <---");
        model = scanner.next();
        System.out.println("---> year fundation <---");
        yearFabrication = scanner.nextInt();
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
     * @return the colour
     */
    public String getColour() {
        return color;
    }

    /**
     * @param color the colour to set
     */
    public void setColour(String color) {
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
     * @return the yearFabrication
     */
    public int getYearFabrication() {
        return yearFabrication;
    }

    /**
     * @param yearFabrication the yearFabrication to set
     */
    public void setYearFabrication(int yearFabrication) {
        this.yearFabrication = yearFabrication;
    }

}
