/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author KERLY CORREA
 */
public class WashigtonTax {
    private static WashigtonTax instance;
    float taxRate;
    private WashigtonTax(){
        taxRate=12.3F;
    }
    
    public static WashigtonTax getinstance(){
        if (instance==null) 
            instance = new WashigtonTax();
        return instance;
    }
    
    public float salesTotal(float base){
        float total;
        total = base + base* taxRate/100;
        return total;   
    }
    
    public float getTaxRate(){
        return taxRate;
    }
    
    public void changeTaxRate(float otherTaxRate){
        taxRate=otherTaxRate;

        
    }
}
