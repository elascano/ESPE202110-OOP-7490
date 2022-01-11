<<<<<<< HEAD

package ec.edu.espe.cbook.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Mateo Maldonado
 */
public class Connection {
    
        ConnectionString connectionString = new ConnectionString("mongodb+srv://msmaldonado3:sancayo12@clusteroop.x3i1d.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Homework14");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
=======

package ec.edu.espe.cbook.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Mateo Maldonado
 */
public class Connection {
    
        ConnectionString connectionString = new ConnectionString("mongodb+srv://msmaldonado3:sancayo12@clusteroop.x3i1d.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Homework14");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
