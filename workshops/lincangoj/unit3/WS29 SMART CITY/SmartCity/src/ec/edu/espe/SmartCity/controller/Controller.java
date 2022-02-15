/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SmartCity.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;



public class Controller {
    
    public static void find(String name , DefaultTableModel table) 
    {
        MongoCollection<Document> Bone = new Connection().obtenerDB().getCollection("Bones Information");
        Document document = new Document();
        document.put("NAME", name);

        MongoCursor<Document> query = Bone.find(document).iterator();
        
        while(query.hasNext())
        {

            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
           table.addRow(doc.toArray());
        }
        

    }
}
