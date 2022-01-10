package ec.edu.espe.inventory.model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 

/**
 *
 * @author WorBotsTeam
 */
public class Stock {
   
    
    Scanner read = new Scanner(System.in);
    
    private int id;
    private ArrayList<Product> products = new ArrayList<Product>();


    public void AddElement(String name,int code, int price, int stock) {
         
        products.add(new Product(name, code, price, stock));
        
    }


    public void Print(){
        
        for(int i=0; i < products.size(); i++){
            products.get(i).print();
        }
    
    }

    public void Remove(int id){
        
        products.removeIf(chicken -> chicken.getCode() == id);
        
    }
    
    public void QuantityTotal(){
        int quantity = products.size();
        System.out.println("The quantity Products is--> " + quantity);
    }
    /**
     * @return the id
    */ 
    public int getId() {
        return id;
    }

    /**
     * @param id to set
    */ 
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the chickens
    */ 
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param the chickens to set
    */ 
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        products.add(product);
    }
    
    public int countElement(){
        return products.size();
    }
    
}