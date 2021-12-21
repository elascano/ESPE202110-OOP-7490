
package ec.edu.espe.ChickenFarm.model;
import java.time.LocalDate;
/**
 *
 * @author MateoMaldonado
 */
public class FarmAnimal {
   private int id;
    private String streed;
    private LocalDate bornon;

    public int getAgeInMonths(){
        return 0;
    }
    
    public FarmAnimal(int id, String streed, LocalDate bornon) {
        this.id = id;
        this.streed = streed;
        this.bornon = bornon;
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
     * @return the streed
     */
    public String getStreed() {
        return streed;
    }

    /**
     * @param streed the streed to set
     */
    public void setStreed(String streed) {
        this.streed = streed;
    }

    /**
     * @return the bornon
     */
    public LocalDate getBornon() {
        return bornon;
    }

    /**
     * @param bornon the bornon to set
     */
    public void setBornon(LocalDate bornon) {
        this.bornon = bornon;
    }
     
}
