package ec.edu.espe.inventory.model;

/**
 *
 * @author darling.cruz
 */
public class Product {

    private static String name;
    private static int price;
    private static int stock;
    private static int code;

    public Product(String name,int code, int price, int stock) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public Product() {
        
    }

    public void print(){
        System.out.println("The id --> " + getCode());
        System.out.println("The name is --> " + getName());
        System.out.println("The color is --> " + getPrice());
        System.out.println("The age is --> " + getStock());
    }

    /**
     * @return the name
     */
    public static String getName() {
        return name;
    }

    /**
     * @param aName the name to set
     */
    public static void setName(String aName) {
        name = aName;
    }

    /**
     * @return the price
     */
    public static int getPrice() {
        return price;
    }

    /**
     * @param aPrice the price to set
     */
    public static void setPrice(int aPrice) {
        price = aPrice;
    }

    /**
     * @return the stock
     */
    public static int getStock() {
        return stock;
    }

    /**
     * @param aStock the stock to set
     */
    public static void setStock(int aStock) {
        stock = aStock;
    }

    /**
     * @return the code
     */
    public static int getCode() {
        return code;
    }

    /**
     * @param aCode the code to set
     */
    public static void setCode(int aCode) {
        code = aCode;
    }
        

    
 }
    
