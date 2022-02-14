package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Joel Zeas
 */
public class DBManager {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://jazeas:jazeas@clusteroop.9yme9.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("SmartCityPlanet1");

    public MongoDatabase data() {
        return database;
    }
}
