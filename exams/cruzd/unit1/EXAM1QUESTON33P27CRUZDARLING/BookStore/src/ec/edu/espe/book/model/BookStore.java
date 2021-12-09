
package ec.edu.espe.book.model;

import ec.edu.espe.book.controller.Book;
import java.util.Scanner;

/**
 *
 * @author darling.cruz
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
         float price;
         String Publishersname;
         String Authorsname;
         int year;
        
        System.out.println("Enter 5 books ");
        
         Book Book=new Book();
        
        System.out.println("--Welcome the library--");
        System.out.println("Authors name ");
         Authorsname = sc.next(); 
         
        System.out.println("Publications year");
         year= sc.nextInt();
        
          System.out.println("Price ");
         price = sc.nextFloat(); 
         
        System.out.println("Publishers name ");
         Publishersname = sc.next();
        
      
        System.out.println("The book"+","+Authorsname +","+ Publishersname+","+price+","+year);    
    }  
}
