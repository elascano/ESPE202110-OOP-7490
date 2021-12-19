
import java.util.ArrayList;


/**
 *
 * @author JaimeEivar
 */
public class ChickenCoop {
    
    private int id;
    private ArrayList<Chicken> chickens [];
    
    public void add(Chicken chicken){
    chickens.add (chicken);
    }
    public void add(Chicken chicken){
    chickens.add (chicken);
    
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
    public ArrayList<Chicken>[] getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken>[] chickens) {
        this.chickens = chickens;
    }
    
    
    
}
