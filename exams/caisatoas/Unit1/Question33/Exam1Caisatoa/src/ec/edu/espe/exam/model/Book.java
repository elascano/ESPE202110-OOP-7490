
package ec.edu.espe.exam.model;

/**
 *
 * @author Caisatoa
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
        this.yearPublication = yearPublication;
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
     * @return the yearPublication
     */
    public String getYearPublication() {
        return yearPublication;
    }

    /**
     * @param yearPublication the yearPublication to set
     */
    public void setYearPublication(String yearPublication) {
        this.yearPublication = yearPublication;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


