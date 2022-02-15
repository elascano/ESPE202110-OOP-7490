/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SmartCity.model.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.DBManager;

/**
 *
 * @author dylanasumaza
 */
public class WaterSlideController {
    
    public static void create(String id, String high, String length, String inclinationAngle, String color, String material){
        MongoCollection<Document> WaterSlide = new DBManager().obtenerDB().getCollection("Water Slides");
        Document documento = new Document();
        
        documento.put("Id", id);
        documento.put("High", high);
        documento.put("Length",length);
        documento.put("Inclination Angle",inclinationAngle);
        documento.put("Color",color);
        documento.put("Material",material);
        
        WaterSlide.insertOne(documento);       
    }
    
    public static void read(DefaultTableModel table){
        MongoCollection<Document> WaterSlides = new DBManager().obtenerDB().getCollection("Water Slides");
        MongoCursor<Document> consulta = WaterSlides.find().iterator();
        
        int total = table.getRowCount();
        for(int i = 0; i<total; i++){
            table.removeRow(0);
        }
        while(consulta.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            table.addRow(doc.toArray());
        }
    }

    public static void find(String id, DefaultTableModel table){
        MongoCollection<Document> WaterSlides = new DBManager().obtenerDB().getCollection("Water Slides");
        Document documento = new Document();
        documento.put("Id",id);                
        
        MongoCursor<Document> consulta = WaterSlides.find(documento).iterator();
        while(consulta.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            
            table.addRow(doc.toArray());
        }
    }
    
    public static boolean delete(String id){
        MongoCollection<Document> WaterSlides = new DBManager().obtenerDB().getCollection("Water Slides");
        DeleteResult answer = WaterSlides.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }
}

