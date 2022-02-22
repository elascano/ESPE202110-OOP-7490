package utils;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Altamirano Cristhian
 */
public class MongoConnection {

        ConnectionString connectionString = new ConnectionString("mongodb+srv://caltamirano:caltamirano@clusteroop.hbmx5.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Pants");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
