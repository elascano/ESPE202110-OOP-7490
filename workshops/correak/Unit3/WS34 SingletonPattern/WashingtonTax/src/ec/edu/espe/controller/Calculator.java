/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.WashigtonTax;
import java.util.Scanner;

/**
 *
 * @author KERLY CORREA
 */
public class Calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        float taxw;
        float amount;
        

        
        WashigtonTax tax= WashigtonTax.getinstance();
        System.out.println("Enter amount: ");
        amount = sc.nextFloat();
        taxw=tax.salesTotal(amount);
        System.out.println("The price whit tax from Washington is:"+taxw);
    }
}
