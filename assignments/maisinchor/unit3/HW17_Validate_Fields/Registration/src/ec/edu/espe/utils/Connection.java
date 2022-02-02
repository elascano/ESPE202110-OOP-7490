
package ec.edu.espe.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Maisincho Richar
 */
public class Connection {
 
        ConnectionString connectionString = new ConnectionString("mongodb+srv://ramaisincho1:ramaisincho1@clusteroop.hjw4g.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    MongoClient mongoClient = (MongoClient) MongoClients.create(settings);
   MongoDatabase database = mongoClient.getDatabase("Registration");

    public MongoDatabase obtenerDB(){
        return database;
    
    }
}