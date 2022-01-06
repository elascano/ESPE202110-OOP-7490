package ec.edu.espe.warehouse.model;

import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class Warehouse {

    private int id;
    private ArrayList<Weapon> weapons;

    public void add(Weapon weapon){
        weapons.add(weapon);
    }
    public void remove(int id){
        weapons.removeIf(weapon -> weapon.getId () == id);
    }
    
     public int countWeapons(){
         return weapons.size();
     }      
    
    @Override
    public String toString() {
        return "Warehouse{" + "id=" + id + ", weapons=" + weapons + '}';
    }

    public Warehouse(int id, ArrayList<Weapon> weapons) {
        this.id = id;
        this.weapons = weapons;
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
