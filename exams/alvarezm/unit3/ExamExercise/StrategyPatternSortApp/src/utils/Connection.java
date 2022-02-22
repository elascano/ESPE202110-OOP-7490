package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author mealvarez
 */
public class Connection {

    ConnectionString connectionString;
    MongoClientSettings settings;
    MongoClient mongoClient;
    MongoDatabase database;

    public Connection() {
        connectionString = new ConnectionString("mongodb+srv://mealvarez:mealvarez@clusteroop.09ypc.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        //Create a Mongo client
        mongoClient = MongoClients.create(settings);

        //Connecting to the database
        database = mongoClient.getDatabase("Exam3");

    }

    public MongoDatabase getDB() {
        return database;
    }

}
