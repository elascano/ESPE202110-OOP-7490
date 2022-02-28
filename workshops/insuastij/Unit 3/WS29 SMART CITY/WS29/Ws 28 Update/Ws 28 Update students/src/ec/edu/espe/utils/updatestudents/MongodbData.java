
package ec.edu.espe.utils.updatestudents;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jonathan Insuasti
 */
public class MongodbData {
         ConnectionString connectionString = new ConnectionString("mongodb+srv://jeinsuasti:jeinsuasti@clusteroopmedicalpro.z5ndn.mongodb.net/test?authSource=admin&replicaSet=atlas-nddmfa-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Student");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }



}
