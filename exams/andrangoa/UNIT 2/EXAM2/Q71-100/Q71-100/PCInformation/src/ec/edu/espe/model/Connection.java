
package ec.edu.espe.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Altamirano alex_
 */
public class Connection {
    
        ConnectionString connectionString = new ConnectionString("mongodb+srv://axandrango:axandrango@clusteroop.aksis.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
         .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Exam2");   
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}