
package ec.edu.espe.door.controller;

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
public class DoorController {

    public static void find(String model, DefaultTableModel table) {
        MongoCollection<Document> House = new Connection().obtenerDB().getCollection("Door");
        Document document = new Document();
        document.put("Model", model);

        MongoCursor<Document> query = House.find(document).iterator();
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());}
        

            }

        }
    