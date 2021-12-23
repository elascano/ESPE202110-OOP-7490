/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.inventory.model;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public abstract class Stock {
    private String code;
    private String name;
    private boolean status ;
    private ArrayList<Product> products;
   

     public abstract void estado(String quantity);
    
    public void exist(){
        if(status==false){
            status=true;//asignacion
        }
    }
    
    public void notexist(){
        if (status==true){
            status = false;
        }
    }
    
    public int checkthequantity()
    {
        return products.size();
    }
    
    public void remove(Product product){
    products.remove(code);
    }
    
   
    
    public void seeifthereisinstock(){
        products.toString();
                 
    }
    
    public void find(){
        products.contains(code);
    }

    public Stock(String code, String name, boolean status) {
        this.code = code;
        this.name = name;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
    
    
    

       
}
