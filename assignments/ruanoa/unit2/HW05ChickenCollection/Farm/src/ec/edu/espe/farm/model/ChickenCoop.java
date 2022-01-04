
package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Ruano
 */
public class ChickenCoop {
    private int id;
    private ArrayList<Chicken>chickens;
    
    public ChickenCoop(int id,ArrayList<Chicken>chickens){
        this.id=id;
        this.chickens=chickens;
    } 
    
    public void add(Chicken chicken) {
        getChickens().add(chicken);
    }

    public void remove(int id) {
        getChickens().removeIf(chicken -> chicken.getId() == id);
    }

    public int countChickens() {
        return getChickens().size();
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
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