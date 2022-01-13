package ec.edu.espe.MedicalPro.view;

import ec.edu.espe.MedicalPro.model.Login;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Daniel Lincango
 */

public class Medical {
    public static void main(String[] args) {
        
        System.out.println("List of Patients of the Clinic");
        ArrayList<String> patients= new ArrayList<>();
        String fileName = "data/patients.csv";
        patients = FileManager.read(fileName);
        System.out.println("  --> PATIENTS \n"+ patients);  
        String nameUser = "";
        String passwordUser = "";
        
        Login login = new Login(nameUser,passwordUser);
        Scanner read = new Scanner(System.in);
        
        while(true){
            int option;
            System.out.println("MENU PATIENT");
            System.out.println("1.-Insert Patient");
            System.out.println("2.- Exit");
            option =read.nextInt();
            if (option == 1) {
                System.out.println ("Please enter data for User");
                System.out.println ("Please enter User name ------>");
                nameUser = read.next();
                System.out.println ("Please enter pasword ------>");
                passwordUser = read.next();
                login = new Login(nameUser,passwordUser);
                String loginData = "name of User: "+nameUser + "Password:"+passwordUser ; 
                FileManager.save(fileName,loginData); 
            }else if (option == 2) {
                break;
            }
        }  
    }
}
