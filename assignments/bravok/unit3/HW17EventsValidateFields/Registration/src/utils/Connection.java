
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Katherin Bravo
 */
public class Connection {

ConnectionString connectionString = new ConnectionString("mongodb+srv://bravok:bravok@clusteroop.aiemd.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("SmartBBQ");
    
    public MongoDatabase obtenerDB(){
        return database;
        
    }

}
