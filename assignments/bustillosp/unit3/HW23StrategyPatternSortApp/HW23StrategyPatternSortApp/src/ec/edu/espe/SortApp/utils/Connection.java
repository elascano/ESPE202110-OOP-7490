package ec.edu.espe.SortApp.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


public class Connection {
ConnectionString connectionString = new ConnectionString("mongodb+srv://PSBM:1751375971@cluster0.9shff.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = (MongoClient) MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Exam");
    
    public MongoDatabase obtenerDB(){
        return database;
    }


}
