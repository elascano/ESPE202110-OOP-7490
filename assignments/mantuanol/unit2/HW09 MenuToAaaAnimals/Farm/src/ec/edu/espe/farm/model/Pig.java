package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author Leonel Mantuano
 */
public class Pig {
    private float weight;
    private int idPig;
    private String breedPig;
    private LocalDate bornOnPig;

    ArrayList<Pig> pigs = new ArrayList();  
    
    public Pig(int idPig, String breedPig, LocalDate bornOnPig, float weight)
    {
        this.weight = weight;
        this.idPig = idPig;
        this.breedPig = breedPig;
        this.bornOnPig = bornOnPig;
    }

    public String [] toCsvPig()
    {
        String [] csv = {String.valueOf(idPig) + ";" + breedPig + ";" + String.valueOf(bornOnPig)+ ";" + String.valueOf(weight)};
        return csv;
    }    
    
    public void AddPig(float weight, int idPig, String breedPig, LocalDate bornOnPig) {
         
        pigs.add(new Pig(idPig, breedPig, bornOnPig, weight));
    }  
    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the idPig
     */
    public int getIdPig() {
        return idPig;
    }

    /**
     * @param idPig the idPig to set
     */
    public void setIdPig(int idPig) {
        this.idPig = idPig;
    }

    /**
     * @return the breedPig
     */
    public String getBreedPig() {
        return breedPig;
    }

    /**
     * @param breedPig the breedPig to set
     */
    public void setBreedPig(String breedPig) {
        this.breedPig = breedPig;
    }

    /**
     * @return the bornOnPig
     */
    public LocalDate getBornOnPig() {
        return bornOnPig;
    }

    /**
     * @param bornOnPig the bornOnPig to set
     */
    public void setBornOnPig(LocalDate bornOnPig) {
        this.bornOnPig = bornOnPig;
    }
    
}
