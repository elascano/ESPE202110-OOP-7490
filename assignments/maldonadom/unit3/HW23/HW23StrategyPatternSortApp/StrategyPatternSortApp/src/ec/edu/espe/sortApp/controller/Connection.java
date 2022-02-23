/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.sortApp.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
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
        MongoClient mongoClient = (MongoClient) MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Homework14");

    
    
    public MongoDatabase obtenerDB(){
        return database;
        
        
    }
}
