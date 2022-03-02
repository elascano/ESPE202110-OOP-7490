
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jonathan Insuasti DEEE-ESPE
 */
public class Connection {
    ConnectionString connectionString = new ConnectionString("mongodb+srv://jeinsuasti:jeinsuasti@clusteroopmedicalpro.z5ndn.mongodb.net/Student?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Student");


    
    public MongoDatabase obtenerDB(){
        return database;
    }
    
}
