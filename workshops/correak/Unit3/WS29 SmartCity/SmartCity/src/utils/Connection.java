/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author USUARIO
 */
public class Connection {
    
/**
 *
 * @author USUARIO
 */

    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://KerlyCorrea:kerly@cluster0.bioem.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Window");

    
    public MongoDatabase obtenerDB(){
        return database;
    
    
}
    
}