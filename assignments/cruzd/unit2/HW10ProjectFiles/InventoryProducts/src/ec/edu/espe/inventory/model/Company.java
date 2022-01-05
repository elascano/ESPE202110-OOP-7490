
package ec.edu.espe.inventory.model;

/**
 *
 * @author darling.cruz
 */
public class Company {
    
    private String name;
    private int telephone;
    private String mail;
    private String address;

    public Company(String name, int telephone, String mail, String address) {
        this.name = name;
        this.telephone = telephone;
        this.mail = mail;
        this.address = address;
    }
    
    public Company() {
        this.name = name;
        this.telephone = telephone;
        this.mail = mail;
        this.address = address;
    }  
    
    public void data(){
        
    }
    public void sell(){
        
    }
    public void pomotrProduct(){
        
    }
    public void products(){
        
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
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
