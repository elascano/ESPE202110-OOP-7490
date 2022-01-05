
package ec.edu.espe.view;

import ec.edu.espe.model.Book;
import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class BookStore {
    public static void main(String[] args) {
        String tittle = null;
        String author = null;
        String publisher = null;
        int price=20;
        int year = 0;
        float iva= (float) 0.12;
        Book book=new Book(tittle, author, publisher, price, year);
        

        for(int i=1; i<=5; i++){
        Book book1 = new Book(tittle, author, publisher, price, year);
        System.out.println("Book  -->" + book1);
              
        System.out.println("Please enter tittle of the book");
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Tittle  --> ");
        tittle = scanner.next();
        
        System.out.println("Please enter the publisher of the book");
        System.out.println("- author --> ");
        publisher = scanner.next();
        
        System.out.println("Please enter the author of the book");
        System.out.println("- name --> ");
        author = scanner.next();
        
     
        System.out.println("Please enter the year of the Book");
        System.out.println("- Year --> ");
        year = scanner.nextInt();
        System.out.println("Book  -->" + book);
        }
               
         System.out.println("your books: ");
         System.out.println("Book  -->" + book);
        
        
        
        System.out.println("price of each book = $20");
        System.out.println("price of books= ");
        int subTotal;
        subTotal = price*5;
        System.out.println("subtotal" + subTotal);
        System.out.println("precio total + iva :");
                
        float totalIva;
        totalIva = subTotal*iva;
        System.out.println("Iva = " + totalIva);
        
        float amount = totalIva+subTotal;
        System.out.println("Amount = " + amount);
        
        }
   

   
  
    }
