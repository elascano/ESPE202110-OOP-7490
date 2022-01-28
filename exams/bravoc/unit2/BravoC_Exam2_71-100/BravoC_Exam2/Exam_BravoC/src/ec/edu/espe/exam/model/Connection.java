
package ec.edu.espe.exam.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Christian Bravo
 */
public class Connection {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://cdbravo3:cdbravo3@clusteroop.6qwrj.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Exam");
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
