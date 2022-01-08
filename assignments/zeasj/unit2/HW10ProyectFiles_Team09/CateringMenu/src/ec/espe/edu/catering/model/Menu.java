package ec.espe.edu.catering.model;

import java.util.Scanner;

/**
 *
 * @author Joel Zeas 
 */
public class Menu {
    
    private String name;
    private String components;
    private String description;
    private String stockQuantity;
    private Scanner sc = new Scanner(System.in);

    public Menu() {
    }

    @Override
    public String toString() {
       return (getName()+";"+getComponents()+";"+getDescription()+";"+getStockQuantity());
    }

    public Menu(String name, String components, String description, String stockQuantity) {
        this.name = name;
        this.components = components;
        this.description = description;
        this.stockQuantity = stockQuantity;
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
     * @return the components
     */
    public String getComponents() {
        return components;
    }

    /**
     * @param components the components to set
     */
    public void setComponents(String components) {
        this.components = components;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the stockQuantity
     */
    public String getStockQuantity() {
        return stockQuantity;
    }

    /**
     * @param stockQuantity the stockQuantity to set
     */
    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

}