

package californiatax;

/**
 *
 * @author Mayerly Garcia
 */


public class StateofCaliforniaTax { //Tax in California is 7.5 

//    Scanner sc = new Scanner(System.in);
//    double priceUnit, quantity, USTax, priceWithoutTax, totalTax;
    private static StateofCaliforniaTax instance;

    private StateofCaliforniaTax() {

    }

    public static StateofCaliforniaTax getInstance() {
        if (instance == null) {
            instance = new StateofCaliforniaTax();
        }
        return instance;
    }

    public float salesTotal(float base) {

//        Scanner sc = new Scanner(System.in);
//        double priceUnit, quantity, USTax, priceWithoutTax, totalTax;
//        System.out.print("Enter price per unit of the product: ");
//        priceUnit = sc.nextDouble();
//
//        System.out.print("Enter number of products sold: ");
//        quantity = sc.nextDouble();
//
//        System.out.print("Enter TAX: ");
//        USTax = sc.nextDouble();
//
//        priceWithoutTax = priceUnit * quantity;
//        totalTax = priceWithoutTax * USTax / 100;
//
//        System.out.println("The Taxin  State o fCalifornia is -> " + (priceWithoutTax + totalTax));
        return 0;

    }

    public void salesTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
