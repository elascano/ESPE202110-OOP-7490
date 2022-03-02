package ec.edu.espe.coffeShop.model;

/**
 *
 * @author Javier Paucar
 */
public class BeverageTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        System.out.println("\n");

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
        System.out.println("\n");
    }
}
