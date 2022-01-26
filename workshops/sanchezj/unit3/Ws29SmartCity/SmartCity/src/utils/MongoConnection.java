
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jose Sanchez 
 */
public class MongoConnection {

        ConnectionString connectionString;
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Lab");

    public MongoConnection() {
        this.connectionString = new ConnectionString("mongodb+srv://jfsanchez15:jfsanchez15@cluster0.pvcrw.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    }

    

    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
