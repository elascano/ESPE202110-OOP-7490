
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author mealvarez
 */
public class Connection {
    
    
    //Connection String copied from Mongo
    ConnectionString connectionString = new ConnectionString("mongodb+srv://mealvarez:mealvarez@clusteroop.09ypc.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    
    //Create a Mongo client
    MongoClient mongoClient = MongoClients.create(settings);
    
    //Connecting to the database
    MongoDatabase database = mongoClient.getDatabase("SmartCity");

        
    public MongoDatabase getDB(){
        return database;
    }

}
