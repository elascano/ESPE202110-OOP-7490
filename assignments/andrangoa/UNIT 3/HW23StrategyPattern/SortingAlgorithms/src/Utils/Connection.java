package Utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Alex Andrango
 */
public class Connection {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://axandrango:axandrango@clusteroop.aksis.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
         .build();
        MongoClient mongoClient = (MongoClient) MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("SortAlgorithm");   
    
    public MongoDatabase obtenerDB(){
        return database;
    }
      
}
