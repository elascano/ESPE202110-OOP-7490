
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Daniel Lincango
 */
public class MongoConnection {

        ConnectionString connectionString = new ConnectionString("mongodb+srv://jdlincango:jdlincango@cluster0.rk58t.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Algorithms");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
