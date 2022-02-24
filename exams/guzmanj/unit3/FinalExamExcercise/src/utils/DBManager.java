/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Jose Guzman
 */
public class DBManager {
    ConnectionString connectionString = new ConnectionString("mongodb+srv://jdguzman:jdguzman@cluster0.avzkk.mongodb.net/Exam3P?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Exam3P");
        
    public MongoDatabase obtenerDB(){    
        return database;
    }
    
    public static void create(ArrayList Integers){
        MongoCollection<Document> Sorts = new DBManager().obtenerDB().getCollection("SortApp");
        Document documento = new Document();
        
        documento.put("sorted", Integers);
        
        Sorts.insertOne(documento);       
    }
}
