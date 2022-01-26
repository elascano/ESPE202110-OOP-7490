
package pooexam.andrade.alan.program;
import pooexam.andrade.alan.Books;
        
public class POOExamAndradeAlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Books books= new Books();
    
        int id = 1;
        String title = "Quijote de la mancha";
        String author = "Miguel de Cervantes";
        String editorial = "Francisco de Robles Juan de la Cuesta";
        int yearPublication = 1614;
    Books books2= new Books(id, author, editorial, yearPublication);
      
    System.out.println("Books 2 -->" +books2);
    
        id = 2;
        title = "El principito";
        author = "Antoine de Saint-Exupéry";
        editorial = "Oceano";
        yearPublication = 2009;
    Books books3= new Books(id, author, editorial, yearPublication);
    System.out.println("Books 3 -->" +books3);
        id = 3;
        title = "Harry Potter";
        author = "Jk Rolling";
        editorial = "Bloomsbury Publishing Scholastic Corporation Salamandra";
        yearPublication = 1997;
    Books books4= new Books(id, author, editorial, yearPublication);
    System.out.println("Books 4 -->" +books4);
        id = 4;
        title = "Harry Potter";
        author = "Jk Rolling";
        editorial = "Bloomsbury Publishing Scholastic Corporation Salamandra";
        yearPublication = 1997;
    
    }
    
}
