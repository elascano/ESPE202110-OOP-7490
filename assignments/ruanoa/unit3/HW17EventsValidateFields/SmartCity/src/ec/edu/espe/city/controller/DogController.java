
package ec.edu.espe.city.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.MongoConnection;

/**
 *
 * @author Alexander Ruano
 */
public class DogController {

    public static void find(String name, DefaultTableModel table) {
        MongoCollection<Document> Dog = new MongoConnection().obtenerDB().getCollection("Dog");
        Document document = new Document();
        document.put("NAME", name);

        MongoCursor<Document> query = Dog.find(document).iterator();
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<>(query.next().values());
            table.addRow(doc.toArray());}
        

            }

        }

