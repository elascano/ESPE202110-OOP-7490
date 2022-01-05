package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Caisatoa
 **/

public class Chicken{
    private boolean isMolting;
    private int idChicken;
    private String breedChicken;
    private LocalDate bornOnChicken;
    ArrayList<Chicken> chickens = new ArrayList();
    
    public void Chicken(){
        
    }
    
    public String [] toCsvChicken(){
        String [] csv = {String.valueOf(idChicken) + ";" + breedChicken + ";" + String.valueOf(bornOnChicken)+ ";\n"};
        return csv;
    }

    public Chicken(int idChicken, String breedChicken, LocalDate bornOnChicken) {
        this.isMolting = isMolting;
        this.idChicken = idChicken;
        this.breedChicken = breedChicken;
        this.bornOnChicken = bornOnChicken;
    }
    
    public void print(){
        System.out.println("The id --> " + idChicken);
        System.out.println("The name is --> " + breedChicken);
        System.out.println("The color is --> " + bornOnChicken);
    }
      
    public void AddChicken(int idChicken, String nameChicken, LocalDate bornOnChicken) {
         
        chickens.add(new Chicken(idChicken, nameChicken, bornOnChicken));
        
    }
 
    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    /**
     * @return the idChicken
     */
    public int getIdChicken() {
        return idChicken;
    }

    /**
     * @param idChicken the idChicken to set
     */
    public void setIdChicken(int idChicken) {
        this.idChicken = idChicken;
    }

    /**
     * @return the breedChicken
     */
    public String getBreedChicken() {
        return breedChicken;
    }

    /**
     * @param breedChicken the breedChicken to set
     */
    public void setBreedChicken(String breedChicken) {
        this.breedChicken = breedChicken;
    }

    /**
     * @return the bornOnChicken
     */
    public LocalDate getBornOnChicken() {
        return bornOnChicken;
    }

    /**
     * @param bornOnChicken the bornOnChicken to set
     */
    public void setBornOnChicken(LocalDate bornOnChicken) {
        this.bornOnChicken = bornOnChicken;
    }
}
