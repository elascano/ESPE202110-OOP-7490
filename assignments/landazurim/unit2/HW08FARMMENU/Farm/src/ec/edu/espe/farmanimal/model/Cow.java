/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmanimal.model;

import java.time.LocalDate;


/**
 *
 * @author Mateo Israel Landazuri Segovia OOP
 */
public class Cow extends FarmAnimal {
    private boolean isProducingMilk;
    
    public Cow(int id, String breed, LocalDate bornOn,boolean isProducingMilk) {
        super(id, breed, bornOn);
        this.isProducingMilk=isProducingMilk;
    }

    
    
}
