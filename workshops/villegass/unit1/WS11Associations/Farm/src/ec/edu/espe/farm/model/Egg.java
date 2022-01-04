package ec.edu.espe.farm.model;

/**
 *
 * @author Salma Villegas
 */
public class Egg {

    private int id;

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
    }
    
   
    public Egg(int id) {
        this.id = id;
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

}
