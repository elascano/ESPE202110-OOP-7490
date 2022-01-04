
package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author Katherin Bravo
 */
public class Inventory {
    private int Boxes_of_product;
    private String Tables_of_control;
    private String Names_of_product;

    public Inventory(int Boxes_of_product, String Tables_of_control, String Names_of_product) {
        this.Boxes_of_product = Boxes_of_product;
        this.Tables_of_control = Tables_of_control;
        this.Names_of_product = Names_of_product;
    }
    
    
    
    public void doStuff(){
        
    }
    private void does_specific_work(){
        
    } 
    private void solve_problem(){
        
    }

    /**
     * @return the Boxes_of_product
     */
    public int getBoxes_of_product() {
        return Boxes_of_product;
    }

    /**
     * @param Boxes_of_product the Boxes_of_product to set
     */
    public void setBoxes_of_product(int Boxes_of_product) {
        this.Boxes_of_product = Boxes_of_product;
    }

    /**
     * @return the Tables_of_control
     */
    public String getTables_of_control() {
        return Tables_of_control;
    }

    /**
     * @param Tables_of_control the Tables_of_control to set
     */
    public void setTables_of_control(String Tables_of_control) {
        this.Tables_of_control = Tables_of_control;
    }

    /**
     * @return the Names_of_product
     */
    public String getNames_of_product() {
        return Names_of_product;
    }

    /**
     * @param Names_of_product the Names_of_product to set
     */
    public void setNames_of_product(String Names_of_product) {
        this.Names_of_product = Names_of_product;
    }
}

    


    

