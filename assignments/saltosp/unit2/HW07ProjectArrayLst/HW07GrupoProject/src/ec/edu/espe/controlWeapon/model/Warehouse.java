package ec.edu.espe.controlWeapon.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier Paucar
 * @author Alexander Ruano
 * @author Leandro Quinga
 * @author Paul Saltos
 */
public class Warehouse {

    private String name;
    private String country;
    private String city;
    private int number;
    private int yearFundation;
    private ArrayList<Explosive> explosives;
    private ArrayList<Ammunition> ammunitions;
    private ArrayList<WarMaterial> warMaterials;
    private ArrayList<Weapon> weapons;
    private ArrayList<Warehouse> warehouses;
    private ArrayList<Control> controls;
    private ArrayList<Time> time;

    private void security() {

    }

    private void intelligence() {

    }

    public void support() {

    }

    public Troops defended() {

        return new Troops();

    }

    @Override
    public String toString() {
        return "Warehouse{" + "name=" + getName() + ", country=" + getCountry() + ", city=" + getCity() + ", number=" + getNumber() + ", yearFundation=" + getYearFundation() + '}';
    }

    public Warehouse(String name, String country, String city, int number, int yearFundation, ArrayList<Explosive> explosives, ArrayList<Ammunition> ammunitions, ArrayList<WarMaterial> warMaterials, ArrayList<Weapon> weapons, ArrayList<Warehouse> warehouses, ArrayList<Control> controls, ArrayList<Time> time) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.number = number;
        this.yearFundation = yearFundation;
        this.explosives = explosives;
        this.ammunitions = ammunitions;
        this.warMaterials = warMaterials;
        this.weapons = weapons;
        this.warehouses = warehouses;
        this.controls = controls;
        this.time = time;
    }

    public Warehouse() {
        System.out.println("\n--------> DATA Warehouse 1 <--------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---> name <---");
        name = scanner.next();
        System.out.println("---> country <---");
        country = scanner.next();
        System.out.println("---> city <---");
        city = scanner.next();
        System.out.println("---> number <---");
        number = scanner.nextInt();
        System.out.println("---> year fundation <---");
        yearFundation = scanner.nextInt();
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
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the yearFundation
     */
    public int getYearFundation() {
        return yearFundation;
    }

    /**
     * @param yearFundation the yearFundation to set
     */
    public void setYearFundation(int yearFundation) {
        this.yearFundation = yearFundation;
    }

    /**
     *
     * @return the weapons
     */
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    /**
     * @param weapons the weapons to set
     */
    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

}
