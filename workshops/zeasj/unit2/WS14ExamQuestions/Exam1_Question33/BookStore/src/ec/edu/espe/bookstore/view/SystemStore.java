package ec.edu.espe.bookstore.view;

import java.util.Scanner;

/**
 *
 * @author Joel Zeas 
 */
public class SystemStore {

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
