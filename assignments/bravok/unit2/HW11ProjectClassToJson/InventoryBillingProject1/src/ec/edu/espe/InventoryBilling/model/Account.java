
package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author Katherin Bravo
 */
public class Account {
    
    private String name_of_account;
    private int ID;
    private int Number_of_account;
    private int savings_account;
    private int current_account;

    public Account(String name_of_account, int ID, int Number_of_account, int savings_account, int current_account) {
        this.name_of_account = name_of_account;
        this.ID = ID;
        this.Number_of_account = Number_of_account;
        this.savings_account = savings_account;
        this.current_account = current_account;
    }
    
       
    
    public void userAccount(){
        
    }
    private void pay(){
        
    }

    /**
     * @return the name_of_account
     */
    public String getName_of_account() {
        return name_of_account;
    }

    /**
     * @param name_of_account the name_of_account to set
     */
    public void setName_of_account(String name_of_account) {
        this.name_of_account = name_of_account;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Number_of_account
     */
    public int getNumber_of_account() {
        return Number_of_account;
    }

    /**
     * @param Number_of_account the Number_of_account to set
     */
    public void setNumber_of_account(int Number_of_account) {
        this.Number_of_account = Number_of_account;
    }

    /**
     * @return the savings_account
     */
    public int getSavings_account() {
        return savings_account;
    }

    /**
     * @param savings_account the savings_account to set
     */
    public void setSavings_account(int savings_account) {
        this.savings_account = savings_account;
    }

    /**
     * @return the current_account
     */
    public int getCurrent_account() {
        return current_account;
    }

    /**
     * @param current_account the current_account to set
     */
    public void setCurrent_account(int current_account) {
        this.current_account = current_account;
    }
}

    


    

