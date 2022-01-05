
package ec.edu.espe.cbook.model;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author USUARIO
 */
public class Connection {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://KerlyCorrea:kerly@cluster0.bioem.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Contacts");

    public MongoDatabase obtenerDB(){
        return database;
    }
    
}
