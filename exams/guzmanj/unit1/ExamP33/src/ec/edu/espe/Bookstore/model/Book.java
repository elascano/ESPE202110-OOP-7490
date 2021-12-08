/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Bookstore.model;

/**
 *
 * @author WINDOWS 10
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private float price;
    private int yearOfPublication;

    @Override
    public String toString() {
        return "Book{" + "title=" + getTitle() + ", author=" + getAuthor() + ", publisher=" + getPublisher() + ", price=" + getPrice() + ", yearOfPublication=" + getYearOfPublication() + '}';
    }
    
    public Book(){
        title="Travel to te center of the earth";
        author="Julio Verne";
        publisher="Hetzel";
        price=(float) 20.8;
        yearOfPublication=1864;
    }
    
    public Book(String title, String author, String publisher,float price, int yearOfPublication){
            this.title=title;
            this.author=author;
            this.publisher=publisher;
            this.price=price;
            this.yearOfPublication=yearOfPublication;
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

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the yearOfPublication
     */
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * @param yearOfPublication the yearOfPublication to set
     */
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
}
