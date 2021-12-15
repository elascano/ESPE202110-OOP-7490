package ec.edu.espe.systemlibrary.view;

import ec.edu.espe.systemlibrary.model.Book;
import java.util.Scanner;

/**
 *
 * @author Cristhian Altamirano
 */
public class Systemlibrary {
    public static void main(String[] args) {
        
        Book book;
        String title;
        String author;
        String publisher;
        float price;
        int yearOfPublication;
        String areaOfInterest;
        
                
        System.out.println("Enter data for the book ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter data for the title: ");
        title = scanner.next();
        System.out.println("The book title is : " + title);
        
        System.out.println("Enter data for book author: ");
        author = scanner.next();
        System.out.println("The book author is: " + author);
        
        System.out.println("Enter data for book publisher: ");
        publisher = scanner.next();
        System.out.println("The book publisher is: " + publisher );
        
        System.out.println("Enter data for book price: ");
        price = scanner.nextInt();
        System.out.println("The book price is: " + price);
        
        System.out.println("Enter data for year of publication:");
        yearOfPublication = scanner.nextInt();
        System.out.println("The book price is: " + yearOfPublication);
        
        Book book2= new Book(title, author, publisher, price, yearOfPublication);
        System.out.println("book2--> " + book2);
          
    }
    
    
}