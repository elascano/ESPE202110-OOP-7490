package ec.edu.espe.bank.controller;

import javax.swing.JFrame;
import org.bson.Document;

/**
 *
 * @author Simbaña J
 */
public class LoginController {

    private static JFrame login;

    public static JFrame updateData(String user, String password) {

        Document data = new org.bson.Document();
        data.put("User", user);
        data.put("Password", password);

        return login;
    }
}
