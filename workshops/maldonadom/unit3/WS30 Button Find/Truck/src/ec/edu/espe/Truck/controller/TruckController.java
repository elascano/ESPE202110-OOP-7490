/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Truck.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.Truck.utils.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author andresmaldonado
 */
public class TruckController {
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
