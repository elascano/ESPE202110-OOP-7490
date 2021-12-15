
package ec.edu.espe.inventory.model;

/**
 *
 * @author WorBotsTeam
 */
public class Seller {
    private String name;
    private int telephone;
    private int id;
    private String email;
    private String stand;

    public Seller(String name, int telephone, int id, String email, String stand) {
        this.name = name;
        this.telephone = telephone;
        this.id = id;
        this.email = email;
        this.stand = stand;
    }
    
    public Seller() {
        this.name = name;
        this.telephone = telephone;
        this.id = id;
        this.email = email;
        this.stand = stand;
    }
    public void sell(){
        
    }
    
    public void buy(){
        
    }
    
    public void organice(){
        
    }
    
    public void checkOfProduct(){
        
    }
    
    public void informerProduct(){
        
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

    /**
     * @return the telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the stand
     */
    public String getStand() {
        return stand;
    }

    /**
     * @param stand the stand to set
     */
    public void setStand(String stand) {
        this.stand = stand;
    }
}
