package ec.edu.espe.view;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Exam1_Question33 {
    public static void main(String[] args) {
      System.out.println(
                "\n--------------->  <--------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "- Tittle --> ");
        String tittle = scanner.next();

        System.out.println(
                "- Autor --> ");
        String autor = scanner.next();

        System.out.println(
                "-- Editorial ---> ");
        String editorial = scanner.next();

        System.out.println(
                "- Price--> ");
        float price = scanner.nextFloat();

        System.out.println(
                "- Year --> ");
        int year = scanner.nextInt();

    }
    
      
  }
