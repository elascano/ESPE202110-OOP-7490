
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Salma Villegas
 */
public class MongoConnection {

        ConnectionString connectionString = new ConnectionString("mongodb+srv://NoLeaderTeam:Leader2022@clusternoleaderteam.uttuy.mongodb.net/House?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Caracteristics");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
