
package ec.edu.espe.farm.model;

import java.time.LocalDate;
<<<<<<< HEAD

/**
 *
 * @author MaldonadoMateo
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;
    LocalDate bornOnCow;

    public Cow(boolean isProducingMilk, int idCow, String breedCow, LocalDate bornOnCow) {
        super(idCow, breedCow, bornOnCow);
        this.isProducingMilk = isProducingMilk;
    }

=======
import java.util.ArrayList;

/**
 *
 * @author ALEJANDRO DELACRUZ
 */
public class Cow {
    private boolean isProducingMilk;
    int idCow;
    String breedCow;
    LocalDate bornOnCow;

    ArrayList<Cow> cows = new ArrayList(); 

    public Cow(int idCow, String breedCow, LocalDate bornOnCow, boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
        this.idCow = idCow;
        this.breedCow = breedCow;
        this.bornOnCow = bornOnCow;
    }
    
    public String [] toCsvCow(){
        String [] csv = {String.valueOf(idCow) + ";" + breedCow + ";" + String.valueOf(bornOnCow)+ ";" + String.valueOf(isProducingMilk)};
        return csv;
    }    
    
    public void AddCow(float weight, int idPig, String breedPig, LocalDate bornOnPig) {
         
        cows.add(new Cow(idCow, breedCow, bornOnCow, isProducingMilk));
        
    }     
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    /**
     * @return the bornOn
     */
    public LocalDate getBornOnCow() {
        return bornOnCow;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOnCow(LocalDate bornOnCow) {
        this.bornOnCow = bornOnCow;
    }

}
