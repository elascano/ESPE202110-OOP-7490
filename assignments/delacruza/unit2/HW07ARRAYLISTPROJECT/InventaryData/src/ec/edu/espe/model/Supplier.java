package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author the1/2programmer's Mayerly Garcia 
 */
public class Supplier {
    
    private int id;
    private String nameSupplier;
    private boolean productAvailability;
    
        
    private ArrayList<CleaningSupply>cleaningsupplies;
    public void add(CleaningSupply cleaningSupply){
        cleaningsupplies.add(cleaningSupply);
    }   

    
    public void remove(CleaningSupply cleaningSupply){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the id of cleaningsupply to delete it: ");
        int dni=read.nextInt();
        for(int i=0; i<cleaningsupplies.size(); i++){
            if(cleaningsupplies.get(i).getId()== dni){
            } else {
                cleaningsupplies.remove(i);
            }
        }
    }
    
    public int countCleaningSupply(){
            return cleaningsupplies.size();
        }

    public Supplier(int id, ArrayList<CleaningSupply> cleaningsupplies) {
        this.id = id;
        this.cleaningsupplies = cleaningsupplies;
    }
    

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", nameSupplier=" + nameSupplier + ", productAvailability=" + productAvailability + '}';
    }
    
    
   
     public void seeAvailability (boolean forTime){
            
    }
    
    private void sell(){
        
    }
    
    private void collect(){
       
    }
    
    private void productQuality(boolean fortime){
        
    }
    
    public Supplier() {
    id = 1718921578;
    nameSupplier = "cookies";
    productAvailability = true;
    }
    
    public Supplier(int id, String nameSupplier, boolean productAvailability) {
    this.id = id;
    this.nameSupplier = nameSupplier;
    this.productAvailability = productAvailability;
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
     * @return the nameSupplier
     */
    public String getNameSupplier() {
        return nameSupplier;
    }

    /**
     * @param nameSupplier the nameSupplier to set
     */
    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    /**
     * @return the productAvailability
     */
    public boolean isProductAvailability() {
        return productAvailability;
    }

    /**
     * @param productAvailability the productAvailability to set
     */
    public void setProductAvailability(boolean productAvailability) {
        this.productAvailability = productAvailability;
    }

    public void add(GrainsPasta grainspasta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(Snack snack) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
