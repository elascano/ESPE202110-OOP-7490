
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mateo landazuri oop
 */
public class Sheep {
    private LocalDate lastSheering;
    private LocalDate bornOnSheep;
    int idSheep;
    String breedSheep;
    
    ArrayList<Sheep> sheeps = new ArrayList();  

    public Sheep(int idSheep, String breedSheep, LocalDate lastSheering, LocalDate bornOnSheep) {
        this.lastSheering = lastSheering;
        this.bornOnSheep = bornOnSheep;
        this.idSheep = idSheep;
        this.breedSheep = breedSheep;
    }

    public String [] toCsvSheep(){
        String [] csv = {String.valueOf(idSheep) + ";" + breedSheep + ";" + String.valueOf(bornOnSheep)+ ";" + String.valueOf(lastSheering)};
        return csv;
    }    
    
    public void AddSheep(LocalDate lastSheering, int idSheep, String breedSheep, LocalDate bornOnSheep) {
         
        sheeps.add(new Sheep(idSheep, breedSheep, bornOnSheep, lastSheering));
        
    }    
    /**
     * @return the lastSheering
     */
    public LocalDate getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }

    /**
     * @return the bornOnSheep
     */
    public LocalDate getBornOnSheep() {
        return bornOnSheep;
    }

    /**
     * @param bornOnSheep the bornOnSheep to set
     */
    public void setBornOnSheep(LocalDate bornOnSheep) {
        this.bornOnSheep = bornOnSheep;
    }
    
}
