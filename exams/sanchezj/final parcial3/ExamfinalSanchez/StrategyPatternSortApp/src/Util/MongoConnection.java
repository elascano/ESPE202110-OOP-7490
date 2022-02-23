/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jose Sanchez, DEEL-ESPE
 */
public class MongoConnection {

              ConnectionString connectionString = new ConnectionString("mongodb+srv://jfsanchez15:jfsanchez15@cluster0.pvcrw.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = (MongoClient) MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Warehouse");
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
