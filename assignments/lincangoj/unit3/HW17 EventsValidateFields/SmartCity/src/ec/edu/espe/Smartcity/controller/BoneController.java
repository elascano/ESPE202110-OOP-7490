
package ec.edu.espe.Smartcity.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.MongoConnection;


public class BoneController {
    
    public static void find(String name , DefaultTableModel table) 
    {
        MongoCollection<Document> Bone = new MongoConnection().obtenerDB().getCollection("BONE DATA");
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
