package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Sebastian Palacios
 */
public class DBManager {
    

ConnectionString connectionString = new ConnectionString("mongodb+srv://dspalacios:dspalacios@cluster0.8plsi.mongodb.net/Castle?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Castles");
   
    public MongoDatabase obtenerDB(){
        return database;
    }
}