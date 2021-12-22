package ec.edu.espe.farm.model;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KERLY 
 */
public class FarmAnimal {
    private int id ;
    private String breed; 
    private Date bornOn;
    private ArrayList<Chicken> chickens;
   
        public void add(Chicken chickens){
            chickens.add(chickens);
        }
        

    public int getAgeInMonths(){
        return 0;
    }

    public FarmAnimal(int id, String breed, Date bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }


    public FarmAnimal(int id, String breed, Date bornOn, ArrayList<Chicken> chickens) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + ", chickens=" + chickens + '}';
    }
    
    
    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBornOn() {
        return bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

   
    
}
