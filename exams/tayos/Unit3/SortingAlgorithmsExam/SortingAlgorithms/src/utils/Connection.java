
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Sebas
 */
public class Connection {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://SebasTar:1993dragonballz@clusteroop.vlogp.mongodb.net/ClusterOOP?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("LastExam");

    public MongoDatabase obtenerDB() {
        return database;
    }
}
