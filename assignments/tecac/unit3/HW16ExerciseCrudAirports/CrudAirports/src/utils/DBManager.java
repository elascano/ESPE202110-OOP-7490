
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Camila
 */
public class DBManager {
     ConnectionString connectionString = new ConnectionString("mongodb+srv://cmteca:1750288969@cluster0.bl97r.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("FindAirports");

    public MongoDatabase find() {
        return database;
    }
}
