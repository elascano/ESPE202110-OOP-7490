
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Camila
 */
public class Publisher {
    private String publisher;

    public Publisher(String publisher) {
        this.publisher = publisher;
    }

    public Publisher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
