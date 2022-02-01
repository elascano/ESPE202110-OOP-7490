/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.window.controller;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.Connection;
/**
 *
 * @author USUARIO
 */
public class windowController {
    public static void find(String type, DefaultTableModel table) {
        MongoCollection<Document> windows = new Connection().obtenerDB().getCollection("windows");
        Document document = new Document();
        document.put("TYPE", type);

        MongoCursor<Document> query = windows.find(document).iterator();
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());}
        
    }
    
}
