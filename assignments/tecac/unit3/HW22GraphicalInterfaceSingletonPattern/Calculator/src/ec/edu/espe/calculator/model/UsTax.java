package ec.edu.espe.calculator.model;

import java.util.Scanner;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class UsTax {

    private static UsTax instance;
    float taxRate;

    private UsTax() {
        taxRate = 5.60F;
    }

    public static UsTax getInstance() {
        if (instance == null) {
            instance = new UsTax();
        }
        return instance;
    }

    public float salesTotal() {
        Scanner keyboard = new Scanner(System.in);
        float priceTotal;
        float objectTotal;
        float ArizonaValueTax = 0.056F;
        float value;

        System.out.println("The value of your product is:");
        value = keyboard.nextFloat();

        objectTotal = value * ArizonaValueTax;
        priceTotal = value + objectTotal;

        System.out.println("In Arizona state the total price including the tax of " + taxRate + " %" + " is " + Math.round(priceTotal) + " dollars");
        return 0;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void changeTaxRate(float otherTaxRate) {
        taxRate = otherTaxRate;
    }
}
