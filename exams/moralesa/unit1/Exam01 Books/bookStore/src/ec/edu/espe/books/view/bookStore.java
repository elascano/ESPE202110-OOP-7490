
package ec.edu.espe.books.view;

/**
 *
 * @author Anthony Morales
 */
public class bookStore {
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
        
        
        System.out.println("BookStore: ");
        System.out.println("Introduce el Titulo del Libro: ");
        titulo = sc.nextLine();
        System.out.println("Introduce el Autor del Libro: ");
        autor = sc.nextLine();
        System.out.println("Introduce la Editorial del Libro: ");
        editorial = sc.nextLine();
        System.out.println("Introduce el Precio del Libro: ");
        precio = teclado.nextInt();
        iva= (int) (precio * 0.12);
        preciofinal = iva +precio;
        System.out.println("Introduce la Año del Libro: ");
        año = sc.nextLine();
        
       
                    
       
        System.out.println("Titulo del libro " + titulo);     
        System.out.println("Autor del libro " + autor);  
        System.out.println("Editorial del libro " + editorial); 
        System.out.println("Precio del libro " + precio);  
        System.out.println("Precio final del libro, incluido IVA " + preciofinal); 
        System.out.println("Año del libro " + año);  

    }
 
}
