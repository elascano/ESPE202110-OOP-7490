package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Mayerly Garcia
 */
public class StateofCaliforniaTax { //Tax in California is 7.5 

//    Scanner sc = new Scanner(System.in);
//    double priceUnit, quantity, USTax, priceWithoutTax, totalTax;
    float taxRate;
    private static StateofCaliforniaTax instance;

    private StateofCaliforniaTax() {
        taxRate = 7.5F;
    }

    public static StateofCaliforniaTax getInstance() {
        if (instance == null) {
            instance = new StateofCaliforniaTax();
        }
        return instance;
    }

    public float salesTotal(float base) {

        float total;
        total = base + base * taxRate / 100;
        return total;
//        Scanner sc = new Scanner(System.in);
//        double priceUnit, quantity, USTax, priceWithoutTax, totalTax;
//        System.out.print("Enter price per unit of the product: ");
//        priceUnit = sc.nextDouble();
//
//        System.out.print("Enter number of products sold: ");
//        quantity = sc.nextDouble();
//
//        System.out.print("Enter TAX: ");
//        USTax = sc.nextDouble();
//
//        priceWithoutTax = priceUnit * quantity;
//        totalTax = priceWithoutTax * USTax / 100;
//
//        System.out.println("The Taxin  State o fCalifornia is -> " + (priceWithoutTax + totalTax));
//        return 0;

    }

    public float getTaxRate() {
        return taxRate;
    }

    public void salesTotal() {
        
    }
}
