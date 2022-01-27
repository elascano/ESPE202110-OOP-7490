/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;


/**
 *
 * @author Jose Guzman
 */
public class DBManager {
    ConnectionString connectionString = new ConnectionString("mongodb+srv://jdguzman:jdguzman@cluster0.avzkk.mongodb.net/dbmongo?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("dbmongo");
        
    public MongoDatabase obtenerDB(){    
        return database;
    }
    
    
    public static void create(String id, String name, String status, String direction, String phone){
        MongoCollection<Document> Universities = new DBManager().obtenerDB().getCollection("Universities");
        Document documento = new Document();
        
        documento.put("Id", id);
        documento.put("Name", name);
        documento.put("Status",status);
        documento.put("Direction",direction);
        documento.put("Phone",phone);
        
        Universities.insertOne(documento);       
    }
        
    public static void read(DefaultTableModel table){
        MongoCollection<Document> Universities = new DBManager().obtenerDB().getCollection("Universities");
        MongoCursor<Document> consulta = Universities.find().iterator();
        
        int total = table.getRowCount();
        for(int i = 0; i<total; i++){
            table.removeRow(0);
        }
        while(consulta.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            table.addRow(doc.toArray());
        }
    }
    
    public static boolean delete(String id){
        MongoCollection<Document> Universities = new DBManager().obtenerDB().getCollection("Universities");
        DeleteResult answer = Universities.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }
    
    public static void find(String id, DefaultTableModel table){
        MongoCollection<Document> Universities = new DBManager().obtenerDB().getCollection("Universities");
        Document documento = new Document();
        documento.put("Id",id);                
        
        MongoCursor<Document> consulta = Universities.find(documento).iterator();
        while(consulta.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            
            table.addRow(doc.toArray());
        }
    }
    
    public static void update(String id, String idu,String name, String status, String direction, String phone){
        Document filter;
        filter = new Document("_id",new ObjectId(id));
        
        MongoCollection<Document> Universities = new DBManager().obtenerDB().getCollection("Universities");
        Document documentoUp = new Document();
        
        documentoUp.put("Id", idu);
        documentoUp.put("Name", name);
        documentoUp.put("Status",status);
        documentoUp.put("Direction",direction);
        documentoUp.put("Phone",phone);
        
        Universities.updateOne(filter,new Document("$set",documentoUp)); 
    }
}
