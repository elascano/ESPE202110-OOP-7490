
package ec.edu.espe.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.utils.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Maisincho Richar
 */
public class RegistrationController {
    
    public static void find(String name, DefaultTableModel table) {
        MongoCollection<Document> contacts = new Connection().obtenerDB().getCollection("Registration");
        Document document = new Document();
        document.put("Name", name);

        MongoCursor<Document> query = contacts.find(document).iterator();
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());}
        

            }
    
    
}
