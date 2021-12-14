package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dylanasumaza
 */
public class ChickenCoop {

    private int id;
    private ArrayList<Chicken> chickens;

    public void add(Chicken chicken) {
        chickens.add(chicken);
    }

    public int countChickens() {
        return chickens.size();
    }

    public void remove(Chicken chicken) {
        int idRemove;
        Scanner remove = new Scanner(System.in);
        System.out.println("- id  --> ");
        idRemove = remove.nextInt();
        chickens.remove((idRemove - 1));

    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
    }

    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
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
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

}
