package ec.edu.espe.Exam.view;

import ec.edu.espe.Exam.model.Boock;
import java.awt.print.Book;
import java.util.Scanner;

/**
 *
 * @author Alexander Ruano
 */
public class ExamSystem {

    public static void main(String[] args) {
        
        Book boock = new Book();

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
                "- year --> ");
        int age = scanner.nextInt();

        System.out.println("the tittle");
        System.out.println("-->" + tittle);

        System.out.println("the autor");
        System.out.println("-->" + autor);

        System.out.println("the chicken");
        System.out.println("-->" + chicken);

        Boock boock2 = new HWChicken(id, name, color, age, isMolting);

        System.out.println("Book 2-->" + boock2);
    }
}
