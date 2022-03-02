package ec.edu.espe.bank.controller;

import javax.swing.JFrame;
import org.bson.Document;

/**
 *
 * @author Simbaña J
 */
public class RegisterController {

    private static JFrame register;

    public static JFrame updateData(String user, String id, String birthdate, String password) {

        Document data = new org.bson.Document();
        data.put("User", user);
        data.put("Id", id);
        data.put("BirthDate", birthdate);
        data.put("Password", password);
        return register;
    }
}
