
package ec.edu.espe.book.view;


import ec.edu.espe.book.model.DatePublic;
import ec.edu.espe.book.model.Book;
import java.util.Scanner;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class BookSystem {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        
    
        int id; 
        String name; 
        String author; 
        boolean molting;
        int Counter;
        int day;
        int month;
        int year;
        String jsonBook = "";
        String jsonDatePublic = "";
        
                       
        Scanner enter = new Scanner (System.in);
         
        
        Book book [] = new Book[10];
        DatePublic datePublic[] = new DatePublic[10];
       
        
        System.out.print("Welcome to Book Program" + " Author: Benjamin Cadena ");
        
        for(int i=0;i<3;i++){
            
            System.out.print("\n Next Book... \n");
            
            
            System.out.print("Insert Book id:");
            id = enter.nextInt();
            
            System.out.print("Insert Book name:");
            name = enter.next();
            
            System.out.print("Insert Book author:");
            author = enter.next();
                                  
            System.out.print("Insert Date Publication On \n");
            
            System.out.print("Insert Day:"); 
            day = enter.nextInt();                  
                                    
            System.out.print("Insert Month:"); 
            month = enter.nextInt();
           
            System.out.print("Insert Year:"); 
            year = enter.nextInt();
            
            System.out.print("Instert molting:");
            molting = enter.nextBoolean();
            

            
            
           
            enter.nextLine();
            int counter = 0;
            
            book[i] = new Book(id,name,author,molting,counter);  
            datePublic[i] = new DatePublic(day, month, year);
            
            
            

        }

                 
         
        
    }
    
}
        
