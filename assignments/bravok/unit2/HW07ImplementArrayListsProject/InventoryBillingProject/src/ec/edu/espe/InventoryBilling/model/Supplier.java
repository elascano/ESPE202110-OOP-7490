
package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author Katherin Bravo
 */
public class Supplier {
     private String name;
    private int Identification_card;
    private int ruc;
    private String direction;
    private String email;
    private int Cost_of_sale;

    public Supplier(String name, int Identification_card, int ruc, String direction, String email, int Cost_of_sale) {
        this.name = name;
        this.Identification_card = Identification_card;
        this.ruc = ruc;
        this.direction = direction;
        this.email = email;
        this.Cost_of_sale = Cost_of_sale;
    }

    public Supplier(String name, int age, float customer, float customer0, int phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void doStuff(){
        
    }
    
    private void RegisterSupplier(){
        
    }
    private void IdentifySupplier(){
        
    }
    private void ProductCostRecorder(){
        
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
     * @return the Identification_card
     */
    public int getIdentification_card() {
        return Identification_card;
    }

    /**
     * @param Identification_card the Identification_card to set
     */
    public void setIdentification_card(int Identification_card) {
        this.Identification_card = Identification_card;
    }

    /**
     * @return the ruc
     */
    public int getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(int ruc) {
        this.ruc = ruc;
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

    /**
     * @return the Cost_of_sale
     */
    public int getCost_of_sale() {
        return Cost_of_sale;
    }

    /**
     * @param Cost_of_sale the Cost_of_sale to set
     */
    public void setCost_of_sale(int Cost_of_sale) {
        this.Cost_of_sale = Cost_of_sale;
    }

}


