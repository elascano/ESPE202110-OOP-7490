
package Utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author ALEJANDRODELACRUZ
 */
public class Connection {

    
ConnectionString connectionString = new ConnectionString("mongodb+srv://asde2:AlE_12AlE@clusteroop.ofume.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("WS30");


    public MongoDatabase obtenerDB(){
        return database;
    }

} 
