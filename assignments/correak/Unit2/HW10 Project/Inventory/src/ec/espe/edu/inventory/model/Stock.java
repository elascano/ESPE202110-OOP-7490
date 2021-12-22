/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.inventory.model;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Stock {
    private String code;
    private String name;
    private ArrayList<Product> products;
    Product product =new Product() ;

    
    
    public int checkthequantity()
    {
        return products.size();
    }
    
    public void remove(Product product){
    products.remove(code);
    }
    
    public void add(){ 
       
       products.add(product);
   }
    
    public void seeifthereisinstock(){
        products.toString();
                 
    }
    
    public void find(){
        products.contains(code);
    }

    public Stock(String code, String name, ArrayList<Product> products) {
        this.code = code;
        this.name = name;
        this.products = products;
    }
    
    
    

       
}
