/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.time.LocalDate;

/**
 *
 * @author Angel Guaman
 */
public class Cow extends FarmAnimal{
    private boolean isProductMilk;

    public Cow(boolean isProductMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProductMilk = isProductMilk;
    }
    

    /**
     * @return the isProductMilk
     */
    public boolean isIsProductMilk() {
        return isProductMilk;
    }

    /**
     * @param isProductMilk the isProductMilk to set
     */
    public void setIsProductMilk(boolean isProductMilk) {
        this.isProductMilk = isProductMilk;
    }
    
}
