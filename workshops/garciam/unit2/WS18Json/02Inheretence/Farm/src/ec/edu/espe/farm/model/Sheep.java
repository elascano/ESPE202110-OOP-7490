/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author mayer
 */
public class Sheep extends FarmAnimal{
    private Date lastSheering;

    public Sheep(Date lastSheering, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }
    
    
    
}
