
package ec.edu.espe.cbook.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author dylanasumaza
 */
public class Connection {
    
        ConnectionString connectionString = new ConnectionString("mongodb+srv://daasumaza:daasumaza@clusteroop.ukm8i.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("HW14CrudOperations");   

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
