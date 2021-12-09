
package ec.edu.espe.book.controller;

/**
 *
 * @author darling.cruz
 */
public class Publisher {
    
    private String namePublisher;

    
    
    @Override
    public String toString() {
        return "Publisher{" + "namePublisher=" + namePublisher + '}';
    }
    

    public Publisher( ) {
        namePublisher = "Ross";
    }

    public Publisher(String namePublisher) {
        this.namePublisher = namePublisher;
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

    
    
    
    
    
    
}
