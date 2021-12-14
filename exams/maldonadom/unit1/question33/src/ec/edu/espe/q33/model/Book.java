/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q33.model;

/**
 *
 * @author andresmaldonado
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private float price;
    private int yearOfPublication;
    private String areaIfInterest;

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price + ", yearOfPublication=" + yearOfPublication + ", areaIfInterest=" + areaIfInterest + '}';
    }
    
    public Book(String title, String author, String publisher, float price, int yearOfPublication, String areaIfInterest) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.areaIfInterest = areaIfInterest;
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

    /**
     * @return the areaIfInterest
     */
    public String getAreaIfInterest() {
        return areaIfInterest;
    }

    /**
     * @param areaIfInterest the areaIfInterest to set
     */
    public void setAreaIfInterest(String areaIfInterest) {
        this.areaIfInterest = areaIfInterest;
    }
    
    
}
