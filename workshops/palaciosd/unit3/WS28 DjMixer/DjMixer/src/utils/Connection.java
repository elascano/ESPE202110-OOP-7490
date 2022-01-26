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
public class Connection {
    

ConnectionString connectionString = new ConnectionString("mongodb+srv://dspalacios:dspalacios@cluster0.8plsi.mongodb.net/DjMixer?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("DjMixer");
   
    public MongoDatabase obtenerDB(){
        return database;
    }
}