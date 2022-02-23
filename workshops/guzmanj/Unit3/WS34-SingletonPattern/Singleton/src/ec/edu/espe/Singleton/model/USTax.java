/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Singleton.model;

/**
 *
 * @author Jose Guzman
 */
public class USTax {
    private static USTax instance;
    float taxRate;
    
    private USTax(){
        taxRate=12.0F;
    }
    
    public static USTax getInstance(){
        if(instance==null)
            instance=new USTax();
        return instance;
    }
    public float salesTotal(float sale){
        float Total;
        Total=sale+sale*taxRate/100;
        System.out.println(Total);
        return Total;
    }
    public float getTaxRate(){
        return taxRate;
    }
    public void changeTaxRate(float otherTaxRate){
        taxRate=otherTaxRate;
    }
}
