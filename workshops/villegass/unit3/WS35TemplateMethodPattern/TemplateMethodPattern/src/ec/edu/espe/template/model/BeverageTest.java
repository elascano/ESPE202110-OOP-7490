package ec.edu.espe.template.model;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
//Client
public class BeverageTest {

    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee ...");
        coffee.prepareRecipe();
    }

}
