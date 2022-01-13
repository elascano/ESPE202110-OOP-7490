
package ec.edu.espe.exam.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Andy Calderon
 */
public class Connection {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://ajcalderon:ajcalderon@clusteroop.lgtlx.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Exam");
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
