package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Melanie 
 */
public class Connection {
    
        ConnectionString connectionString = new ConnectionString("mongodb+srv://teranme:teranme@clusteroop.6dehr.mongodb.net/HighSchool?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("HighSchool");
    
    public MongoDatabase getDB(){
        return database;
    }

}
