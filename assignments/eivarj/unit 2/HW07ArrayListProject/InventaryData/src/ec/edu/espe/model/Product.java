package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author the1/2programmer's
 */
public class Product {
    private int id;
    
    
    private ArrayList<Snack>snacks;

    public void add(Snack snack){
    snacks.add(snack);
    }
    
    public void remove(Snack snack){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the id of snack to delete it: ");
        int dni=read.nextInt();
        for(int i=0; i<snacks.size(); i++){
            if(snacks.get(i).getId()== dni){
            } else {
                snacks.remove(i);
            }
        }
    }
    
    public int countSnack(){
            return snacks.size();
        }
    public Product(ArrayList<Snack> snacks) {
        this.snacks = snacks;
    }
    public ArrayList<Snack> getSnacks() {
        return snacks;
    }
public void setSnacks(ArrayList<Snack> snacks) {
        this.snacks = snacks;
}


    private ArrayList<DairyProduct>dairyProducts;
    public void add(DairyProduct dairyProduct){
    dairyProducts.add(dairyProduct);
    }
    
    public void remove(DairyProduct dairyProduct){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the id of dairy Product to delete it: ");
        int dni=read.nextInt();
        for(int i=0; i<dairyProducts.size(); i++){
            if(dairyProducts.get(i).getId()== dni){
            } else {
                dairyProducts.remove(i);
            }
        }
    }
    
    public int countDairyProduct(){
            return dairyProducts.size();
        }

    public ArrayList<DairyProduct> getDairyProducts() {
        return dairyProducts;
    }

    public void setDairyProducts(ArrayList<DairyProduct> dairyProducts) {
        this.dairyProducts = dairyProducts;
    }
    
    
    
    private ArrayList<GrainsPasta>grainspastas;
    public void add(GrainsPasta grainspasta){
    grainspastas.add(grainspasta);
    }
    
    public void remove(GrainsPasta grainspasta){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the id of grainspastas to delete it: ");
        int dni=read.nextInt();
        for(int i=0; i<grainspastas.size(); i++){
            if(grainspastas.get(i).getId()== dni){
            } else {
                grainspastas.remove(i);
            }
        }
    }
    
    public int countGrainsPasta(){
            return grainspastas.size();
        }

    {
        this.id = id;
        this.grainspastas = (ArrayList<GrainsPasta>) grainspastas;
    }
     
    private ArrayList<MeatSeafood>meatsSeafoods;
    private ArrayList<Canned>canneds;
    private ArrayList<Drink> drinks;
    
    public void add(Drink drink){
        drinks.add(drink);
    }

    public Product(int id, ArrayList<MeatSeafood> meatsSeafoods, ArrayList<Canned> canneds, ArrayList<Drink> drinks) {
        this.id = id;
        this.meatsSeafoods = meatsSeafoods;
        this.canneds = canneds;
        this.drinks = drinks;
    }
    
    
    public void add(Canned canned){     
        getCanneds().add(canned);
    }

    public Product(int id, ArrayList<MeatSeafood> meatsSeafoods, ArrayList<Canned> canneds) {
        this.id = id;
        this.meatsSeafoods = meatsSeafoods;
        this.canneds = canneds;
    }
    
    public void add(MeatSeafood meatSeafood){
        getMeatsSeafoods().add(meatSeafood);
    }   
    
    public void remove(MeatSeafood meatSeafood){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter de id of MeatSeafood to delete it: ");
        int dni=read.nextInt();
        for(int i=0; i<getMeatsSeafoods().size(); i++){
            if(getMeatsSeafoods().get(i).getId()== dni){
            } else {
                getMeatsSeafoods().remove(i);
            }
        }
    }
    
    public int countMeatSeafood(){
            return getMeatsSeafoods().size();
        }

    public Product(int id, ArrayList<MeatSeafood> meatsSeafoods) {
        this.id = id;
        this.meatsSeafoods = meatsSeafoods;
    }
  
        
    @Override
    public String toString() {
        return "Product{" + "id=" + getId() + ", meatsSeafoods=" + getMeatsSeafoods() + '}';
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
     * @return the meatsSeafoods
     */
    public ArrayList<MeatSeafood> getMeatsSeafoods() {
        return meatsSeafoods;
    }

    /**
     * @param meatsSeafoods the meatsSeafoods to set
     */
    public void setMeatsSeafoods(ArrayList<MeatSeafood> meatsSeafoods) {
        this.meatsSeafoods = meatsSeafoods;
    }   

    /**
     * @return the canneds
     */
    public ArrayList<Canned> getCanneds() {
        return canneds;
    }

    /**
     * @param canneds the canneds to set
     */
    public void setCanneds(ArrayList<Canned> canneds) {
        this.canneds = canneds;
    }

    /**
     * @return the drinks
     */
    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    /**
     * @param drinks the drinks to set
     */
    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public void add(ArrayList<Drink> driks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}