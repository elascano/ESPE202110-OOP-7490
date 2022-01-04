
package ec.edu.espe.controlWeapon.model;

import java.util.Scanner;

/**
 *
 * @author Leandro Quinga 
 * 
 */
public class Explosive {

    private String sort;
    private String name;
    private int amount;

    public void explote() {

    }

    private void detonate() {

    }

    @Override
    public String toString() {
        return "Explosive{" + "sort=" + getSort() + ", name=" + getName() + ", amount=" + getAmount() + '}';
    }

    public Explosive(String sort, String name, int amount) {
        this.sort = sort;
        this.name = name;
        this.amount = amount;
    }

    public Explosive() {
        System.out.println("\n--------------->Data Explosive<------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- sort -->");
        sort = scanner.next();
        System.out.println("--- name -->");
        name = scanner.next();
        System.out.println("--- amount -->");
        amount = scanner.nextInt();
    }

    /**
     * @return the sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * @param sort the sort to set
     */
    public void setSort(String sort) {
        this.sort = sort;
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
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
