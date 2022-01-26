/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cow extends FarmAnimal {
    private boolean isProduccingMilk;

    public Cow(boolean isProduccingMilk, int id, String breed, LocalDate born0n) {
        super(id, breed, born0n);
        this.isProduccingMilk = isProduccingMilk;
    }

    /**
     * @return the isProduccingMilk
     */
    public boolean isIsProduccingMilk() {
        return isProduccingMilk;
    }

    /**
     * @param isProduccingMilk the isProduccingMilk to set
     */
    public void setIsProduccingMilk(boolean isProduccingMilk) {
        this.isProduccingMilk = isProduccingMilk;
    }
    
}
