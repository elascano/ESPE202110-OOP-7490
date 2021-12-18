/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;

    public Sheep(int id, String breed, LocalDate bornOn,LocalDate lastSheering) {
        super(id, breed, bornOn);
        this.lastSheering=lastSheering;
    }
    
    

    public LocalDate getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
}
