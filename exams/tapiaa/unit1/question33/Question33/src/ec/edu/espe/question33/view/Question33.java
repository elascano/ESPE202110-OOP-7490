package ec.edu.espe.question33.view;

import java.util.Scanner;

/**
 *
 * @author Andrea Tapia
 */
public class Question33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book;
        String tittle;
        String author;
        float price;
        float publicationYear;
        int i;
        
        

        for (i = 0; i < 4; i++) {

            System.out.println("Andrea Tapia");
            System.out.println("Please enter the data from your book ");
            System.out.println("--->Tittle");
            tittle = sc.next();

            System.out.println("--->Price");
            price = sc.nextFloat();

            System.out.println("--->Author");
            author = sc.next();

            System.out.println("--->Publication year");
            publicationYear = sc.nextFloat();
     
        }

    }
}

