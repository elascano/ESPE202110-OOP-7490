package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author SETayoRuiz
 *
 */
public class Chicken extends FarmAnimal {

    private boolean isMolting;
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public String generaLineaCSV() {
        return String.format("%s;%s;%s;%s\n", id, breed, bornOn, isMolting);
    }

    public void Chicken() {

    }

    public Chicken(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        
    }

    public void print() {
        System.out.println("The id --> " + id);
        System.out.println("The name is --> " + breed);
        System.out.println("The color is --> " + bornOn);
    }

    @Override
    public void AddChicken(int id, String name, LocalDate bornOn) {

        chickens.add(new Chicken(id, name, bornOn));

    }

    public Chicken(int id, String breed, LocalDate bornOn, boolean isMolting) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public Chicken() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
