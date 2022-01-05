/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;



/**
 *
 * @author Usuario
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

//    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn, ArrayList<Chicken> chickens, ArrayList<Cow> cows, ArrayList<Pig> pigs, ArrayList<Sheep> sheeps) {
//        super(id, breed, bornOn, chickens, cows, pigs, sheeps);
//        this.isMolting = isMolting;
//    }

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
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
    
    
}
