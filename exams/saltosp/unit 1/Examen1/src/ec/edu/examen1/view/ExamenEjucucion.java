package ec.edu.examen1.view;

import java.awt.print.Book;
import java.util.Scanner;

/**
 *
 * @author MiASUS
 */
public class ExamenEjucucion {
    public static void main(String[] args) {
        
        Book book = new Book();

        System.out.println(
                "\n--------------->Dada of boocks <--------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "- tittle  --> ");
        String tittle = scanner.next();

        System.out.println(
                "- name of autor --> ");
        String autor = scanner.next();

        System.out.println(
                "-- planeta ---> ");
        String planeta = scanner.next();

        System.out.println(
                "- prize --> ");
        float prize = scanner.nextFloat();

        System.out.println(
                "- yearOfinterest --> ");
        int yearOfinterest = scanner.nextInt();
 }   
}
