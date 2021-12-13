package ec.edu.espe.bookstore.view;

import ec.edu.espe.bookstore.model.Author;
import ec.edu.espe.bookstore.model.Price;
import ec.edu.espe.bookstore.model.Publisher;
import ec.edu.espe.bookstore.model.Title;
import ec.edu.espe.bookstore.model.Year;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class bookstore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Examen 1 --> Camila Teca <-- ");
        Author author = new Author();
        Price price = new Price();
        Publisher publisher = new Publisher();
        Title title = new Title();
        Year year = new Year();

        
        
        System.out.println("Please enter data for book: ");
        System.out.println("- author -->  ");
        author = scanner.next();

        System.out.println("- price -->  ");
        price = scanner.nextFloat();

        System.out.println("- publisher -->  ");
        publisher = scanner.next();

        System.out.println("- title -->  ");
        title = scanner.next();

        System.out.println("- year -->  ");
        year = scanner.next();

    }

}
