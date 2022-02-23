package ec.edu.espe.tire.model;

/**
 *
 * @author WorBotsTeam
 */
public class Product {
    int code ,quantity;
    private double price;
    private String name;
    
    Product(int code, String name, double price, int quantity){
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    Product(){
        
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;                     
    }
    public int getCode(){
        return this.code;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void showResult(){
        System.out.println("\nName is = " + this.getName() + "\t  Price is = "+ this.getPrice() + "\t  Stock is = "+ this.quantity);
    }
    public void showResultGraphic(){
        javax.swing.JOptionPane.showMessageDialog(null,"\nName is = " + this.getName() + "\t  Price is = "+ this.getPrice() + "\t  Stock is = "+ this.quantity);
    }
    public void print(){
        System.out.println("The id --> " + getCode());
        System.out.println("The name is --> " + getName());
        System.out.println("The color is --> " + getPrice());
        System.out.println("The age is --> " + getQuantity());
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
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
 }
    
