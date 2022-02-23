
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Guitarra Jhon
 */
public class Connection {

ConnectionString connectionString = new ConnectionString("mongodb+srv://30Alan:30Alan@clusteropp.v4nmx.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("SmartBed");
    
    public MongoDatabase obtenerDB(){
        return database;
        
    }

}
