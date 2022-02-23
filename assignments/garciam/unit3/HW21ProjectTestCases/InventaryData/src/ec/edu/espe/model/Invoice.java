package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mayerly
 */
public class Invoice {
    private int number;
    private int client_id;
    private int local_date;
    private int product_id;
    
    private ArrayList<Costumer>costumers;

    public Invoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void add(Costumer costumer){
        costumers.add(costumer);
    }   
    
    public void remove(Costumer costumer){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the costumer id to delete it: ");
        int dni=read.nextInt();
        for(int i=0; i<costumers.size(); i++){
            if(costumers.get(i).getId()== dni){
            } else {
                costumers.remove(i);
            }
        }
    }
    
    public int countCostumer(){
            return costumers.size();
        }

    public Invoice(int id, ArrayList<Costumer> costumers) {
        this.client_id = id;
        this.costumers = costumers;
    }
    
    

    public Invoice(int number, int client_id, int local_date, int product_id) {
        this.number = number;
        this.client_id = client_id;
        this.local_date = local_date;
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Invoice{" + "number=" + number + ", client_id=" + client_id + ", local_date=" + local_date + ", product_id=" + product_id + '}';
    }

    
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the client_id
     */
    public int getClient_id() {
        return client_id;
    }

    /**
     * @param client_id the client_id to set
     */
    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    /**
     * @return the local_date
     */
    public int getLocal_date() {
        return local_date;
    }

    /**
     * @param local_date the local_date to set
     */
    public void setLocal_date(int local_date) {
        this.local_date = local_date;
    }

    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
}
