
package utils;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Anderson
 */
public class Connection {
    
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://andersmn:andersmn@clusteroop.3poht.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Computers");

    
    
    public MongoDatabase obtenerDB(){
        return database;
        
    }
    
}
