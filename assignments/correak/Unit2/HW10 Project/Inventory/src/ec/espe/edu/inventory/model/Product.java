/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.inventory.model;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Product {
    private String code;
    private String name;
    private String price;
    private String stockQuantity;
    Scanner sc = new Scanner(System.in);

    public Product() {
    }

    @Override
    public String toString() {
        //return "Product{" + "code=" + code + ", name=" + name + ", price=" + price + ", stockQuantity=" + stockQuantity + '}';
        return (code+";"+name+";"+price+";"+stockQuantity);
    }

    

    public Product(String code, String name, String price, String stockQuantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    
    
    public boolean sell(){
    return false;
    }
    public void buy (){
      
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    

    
    
    
}
