
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Camila
 */
public class Title {
    private String name;

    public Title(String name) {
        this.name = name;
    }

    public Title() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
