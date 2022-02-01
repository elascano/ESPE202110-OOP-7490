
package ec.edu.espe.Truck.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import utils.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Anthony Morales
 */
public class SemiTruckController {
    public static void find(String Brand, DefaultTableModel table) {
        MongoCollection<Document> Dog = new Connection().obtenerDB().getCollection("Workshop29");
        Document document = new Document();
        document.put("Brand", Brand);

        MongoCursor<Document> query = Dog.find(document).iterator();
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());}
            }
}
