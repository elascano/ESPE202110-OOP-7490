package ec.edu.espe.SortApp.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Caisatoa Sebastian
 */
public class Connection {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://sbcaisatoa:SB148005@clusteroop.lgtlx.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Proyect");


    
    public MongoDatabase obtenerDB(){
        return database;
    }

}