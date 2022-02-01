
package ec.edu.espe.registration.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author Andy Calderon 
 */
public class RegistrationController {
     public static void find(String name, DefaultTableModel table) {
        MongoCollection<Document> contacts = new Connection().obtenerDB().getCollection("contacts");
        Document document = new Document();
        document.put("NAME", name);

        MongoCursor<Document> query = contacts.find(document).iterator();
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());}
        

            }
}
