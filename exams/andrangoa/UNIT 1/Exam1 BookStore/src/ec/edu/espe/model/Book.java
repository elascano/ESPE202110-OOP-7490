
package ec.edu.espe.model;

/**
 *
 * @author alex_
 */
public class Book {
    private String tittle;
    private String author;
    private String publisher;
    private int price;
    private int year;

    public Book() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Book{" + "tittle=" + tittle + ", author=" + author + ", publisher=" + publisher + ", price=" + price + ", year=" + year + '}';
    }

    
    
    
    public Book(String tittle, String author, String publisher, int price, int year) {
        this.tittle = tittle;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    
    
       
    /**
     * @return the tittle
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * @param tittle the tittle to set
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
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
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
