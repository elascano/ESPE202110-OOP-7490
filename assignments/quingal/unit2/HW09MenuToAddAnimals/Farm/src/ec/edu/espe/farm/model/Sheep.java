/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Sheep extends FarmAnimal{
    private Date lasrSheering;

//    public Sheep(Date lasrSheering, int id, String breed, LocalDate bornOn, ArrayList<Chicken> chickens, ArrayList<Cow> cows, ArrayList<Pig> pigs, ArrayList<Sheep> sheeps) {
//        super(id, breed, bornOn, chickens, cows, pigs, sheeps);
//        this.lasrSheering = lasrSheering;
//    }

    public Sheep(Date lasrSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lasrSheering = lasrSheering;
    }

   
   
   
   

    /**
     * @return the lasrSheering
     */
    public Date getLasrSheering() {
        return lasrSheering;
    }

    /**
     * @param lasrSheering the lasrSheering to set
     */
    public void setLasrSheering(Date lasrSheering) {
        this.lasrSheering = lasrSheering;
    }
    

   
}
