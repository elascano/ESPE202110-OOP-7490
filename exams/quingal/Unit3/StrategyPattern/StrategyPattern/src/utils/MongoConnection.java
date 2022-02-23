package utils;



import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Leandro Quinga 
 */
public class MongoConnection {

        ConnectionString connectionString = new ConnectionString("mongodb+srv://lionarts16:1234587616Leoxo@clusteroop.oqwk9.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("EXAM");
    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}

