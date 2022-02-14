
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Richar Maisincho
 */

  public class DBManager {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://ramaisincho1:ramaisincho1@clusteroop.hjw4g.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Sportballs");
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}  

