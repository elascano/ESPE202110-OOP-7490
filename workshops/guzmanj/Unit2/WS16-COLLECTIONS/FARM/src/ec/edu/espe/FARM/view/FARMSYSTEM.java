/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.FARM.view;
import java.util.Collection;
import java.util.ArrayList;
import ec.edu.espe.FARM.model.Chicken;
import ec.edu.espe.FARM.model.ChickenCoop;
/**
 *
 * @author Jose Guzman
 */
public class FARMSYSTEM {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens=new ArrayList<>();
        
        chicken= new Chicken(0,"Lucy","White and Brown",0,true);
        chickenCoop=new ChickenCoop(0,chickens);
        
        System.out.println("chicken -> " + chicken);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->" + chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("chicken coop ->" + chickenCoop);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        
        chickenCoop.add(new Chicken(1,"Daysi","white",0,false));
        System.out.println("chicken coop ->" + chickenCoop);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());

        chickenCoop.add(new Chicken(2,"Renata","black",0,true));
        System.out.println("chicken coop ->" + chickenCoop);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        
        chickenCoop.remove(chicken);
        System.out.println("chicken coop ->" + chickenCoop);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());         
    }   
}


    /*public static void main(String[] args) {
        int a;
        Integer i= 58;
        float b;
        Float f = 3.4F;
        Double d= 12.4D;
        String s= "Jose";
        
        System.out.println("the int of the float is -> " + f.intValue());
        b= 7.9F;
        
        System.out.println("float b ->" + b);
        System.out.println("float b ->" + (int)b);
        
        a=10;
        System.out.println("int a ->" + a);
        System.out.println("int a ->" + (float)a);
        System.out.println("int a ->" + a);
        
        System.out.println("Integer i ->" + (s+ i.toString()));
        
        System.out.println("Integer i ->" + (a+ i.toString()));
        System.out.println("Integer i ->" + (a+ i.intValue()));
        
        //Collection numbers;
        //Arraylist<int> numbers =new Arraylist<>();
    } */