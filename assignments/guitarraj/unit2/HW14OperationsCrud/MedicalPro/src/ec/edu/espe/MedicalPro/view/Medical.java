package ec.edu.espe.MedicalPro.view;

import com.google.gson.Gson;
import ec.edu.espe.MedicalPro.model.Login;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author GUITARRA JHON
 */

public class Medical {
    public static void main(String[] args) {
        
        System.out.println("List of Patients of the Clinic");
        ArrayList<String> patients= new ArrayList<>();
        String fileName = "data/patients.json";
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
                Gson gson = new Gson();
                String jsonPatient = gson.toJson(login);
                FileManager.save(fileName,jsonPatient); 
            }else if (option == 2) {
                break;
            }
        }     
    }
}
