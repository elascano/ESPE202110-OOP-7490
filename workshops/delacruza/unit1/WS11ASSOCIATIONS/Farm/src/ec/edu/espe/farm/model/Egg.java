
package ec.edu.espe.farm.model;

/**
 *
 * @author Alejandro Delacruz
 */
public class Egg {
   private int id;

    public Egg(int id) {
        this.id = id;
    }

    public Egg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
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