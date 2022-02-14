
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Anthony Morales
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public String generaLineaCSV() {
    	return String.format("%s;%s;%s;%s\n", id, breed, bornOn); 
    }
    public void Chicken(){
        
    }

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }
    
    public void print(){
        System.out.println("The id is: " + id);
        System.out.println("The name is: " + breed);
        System.out.println("The color is: " + bornOn);
    }
    
    
    
    public void AddChicken(int id, String name, LocalDate bornOn) {
         
        chickens.add(new Chicken(id, name, bornOn));
        
    }
    
    
    public Chicken(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }
 

    public boolean isIsMolting() {
        return isMolting;
    }


    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
   
}
