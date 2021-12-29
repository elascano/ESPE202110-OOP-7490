
package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author malvarez
 */
public class ChickenCoop {
    
    private int id;
<<<<<<< HEAD
    private ArrayList<Chicken> chickens;
    
    public void add(Chicken chicken){
        chickens.add(chicken);
        
    }
    
        public void remove(Chicken chicken){
        chickens.remove(chicken);
        
    }
    
    
=======
    private ArrayList<Chicken> chickens;  
    
    public void add(Chicken chicken){ 
        chickens.add(chicken);    
    }
    
   
    public void remove(Chicken chicken){
        chickens.remove(chicken);   
        chickens.remove(id); 
    }
    
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public int countChickens(){
        return chickens.size();
    }

    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
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
