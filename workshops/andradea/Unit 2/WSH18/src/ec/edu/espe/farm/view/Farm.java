/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Farm {
    FarmAnimal farmAnimal;
    int id=0;
    String breed = "any";
    LocalDate born0n= LocalDate.of(2021, 12, 25);
    
    farmAnimal= new FarmAnimal(0, breed, born0n);
    
    
}
