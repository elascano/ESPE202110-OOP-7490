
package ec.edu.espe.InventoryBilling.model;

/**
 *
 * @author PABLO
 */
public class Invoice {
    private String information;
    private String data;
    private int payment;
    private String detail;

    public Invoice(String information, String data, int payment, String detail) {
        this.information = information;
        this.data = data;
        this.payment = payment;
        this.detail = detail;
    }
    
    
    

    public void doStuff() {
    }

    private void date() {

    }

    private void payment() {

    }

    private void detail() {
        
    }

    /**
     * @return the information
     */
    public String getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the payment
     */
    public int getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(int payment) {
        this.payment = payment;
    }

    /**
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

}

    

