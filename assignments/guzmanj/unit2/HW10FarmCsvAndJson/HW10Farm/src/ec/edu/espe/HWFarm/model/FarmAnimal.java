/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.HWFarm.model;
import java.time.LocalDate;
/**
 *
 * @author Jose Guzman
 */
public class FarmAnimal {
   private int id;
    private String streed;
    private LocalDate bornon;

    public int getAgeInMonths(){
        return 0;
    }
    
    public FarmAnimal(int id, String streed, LocalDate bornon) {
        this.id = id;
        this.streed = streed;
        this.bornon = bornon;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the streed
     */
    public String getStreed() {
        return streed;
    }

    /**
     * @param streed the streed to set
     */
    public void setStreed(String streed) {
        this.streed = streed;
    }

    /**
     * @return the bornon
     */
    public LocalDate getBornon() {
        return bornon;
    }

    /**
     * @param bornon the bornon to set
     */
    public void setBornon(LocalDate bornon) {
        this.bornon = bornon;
    }
     
}
