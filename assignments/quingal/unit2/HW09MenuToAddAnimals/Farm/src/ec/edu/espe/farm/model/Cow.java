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
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;

//    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn, ArrayList<Chicken> chickens, ArrayList<Cow> cows, ArrayList<Pig> pigs, ArrayList<Sheep> sheeps) {
//        super(id, breed, bornOn, chickens, cows, pigs, sheeps);
//        this.isProducingMilk = isProducingMilk;
//    }

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

  

   

   

   
    

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
    
    
    
}
