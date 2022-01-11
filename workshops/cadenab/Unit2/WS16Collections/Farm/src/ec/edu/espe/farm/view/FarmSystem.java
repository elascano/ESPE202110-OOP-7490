/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class FarmSystem {
    
    public static void main (String[] args){
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        chicken = new Chicken(0,"Lucy", "White and brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("chicken -->" + chicken);
        System.out.println("Chickens in the Chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("Chickens in the Chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);
        
        chickenCoop.add(new Chicken(1,"Daysi", "White", 0, false));
        System.out.println("Chickens in the Chicken coop" + chickenCoop);
        System.out.println("chicken coop" + chickenCoop);
        
        chicken = new Chicken(2, "Renata", "Black", 0, false);
        chickenCoop.add(chicken);
        System.out.println("Chickens in the Chicken coop -->" + chickenCoop.countChickens());
        System.out.println("Chicken coop" + chickenCoop);
        
        chicken = new Chicken(0,"Lucy", "White and brown", 0, true);
        chickenCoop.remove(chicken);
        System.out.println("Chickens in the Chicken coop -->" + chickenCoop.countChickens());
        
                          //CODE COLLECTION
     //   int a;  //primitive data types
     //   Integer i = 58; //deprecated - referenced data types
     //  float b;
      //  Float f = 3.9F;
      //  double c;
       /// Double d = 12.4D;
        //String s = "Benjamin";
        
       // System.out.println("the int of the float --->" + f.intValue());
       // b = 7.9F;
        
       // System.out.println("float b -->" +b);
       // System.out.println("float b -->" + (int)b); //casting
        
       // a=10;
        //System.out.println("int a -->" +a);
        //System.out.println("int a -->" + (float)a);
       // System.out.println("int a -->" + a);
        
       // System.out.println("Integer i --> " +(s + i.toString()));
        
        //System.out.println("int a + Integer i -->" + (a + i.toString()));
        //System.out.println("int a + Integer i -->" + (a + i.intValue()));
        
        
       // **Collection numbers;
        //**Collection numbers = new Collection();it is
       // **ArrayList<int> numbers = new Arraylist<>();
    }
    
    //int, float, boolean, double, char, byte...
}