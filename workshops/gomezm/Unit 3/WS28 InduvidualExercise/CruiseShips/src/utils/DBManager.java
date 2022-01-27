
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Melissa Gómez
 */
public class DBManager {
    ConnectionString connectionString = new ConnectionString("mongodb+srv://mmgome5:mmgomez5@clusteroop.njqnq.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("CruiseShip");
    
    public MongoDatabase obtenerDB(){    
        return database;
    }
    public static void insertCruise(String id, String destination, String travelDate, String availability, String price){
        MongoCollection<Document> MongoConnection = new DBManager().obtenerDB().getCollection("MongoConnection");
        Document documento = new Document();
        
        documento.put("Id", id);
        documento.put("Destination", destination);
        documento.put("Travel Date", travelDate);
        documento.put("Availability", availability);
        documento.put("Price", price);
        
        MongoConnection.insertOne(documento);
    }
        
    public static void read(DefaultTableModel table){
        MongoCollection<Document> MongoConnection = new DBManager().obtenerDB().getCollection("MongoConnection");
        MongoCursor<Document> consulta = MongoConnection.find().iterator();
        
        int total = table.getRowCount();
        for(int i = 0; i<total; i++){
            table.removeRow(0);
        }
        while(consulta.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            table.addRow(doc.toArray());
        }
    }
    
    public static boolean delete(String id){
        MongoCollection<Document> MongoConnection = new DBManager().obtenerDB().getCollection("MongoConnection");
        DeleteResult answer = MongoConnection.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }
}
