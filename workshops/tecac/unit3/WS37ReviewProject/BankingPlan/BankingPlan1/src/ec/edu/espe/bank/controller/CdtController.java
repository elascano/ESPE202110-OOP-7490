package ec.edu.espe.bank.controller;

import javax.swing.JFrame;
import org.bson.Document;

/**
 *
 * @author Simbaña J
 */
public class CdtController {

    private static JFrame cdt;

    public static JFrame updateData(String user, String id, String investment, String yearsOfInvestement) {

        Document data = new org.bson.Document();
        data.put("User", user);
        data.put("Id", id);
        data.put("Investement", investment);
        data.put("YearsOfInvestement", yearsOfInvestement);
        return cdt;
    }
}
