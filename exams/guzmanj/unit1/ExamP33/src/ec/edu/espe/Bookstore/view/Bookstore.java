/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Bookstore.view;

import ec.edu.espe.Bookstore.model.Book;
import java.util.Scanner;
/**
 *
 * @author Jose Guzman
 */
public class Bookstore {
    public static void main(String[] args) {
        System.out.println("Exam1P33 Jose Guzman");
        Book book=new Book();
        String title;
        String author;
        String publisher;
        float price;
        int yearOfPublication;
        float item1;
        float item2;
        float item3;
        float item4;
        float item5;
        float totalAmount;
        float taxes;
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("-title -->");
            title=scanner.next();
        System.out.println("-author -->");
            author=scanner.next();
        System.out.println("-publisher -->");
            publisher=scanner.next();
        System.out.println("-price -->");
            price=scanner.nextFloat();
        System.out.println("-yearOfPublication -->");
            yearOfPublication=scanner.nextInt();
        book=new Book(title,author,publisher,price,yearOfPublication);
        System.out.println("Book-->" + book);
        item1=price;
        
        Book book1=new Book();
        
        System.out.println("-title -->");
            title=scanner.next();
        System.out.println("-author -->");
            author=scanner.next();
        System.out.println("-publisher -->");
            publisher=scanner.next();
        System.out.println("-price -->");
            price=scanner.nextFloat();
        System.out.println("-yearOfPublication -->");
            yearOfPublication=scanner.nextInt();
        book1=new Book(title,author,publisher,price,yearOfPublication);
        System.out.println("Book1-->" + book1);
        item2=price;
        
        Book book2=new Book();
        
        System.out.println("-title -->");
            title=scanner.next();
        System.out.println("-author -->");
            author=scanner.next();
        System.out.println("-publisher -->");
            publisher=scanner.next();
        System.out.println("-price -->");
            price=scanner.nextFloat();
        System.out.println("-yearOfPublication -->");
            yearOfPublication=scanner.nextInt();
        book2=new Book(title,author,publisher,price,yearOfPublication);
        System.out.println("Book2-->" + book2);
        item3=price;
        
        Book book3=new Book();
        
        System.out.println("-title -->");
            title=scanner.next();
        System.out.println("-author -->");
            author=scanner.next();
        System.out.println("-publisher -->");
            publisher=scanner.next();
        System.out.println("-price -->");
            price=scanner.nextFloat();
        System.out.println("-yearOfPublication -->");
            yearOfPublication=scanner.nextInt();
        book3=new Book(title,author,publisher,price,yearOfPublication);
        System.out.println("Book3-->" + book3);
        item4=price;
        
        Book book4=new Book();
        
        System.out.println("-title -->");
            title=scanner.next();
        System.out.println("-author -->");
            author=scanner.next();
        System.out.println("-publisher -->");
            publisher=scanner.next();
        System.out.println("-price -->");
            price=scanner.nextFloat();
        System.out.println("-yearOfPublication -->");
            yearOfPublication=scanner.nextInt();
        book4=new Book(title,author,publisher,price,yearOfPublication);
        System.out.println("Book4-->" + book4);
        item5=price;
        
        totalAmount=item1+item2+item3+item4+item5;
        System.out.println("The total amount of the books is -->" + totalAmount);
        taxes=(float) (totalAmount*0.12);
        System.out.println("The taxes are -->" + taxes);
    }
}
