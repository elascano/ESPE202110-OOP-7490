
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collections;

//HOMEWORK HW05

//borrar las gallinas por ID
//pedir al usuario que ingrese las gallinas, anadir al gallinero
//main infinite loop with an if that allows me to introduce several chicken at a time
//-ad chicken
//-remove chickens
//-show chickens in the coop
//-show the amount of chickens
///-exit

//HOMEWORK 07

/*
implementar arraylist en su proyecto
    1)Employee [] employees;
    2)ArrayList<employes> employees;
*/
/*
HOMEWORK 06
CLASS Diagram incluir dependencias, asociaciones y compisiciones 
*/
/**
 *
 * @author Caisatoa
 */
public class FarmSystem {
    public static void main(String[] args) {
    Chicken chicken;
    ChickenCoop chickenCoop;
    ArrayList<Chicken> chickens = new ArrayList<>();
    
    chicken = new Chicken(0, "Lucy", "White and brown",0,true);
    chickenCoop = new ChickenCoop( 0,chickens );
    
        System.out.println("chicken --> " + chicken);
        System.out.println("chicken coop --> " + chickenCoop.countChickens());
        System.out.println("chicken coop -> " + chickenCoop);
        
        chickenCoop.add(new Chicken(1, "Daysi","white",0,false));
        System.out.println("Chicken in the Chicken coop --> " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " +chickenCoop );
        
        chicken = new Chicken(2, "Renata","black",0,false);
        chickenCoop.add(chicken);
        System.out.println("Chicken in the Chicken coop --> " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " +chickenCoop );
    }  
}
