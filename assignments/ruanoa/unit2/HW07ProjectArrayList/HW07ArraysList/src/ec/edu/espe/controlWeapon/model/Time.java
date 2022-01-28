package ec.edu.espe.controlWeapon.model;

import java.util.Scanner;

/**
 *
 * @author Paul Saltos
 */
public class Time {

    private String name;
    private String model;
    private String date;
    private String number;

    public void organize() {

    }

    private void registration() {

    }

    public void calculate() {

    }

    @Override
    public String toString() {
        return "Time{" + "name=" + getName() + ", model=" + getModel() + ", date=" + getDate() + ", number=" + getNumber() + '}';
    }

    public Time(String name, String model, String date, String number) {
        this.name = name;
        this.model = model;
        this.date = date;
        this.number = number;
    }

    public Time() {

        System.out.println("\n---------------> DATA TIME <--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---  name  --> ");
        name = scanner.next();
        System.out.println("---  model --> ");
        model = scanner.next();
        System.out.println("---  date --> ");
        date = scanner.next();
        System.out.println("---  number --> ");
        number = scanner.next();

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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

}
