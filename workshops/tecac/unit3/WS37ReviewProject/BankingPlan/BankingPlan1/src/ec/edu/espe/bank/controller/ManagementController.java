package ec.edu.espe.bank.controller;

import javax.swing.JFrame;
import org.bson.Document;

/**
 *
 * @author Simbaña J
 */
public class ManagementController {

    private static JFrame management;

    public static JFrame updateData(String transaction, String income) {

        Document data = new org.bson.Document();
        data.put("Transaction", transaction);
        data.put("Income", income);

        return management;
    }
}
