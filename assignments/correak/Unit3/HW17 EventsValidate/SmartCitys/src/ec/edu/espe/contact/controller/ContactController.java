/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contact.controller;

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
public class ContactController {
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
