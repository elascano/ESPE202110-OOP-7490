package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mayerly
 */
public class FarmAnimal {

    private int id;
    private String breed;
    private LocalDate bornOn;

    private ArrayList<Chicken> chickens;

    public void add(Chicken chicken) {
        chickens.add(chicken);
    }

    public void remove(Chicken chicken) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of chicken to delete it: ");
        int dni = read.nextInt();
        for (int i = 0; i < chickens.size(); i++) {
            if (chickens.get(i).getId() == dni) {
            } else {
                chickens.remove(i);
            }
        }
    }

    public int countChikens() {
        return chickens.size();
    }

    public FarmAnimal(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public int getAgeInMonths() {
        return 0;
    }

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
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
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public LocalDate getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }

}
