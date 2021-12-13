
package ec.edu.espe.exam.view;

import ec.edu.espe.exam.model.Book;
import java.util.Scanner;

/**
 *
 * @author malvarez 
 */
public class exam33 {
    public static void main(String[] args) {
        
       // Book book = new Book(3);
        
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
        
        Book book1= new Book(title, author, publisher, price, yearOfPublication);
        System.out.println("Book 1--> " + book1);
                
    }
    
  
}
