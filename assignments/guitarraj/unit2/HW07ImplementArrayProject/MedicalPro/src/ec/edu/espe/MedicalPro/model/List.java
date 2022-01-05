/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class List {
    
    private String name;
    private String diseases;
    private int number;
    private String signature;
    private String conditions;
    
    private ArrayList<Patient> patients;
    public void add(Patient patient){
        patients.add(patient); 
    }
   
    public void remove(Patient patient){
        Scanner read = new Scanner(System.in); 
        System.out.println("Enter the chicken id for delete--->");
        String dni = read.next(); 
        for(int i = 0; i <patients.size(); i++ ){
            if (patients.get(i).getName().equals(dni)){
                patients.remove(i);
            }
        }
    }
    public int countPatients(){
        return patients.size();
    }
      
    @Override
    public String toString() {
        return "List{" + "name=" + name + ", diseases=" + diseases + ", number=" + number + ", signature=" + signature + ", conditions=" + conditions + patients + '}';
    }

    public List(String name, String diseases, int number, String signature, String conditions,ArrayList<Patient> patients) {
        this.name = name;
        this.diseases = diseases;
        this.number = number;
        this.signature = signature;
        this.conditions = conditions;
        this.patients = patients;
    }
    
    public String getName() {
        return name;
    }

    public String getDiseases() {
        return diseases;
    }

    public int getNumber() {
        return number;
    }

    public String getSignature() {
        return signature;
    }

    public String getConditions() {
        return conditions;
    }
   
}
