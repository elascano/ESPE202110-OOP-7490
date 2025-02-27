package ec.edu.espe.simulationcatering.model;

import java.util.Scanner;

/**
 *
 * @author Melanie Teran
 */
public class Cookware {

    private int code;
    private String name;
    private String material;
    private String use;
    private String disponibility;
    private int quantity;

    @Override
    public String toString() {
        return "Cookware{" + "code=" + code + ", name=" + name + ", material=" + material + ", use=" + use + ", disponibility=" + disponibility + ", quantity=" + quantity + '}';
    }

    /**
     *
     */
    public void seeCode(int code) {

    }

    public void seeName(String name) {

    }

    public void seeMaterial(String material) {

    }

    public void seeUse(String use) {

    }

    public boolean check(String disponibility) {
        return false;

    }

    private void seeQuantity(int quantity) {

    }

    public Cookware(int code, String name, String material, String use, String disponibility, int quantity) {
        this.code = code;
        this.name = name;
        this.material = material;
        this.use = use;
        this.disponibility = disponibility;
        this.quantity = quantity;
    }

    public Cookware() {
        System.out.println("\n Details of the cookware ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Code ");
        code = scanner.nextInt();
        System.out.println(" Name ");
        name = scanner.next();
        System.out.println(" Material ");
        material = scanner.next();
        System.out.println(" Use ");
        use = scanner.next();
        System.out.println(" Disponibility ");
        disponibility = scanner.next();
        System.out.println(" Quantity ");
        quantity = scanner.nextInt();
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the use
     */
    public String getUse() {
        return use;
    }

    /**
     * @param use the use to set
     */
    public void setUse(String use) {
        this.use = use;
    }

    /**
     * @return the disponibility
     */
    public String getDisponibility() {
        return disponibility;
    }

    /**
     * @param disponibility the disponibility to set
     */
    public void setDisponibility(String disponibility) {
        this.disponibility = disponibility;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
