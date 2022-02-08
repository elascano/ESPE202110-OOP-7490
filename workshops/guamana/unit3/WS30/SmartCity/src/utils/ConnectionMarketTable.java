
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Angel Guaman
 */
public class ConnectionMarketTable {
    
    
ConnectionString connectionString = new ConnectionString("mongodb+srv://ANGELJR:3084@cluster0.sxlkt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("MarketTable");

    public MongoDatabase obtenerDB(){
        return database;
    }

}
