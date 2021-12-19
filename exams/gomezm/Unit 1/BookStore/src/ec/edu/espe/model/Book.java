package ec.edu.espe.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melig
 */
public class Book {
    
    private String title;
    private String author;
    private String publisher;
    private final float price;
    private int yearPublication;
    
    @Override
    public String toString() {
        return "BookStore{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price + ", yearPublication=" + yearPublication + '}';
    }

   private void sell(){
       
   }
   
   private void aboutProduct (){
       
   }

   public Book(){
       
        title = "Buoulevard";
        author = "Flor Salvador";
        publisher = "Editorial Naranja";
        price = (float) 14.50;
        yearPublication = 2022;
   }
    
    
    public Book(String title, String author, String publisher, float price, int yearPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }    

}

