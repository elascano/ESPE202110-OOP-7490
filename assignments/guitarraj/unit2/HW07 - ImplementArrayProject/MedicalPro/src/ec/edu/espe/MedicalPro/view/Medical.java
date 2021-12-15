package ec.edu.espe.MedicalPro.view;

import ec.edu.espe.MedicalPro.model.List;
import ec.edu.espe.MedicalPro.model.Login;
import ec.edu.espe.MedicalPro.model.Patient;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GUITARRA JHON
 */

public class Medical {
    public static void main(String[] args) {
    
        Patient patient = null;
        List list = null;
        ArrayList<Patient> patients = new ArrayList<>(); 

        list = new List("a","a",0,"a","a",patients);

        while(true){
             
            System.out.println("MEDICAL PRO");
            System.out.println("Menu");
            System.out.println("1 .-  Add Patients");
            System.out.println("2 .-  Remove Patients");
            System.out.println("3 .-  Show patients in the CLinic");
            System.out.println("4 .-  Show the amount of Patients");
            System.out.println("5 .-  Exit");

            Scanner read = new Scanner(System.in);
            int option = read.nextInt();
                
            if (option==1) {
                
                System.out.println("Data entry");
                System.out.println("Name of Patient --->   ");
                String name = read.next();
                System.out.println("Age of Patient --->   ");
                int age = read.nextInt();
                System.out.println("weight of Chicken --->   ");
                float weight = read.nextFloat();
                System.out.println("meight of Chicken --->   ");
                float meight = read.nextFloat();
                System.out.println("telephone of Chicken --->   ");
                int telephone = read.nextInt();
                
                patient =new Patient(name,age,weight,meight,telephone);
                list.add(patient);
                }
            
            else if(option==2){
                list.remove(patient);
            }
            else if(option==3){
                System.out.println("chicken in the coop -->" + list);
            }
            else if(option==4){
                System.out.println("Amount of Chicken  -->" + list.countPatients());
            }
            else if(option==5){
                break;
            }
        }
    }
}
