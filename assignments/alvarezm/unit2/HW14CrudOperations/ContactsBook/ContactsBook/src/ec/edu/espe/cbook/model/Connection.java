
package ec.edu.espe.cbook.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author malvarez
 */
public class Connection {
    
        ConnectionString connectionString = new ConnectionString("");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("HW14CrudOperations");   

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
