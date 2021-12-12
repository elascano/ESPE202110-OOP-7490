package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Alejandro Delacruz
 */
public class Book {
        public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String titulo;
        String autor;
        String editorial;
        String año;
        int precio;
        int iva;
        int preciofinal;
        
        
        System.out.println("theBookStore: ");
        System.out.println("Title of the Book?: ");
        titulo = sc.nextLine();
        System.out.println("Author of the Book?: ");
        autor = sc.nextLine();
        System.out.println("Book Id?: ");
        editorial = sc.nextLine();
        System.out.println("Price Book?: ");
        precio = teclado.nextInt();
        iva= (int) (precio * 0.12);
        preciofinal = iva +precio;
        System.out.println("Year of publisher Book?: ");
        año = sc.nextLine();
        
       
                    
       
        System.out.println("Title of the book " + titulo);     
        System.out.println("Author of the book " + autor);  
        System.out.println("Book id " + editorial); 
        System.out.println("Book price " + precio);  
        System.out.println("Final price of the book, including VAT " + preciofinal); 
        System.out.println("Year of publisher book" + año);  
   
    }
}
