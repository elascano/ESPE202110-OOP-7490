
package ec.edu.espe.smart.empleoyes.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import ec.edu.espe.smart.empleoyes.utils.Connection;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class EmpleoyesController {

    public static void find(String color, DefaultTableModel table) {
        MongoCollection<Document> Empleoyes = new Connection().obtenerDB().getCollection("House");
        Document document = new Document();
        document.put("Color", color);

        MongoCursor<Document> query = Empleoyes.find(document).iterator();
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());}
        

            }

        }
    