/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exam.model;

/**
 *
 * @author MateoMaldonado
 */
public class Book {
        int price;
        String title;
        String author;
        int year;
        String editorial;

    @Override
    public String toString() {
        return "Book{" + "price=" + price + ", title=" + title + ", author=" + author + ", year=" + year + ", editorial=" + editorial + '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Book(int price, String title, String author, int year, String editorial) {
        this.price = price;
        this.title = title;
        this.author = author;
        this.year = year;
        this.editorial = editorial;
    }
        
        
}
