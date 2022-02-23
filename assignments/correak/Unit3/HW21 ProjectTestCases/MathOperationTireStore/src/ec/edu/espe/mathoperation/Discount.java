/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mathoperation;


/**
 *
 * @author KERLY CORREA
 */
public class Discount {
   public float discount(float multiply,float multiplier,float priceDiscount){
        float discount ;
        float product;
       
        
        product = multiply * multiplier;
        
        float  product1,product2,productWithDiscount;
        
        float productspecial;
        
        String addproduct;
        
                
        product1 = priceDiscount * product;
        product2 =  product1 / 100;
        productWithDiscount = product - product2;
        
        productspecial = (float)Math.round(productWithDiscount*1000f)/1000;
    
        
                
        return productspecial;
        
    }
}
