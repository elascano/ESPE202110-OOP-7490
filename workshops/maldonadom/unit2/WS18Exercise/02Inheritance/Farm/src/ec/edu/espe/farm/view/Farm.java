package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author MateoMaldonado
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id=0;
        String streed="any";
        LocalDate bornOn=LocalDate.of(2021,12,15);
        
        farmAnimal= new FarmAnimal(0,streed,bornOn);
        
        System.out.println("WS18 from Mateo Maldonado");
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
    }
}
