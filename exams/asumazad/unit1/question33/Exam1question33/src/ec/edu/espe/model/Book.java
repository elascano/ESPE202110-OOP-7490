package ec.edu.espe.model;

/**
 *
 * @author dylanasumaza
 */
public class Book {
    private  String title;
    private String author;
    private String publisher;
    private float price;
    private String yearPublication;
    private int quantity;
public Book(String title, String author, String publisher,float price, String yearPublication,int quantity){
    this.title = title;
    this.author = author;
    this.price = price;
    this.yearPublication = yearPublication;
    this.quantity = quantity;
     
}
    
    
    
}
