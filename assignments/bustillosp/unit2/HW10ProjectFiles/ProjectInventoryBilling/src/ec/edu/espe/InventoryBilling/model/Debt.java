
package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author PABLO
 */
public class Debt {
    private String Obligatory_payment;
    private String market_economy;
    private int creditor;

    public Debt(String Obligatory_payment, String market_economy, int creditor) {
        this.Obligatory_payment = Obligatory_payment;
        this.market_economy = market_economy;
        this.creditor = creditor;
    }
    
    
  
    public void Obligatory_payment() {
    }

    private void market_economy() {

    }

    private void creditor() {
        
    }

    /**
     * @return the Obligatory_payment
     */
    public String getObligatory_payment() {
        return Obligatory_payment;
    }

    /**
     * @param Obligatory_payment the Obligatory_payment to set
     */
    public void setObligatory_payment(String Obligatory_payment) {
        this.Obligatory_payment = Obligatory_payment;
    }

    /**
     * @return the market_economy
     */
    public String getMarket_economy() {
        return market_economy;
    }

    /**
     * @param market_economy the market_economy to set
     */
    public void setMarket_economy(String market_economy) {
        this.market_economy = market_economy;
    }

    /**
     * @return the creditor
     */
    public int getCreditor() {
        return creditor;
    }

    /**
     * @param creditor the creditor to set
     */
    public void setCreditor(int creditor) {
        this.creditor = creditor;
    }
}

    

    

