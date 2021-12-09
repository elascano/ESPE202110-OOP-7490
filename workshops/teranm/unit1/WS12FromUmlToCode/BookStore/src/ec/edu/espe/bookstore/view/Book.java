package ec.edu.espe.bookstore.view;

import java.util.Scanner;

/**
 *
 * @author Melanie
 */
public class Book {

    public static void main(String[] args) {
        String title = null;
        String author;
        String publisher;
        int price;
        int totalPrice = 0;
        int publicationYear;
        int i;
        int iva;

        System.out.println("EXAM --> Melanie Terán <--");

        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("-title  -->  ");
            title = scanner.next();

            System.out.println("- author --> ");
            author = scanner.next();

            System.out.println("- publisher --> ");
            publisher = scanner.next();

            System.out.println("- price  -->  ");
            price = scanner.nextInt();

            System.out.println("- publicationYear  -->  ");
            publicationYear = scanner.nextInt();

            totalPrice = totalPrice + price;

        }
        System.out.println("\nBooks    " + title);
        
        System.out.println("price Sum\n$" + totalPrice);

        iva = totalPrice / 10;
        System.out.println("iva\n$" + iva);

        System.out.println("*** total price ***");
        System.out.println("$" + (iva + totalPrice));
    }

}
