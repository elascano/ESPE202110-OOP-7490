
package ec.edu.espe.exam.model;

/**
 *
 * @author malvarez 
 */
public class Book {
    
    private String title;
    private String author;
    private String publisher;
    private float price;
    private int yearOfPublication;
    private String areaOfInterest;
    
    
    public Book() {
        
        
    }

    public Book(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Book(String title, String author, String publisher, float price, int yearOfPublication, String areaOfInterest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price + ", yearOfPublication=" + yearOfPublication + ", areaOfInterest=" + areaOfInterest + '}';
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

    public Book(String title, String author, String publisher, float price, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * @return the areaOfInterest
     */
    public String getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * @param areaOfInterest the areaOfInterest to set
     */
    public void setAreaOfInterest(String areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
    }
    
    
}
