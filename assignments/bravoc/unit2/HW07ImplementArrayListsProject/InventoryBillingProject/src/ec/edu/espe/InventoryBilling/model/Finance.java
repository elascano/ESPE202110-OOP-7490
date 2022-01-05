
package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author Christian Bravo
 */
public class Finance {
    private float profits;
    private float losses;
    private float cost_effectiveness;

    public Finance(float profits, float losses, float cost_effectiveness) {
        this.profits = profits;
        this.losses = losses;
        this.cost_effectiveness = cost_effectiveness;
    }
    
    

    public void doStuff() {

    }

    private void FinancesProfits() {

    }

    private void FinancesLosses() {

    }

    private void FinancesCost_effectiveness() {

    }

    /**
     * @return the profits
     */
    public float getProfits() {
        return profits;
    }

    /**
     * @param profits the profits to set
     */
    public void setProfits(float profits) {
        this.profits = profits;
    }

    /**
     * @return the losses
     */
    public float getLosses() {
        return losses;
    }

    /**
     * @param losses the losses to set
     */
    public void setLosses(float losses) {
        this.losses = losses;
    }

    /**
     * @return the cost_effectiveness
     */
    public float getCost_effectiveness() {
        return cost_effectiveness;
    }

    /**
     * @param cost_effectiveness the cost_effectiveness to set
     */
    public void setCost_effectiveness(float cost_effectiveness) {
        this.cost_effectiveness = cost_effectiveness;
    }
    
}


