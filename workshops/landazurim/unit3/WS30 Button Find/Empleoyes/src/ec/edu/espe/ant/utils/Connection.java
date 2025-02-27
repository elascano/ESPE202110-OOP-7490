
package ec.edu.espe.ant.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class Connection {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://mlandazuri:mlandazuri@cluster0.joijd.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Ant");
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
