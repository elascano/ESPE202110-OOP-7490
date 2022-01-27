
package ec.edu.espe.HardDrivers.model;

/**
 *
 * @author Asumaza,Bustillos,BravoC,BravoK
 */

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Connection {
    

ConnectionString connectionString = new ConnectionString("mongodb+srv://daasumaza:daasumaza@clusteroop.ukm8i.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("test");

    
    public MongoDatabase obtenerDB(){
        return database;
    }
    
}



