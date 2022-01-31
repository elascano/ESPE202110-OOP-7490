
package ec.edu.espe.house.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.MongoConnection;

/**
 *
 * @author Salma Villegas
 */
public class HouseController {

    public static void find(String color, DefaultTableModel table) {
        MongoCollection<Document> House = new MongoConnection().obtenerDB().getCollection("House");
        Document document = new Document();
        document.put("Color", color);

        MongoCursor<Document> query = House.find(document).iterator();
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());}
        

            }

        }
    