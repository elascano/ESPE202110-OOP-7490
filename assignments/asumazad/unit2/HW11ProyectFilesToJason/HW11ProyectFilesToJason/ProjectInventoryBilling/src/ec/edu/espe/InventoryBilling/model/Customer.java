<<<<<<< HEAD

package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author dylanasumaza
 */
public class Customer {
    private String name;
    private float identification_card;
    private String direction;
    private String email;

    public Customer(String name, float identification_card, String direction, String email) {
        this.name = name;
        this.identification_card = identification_card;
        this.direction = direction;
        this.email = email;
    }

    public Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void doStuff() {
    }

    private void identification_card() {

    }

    private  void direction() {
   
    }
    private Email email(){
        return  new Email(1);
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
     * @return the identification_card
     */
    public float getIdentification_card() {
        return identification_card;
    }

    /**
     * @param identification_card the identification_card to set
     */
    public void setIdentification_card(float identification_card) {
        this.identification_card = identification_card;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
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

    private static class Email {

        public Email() {
        }

        private Email(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

    

=======

package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author dylanasumaza
 */
public class Customer {
    private String name;
    private float identification_card;
    private String direction;
    private String email;

    public Customer(String name, float identification_card, String direction, String email) {
        this.name = name;
        this.identification_card = identification_card;
        this.direction = direction;
        this.email = email;
    }

    public Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void doStuff() {
    }

    private void identification_card() {

    }

    private  void direction() {
   
    }
    private Email email(){
        return  new Email(1);
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
     * @return the identification_card
     */
    public float getIdentification_card() {
        return identification_card;
    }

    /**
     * @param identification_card the identification_card to set
     */
    public void setIdentification_card(float identification_card) {
        this.identification_card = identification_card;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
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

    private static class Email {

        public Email() {
        }

        private Email(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

    

>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
