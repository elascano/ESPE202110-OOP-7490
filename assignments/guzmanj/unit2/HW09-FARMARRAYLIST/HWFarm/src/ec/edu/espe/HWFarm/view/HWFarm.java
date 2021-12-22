/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.HWFarm.view;
import ec.edu.espe.HWFarm.model.Cow;
import ec.edu.espe.HWFarm.model.Chicken;
import ec.edu.espe.HWFarm.model.FarmAnimal;
import ec.edu.espe.HWFarm.model.Pig;
import ec.edu.espe.HWFarm.model.Sheep;
import java.time.LocalDate;

/**
 *
 * @author Jose Guzman
 */
public class HWFarm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id=0;
        String streed="any";
        LocalDate bornOn=LocalDate.of(2021,12,15);
        
        farmAnimal= new FarmAnimal(0,streed,bornOn);
        
        System.out.println("FarmAnimal is a->" + farmAnimal.getClass());
        System.out.println("FarmAnimal->");
        System.out.println("id ->" + farmAnimal.getId());
        System.out.println("breed ->" + farmAnimal.getStreed());
        System.out.println("bor On->" + farmAnimal.getBornon());
        
        id=1;
        streed="Playmount";
        bornOn=LocalDate.of(2020,06,20);
        boolean isMolting=true;
        
        farmAnimal=new Chicken(isMolting,id,streed,bornOn);
        
        System.out.println("FarmAnimal is a ->" + farmAnimal.getClass());
        
        
        Chicken chicken=new Chicken(isMolting,id,streed,bornOn);
        System.out.println("farm animal is a" + chicken.getClass());
        
        System.out.println("FarmAnimal->");
        System.out.println("id ->" + chicken.getId());
        System.out.println("breed ->" + chicken.getStreed());
        System.out.println("bor On->" + chicken.getBornon());
        System.out.println("Is Molting->" + chicken.isIsMolting());
        
        id=2;
        streed="Holstein";
        bornOn=LocalDate.of(2020,12,12);
        boolean isProducingMilk=true;
        
        farmAnimal=new Cow(isProducingMilk,id,streed,bornOn);
        
        System.out.println("FarmAnimal is a ->" + farmAnimal.getClass());
        
        Cow cow=new Cow(isProducingMilk,id,streed,bornOn);
        System.out.println("farm animal is a" + cow.getClass());
        
        System.out.println("FarmAnimal->");
        System.out.println("id ->" + cow.getId());
        System.out.println("breed ->" + cow.getStreed());
        System.out.println("bor On->" + cow.getBornon());
        System.out.println("Is Molting->" + cow.isIsProducingMilk());
        
        id=3;
        streed="Large White";
        bornOn=LocalDate.of(2021,9,25);
        float weight=50;

        farmAnimal=new Pig(weight,id,streed,bornOn);
        
        System.out.println("FarmAnimal is a ->" + farmAnimal.getClass());
        Pig pig=new Pig(weight,id,streed,bornOn);
        System.out.println("farm animal is a" + pig.getClass());
        
        System.out.println("FarmAnimal->");
        System.out.println("id ->" + pig.getId());
        System.out.println("breed ->" + pig.getStreed());
        System.out.println("bor On->" + pig.getBornon());
        System.out.println("Is Molting->" + pig.getWeight());

        id=4;
        streed="Dorper";
        bornOn=LocalDate.of(2019,01,30);
        LocalDate lastSheering=LocalDate.of(2021,10,10);
        
        farmAnimal=new Sheep(lastSheering,id,streed,bornOn);
        
        System.out.println("FarmAnimal is a ->" + farmAnimal.getClass());
        Sheep sheep=new Sheep(lastSheering,id,streed,bornOn);
        System.out.println("farm animal is a" + sheep.getClass());
        
        System.out.println("FarmAnimal->");
        System.out.println("id ->" + sheep.getId());
        System.out.println("breed ->" + sheep.getStreed());
        System.out.println("bor On->" + sheep.getBornon());
        System.out.println("Is Molting->" + sheep.getLastSheering());
        
    }
}
