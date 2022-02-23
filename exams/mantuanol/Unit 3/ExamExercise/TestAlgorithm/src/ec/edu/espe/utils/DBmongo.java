package ec.edu.espe.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Leonel.M
 */
public class DBmongo {
    
   
    ConnectionString connectionString = new ConnectionString("mongodb+srv://TheTue:Thetrue_18@cluster0.tanum.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Test");

    
    public MongoDatabase obtenerDB(){
        return database;
    }
    
}
