package ec.edu.espe.q33.view;

import ec.edu.espe.q33.model.Book;
import java.util.Scanner;

/**
 *
 * @author elascano
 */
public class Q33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String title="";
        String author="";
        String publisher="";
        float price=0.0F;
        int yearOfPublication=0;
        String areaOfInterest="";
        float totalCost=0.0F;
        
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[5];

        Book book1;
        Book book2;
        Book book3;
        Book book4;
        Book book5;
        
        System.out.println("Enter book number 1 -->");
        System.out.println("Enter title -> ");
        title = scanner.nextLine();
        System.out.println("Enter author -> ");
        title = scanner.nextLine();
        System.out.println("Enter publisher -> ");
        title = scanner.nextLine();
        System.out.println("Enter price -> ");
        price = scanner.nextFloat();
        System.out.println("Enter year of publication -> ");
        yearOfPublication = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter area of interest -> ");
        areaOfInterest = scanner.nextLine();
        book1 = new Book(title, author, publisher, price, yearOfPublication, areaOfInterest);
        
        System.out.println("Book 2 --> \n" + book1);

        System.out.println("Enter book number 1 -->");
        System.out.println("Enter title -> ");
        title = scanner.nextLine();
        System.out.println("Enter author -> ");
        title = scanner.nextLine();
        System.out.println("Enter publisher -> ");
        title = scanner.nextLine();
        System.out.println("Enter price -> ");
        price = scanner.nextFloat();
        System.out.println("Enter year of publication -> ");
        yearOfPublication = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter area of interest -> ");
        areaOfInterest = scanner.nextLine();
        book2 = new Book(title, author, publisher, price, yearOfPublication, areaOfInterest);
        
        System.out.println("Book 2 --> \n" + book2);
        
        System.out.println("TOTAL COST OF BOOKS");

        totalCost = (book1.getPrice() + book2.getPrice())*1.12F;
        System.out.println(totalCost);
        
    }

}
