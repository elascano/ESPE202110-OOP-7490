
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author PABLO BUSTILLOS
 */
public class Farm {
    public static void main(String[] args) {
        ArrayList<Chicken> chickens= new ArrayList<>();        
        FarmAnimal farmAnimal;
        int id=0;
        String breed="any";
        LocalDate bornOn=LocalDate.of(2021,12, 15);
        
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
        int flag=0;
        Scanner read =new Scanner(System.in);
        do{
            System.out.println("\t\tFARM MENU\n.1-Add Chicken\n2.-Show Chicken\n3.-Exit\n\tInsert an option: ");
            int option = read.nextInt();
             switch(option){
                 
            case 1:
                System.out.println("Insert the ID: ");
                int idAux =read.nextInt();
                System.out.println("Insert the breed: ");
                String breedAux=read.next();
                System.out.println("Insert date of born: ");
                Chicken chicken= new Chicken(true,idAux,breed,bornOn);
                chickens.add(chicken);
                break;
                
            case 2:
                System.out.println(" " + chickens.get(0));
                break;
                
            default:System.out.println("Finish");
            flag=1;
            break;
        }
        }while(flag==0);
        
     
        
    }
    
}
