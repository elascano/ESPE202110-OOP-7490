package ec.edu.espe.bank.controller;

import javax.swing.JFrame;
import org.bson.Document;

/**
 *
 * @author Simbaña J
 */
public class SavingController {

    private static JFrame register;

    public static JFrame updateData(String name, String accountNumber, String movementType, double amount) {

        Document data = new org.bson.Document();
        data.put("Name", name);
        data.put("AccountNumber", accountNumber);
        data.put("MovementType", movementType);
        data.put("Amount", amount);
        return register;
    }
}
