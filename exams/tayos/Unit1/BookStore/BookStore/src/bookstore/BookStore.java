package bookstore;

import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tittle = "";
        String author = "";
        String publisher = "";
        int prize = 0;
        int yearOfPublication = 0;

        System.out.println("Book specifications");
        System.out.println("Tittle -->");
        tittle = scanner.next();

        System.out.println("author ");
        author = scanner.next();

        System.out.println("publisher");
        publisher = scanner.next();

        System.out.println("prize");
        prize = scanner.nextInt();

        System.out.println("year of publication");
        yearOfPublication = scanner.nextInt();
        System.out.println("The tittle" + tittle + " ;author --> " + author + " ;publisher --> " + publisher + " ;prizwe --> " + prize);
    }

}
