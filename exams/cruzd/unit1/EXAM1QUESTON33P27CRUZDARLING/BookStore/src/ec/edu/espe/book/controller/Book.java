
package ec.edu.espe.book.controller;

/**
 *
 * @author darling.cruz
 */
public class Book {
    private String title;
    private float price;
    private String namePublisher;
     private String nameAuthor;
    private String enderBook;

    
    
    public Book(String title, float price, String namePublisher, String nameAuthor, String enderBook) {
        this.title = title;
        this.price = price;
        this.namePublisher = namePublisher;
        this.nameAuthor = nameAuthor;
        this.enderBook = enderBook;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", price=" + price + ", namePublisher=" + namePublisher + ", nameAuthor=" + nameAuthor + ", enderBook=" + enderBook + '}';
    }
    
  
    
    
    /**
     * @return the namePublisher
     */
    public String getNamePublisher() {
        return namePublisher;
    }

    /**
     * @param namePublisher the namePublisher to set
     */
    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }
    
    public Book( ) {
        price = 0;
        namePublisher = "Valeria";
        nameAuthor = "Marcos";
    }
    
    public Book(float price, String namePublisher, String nameAuthor) {
        this.price = price;
        this.namePublisher = namePublisher;
        this.nameAuthor = nameAuthor;
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
     * @return the name
     */
    public String getName() {
        return getNameAuthor();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.setNameAuthor(name);
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
     * @return the nameAuthor
     */
    public String getNameAuthor() {
        return nameAuthor;
    }

    /**
     * @param nameAuthor the nameAuthor to set
     */
    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    /**
     * @return the enderBook
     */
    public String getEnderBook() {
        return enderBook;
    }

    /**
     * @param enderBook the enderBook to set
     */
    public void setEnderBook(String enderBook) {
        this.enderBook = enderBook;
    }
   
  
    
    
}
