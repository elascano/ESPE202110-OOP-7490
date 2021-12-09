
package ec.edu.espe.book.controller;

/**
 *
 * @author darling.cruz
 */
public class Author {

    private String name;

    @Override
    public String toString() {
        return "Author{" + "nombre=" + getName() + '}';
    }
    
    public Author( ) {
        name = "Carmita";
    }
    
    public Author(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
    
}
