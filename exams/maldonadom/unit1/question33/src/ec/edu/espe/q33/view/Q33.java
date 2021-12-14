/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.q33.view;

import ec.edu.espe.q33.model.Book;
import java.util.Scanner;

/**
 *
 * @author andresmaldonado
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
        //Book[] books = new Book[5];
        
        Book book1;
        Book book2;
        Book book3;
        Book book4;
        Book book5;
        
        /*System.out.println("Enter book number 1 ---");
        System.out.println("Enter title");
        title = scanner.nextLine();
        System.out.println("Enter author");
        author = scanner.nextLine();
        System.out.println("Enter publisher");
        publisher = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextFloat();
        System.out.println("Enter year of publication");
        yearOfPublication = scanner.nextInt();
        System.out.println("Enter area od Interest");
        areaOfInterest = scanner.nextLine();*/
        
        book1 = new Book(title, author, publisher, price, yearOfPublication, areaOfInterest);
        
        System.out.println("Book 1 --- "+ book1);
        
        System.out.println("Enter book number 2 ---");
        System.out.println("Enter title");
        title = scanner.nextLine();
        System.out.println("Enter author");
        author = scanner.nextLine();
        System.out.println("Enter publisher");
        publisher = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextFloat();
        System.out.println("Enter year of publication");
        yearOfPublication = scanner.nextInt();
        System.out.println("Enter area od Interest");
        areaOfInterest = scanner.nextLine();
        
        book2 = new Book(title, author, publisher, price, yearOfPublication, areaOfInterest);
        
        System.out.println("Book 2 --- "+ book2);
        
        System.out.println("Total Cost of Books");
        
        totalCost = (float) ((book1.getPrice() + book2.getPrice()) *1.12);
        System.out.println(totalCost);
    }
    
}
