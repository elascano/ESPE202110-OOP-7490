
package ec.edu.espe.exam.model;
import java.util.Scanner;

/**
 *
 * @author Bravo Katherin
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private float price;
    private String yearPublication;
    private int quantity;
    
    public Book(String title, String author, String publisher, float price, String yearPublication, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.yearPublication = year;
        this.quantity = quantity;
    }
    

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
/**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

   