/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.Connection;

/**
 *
 * @author USUARIO
 */

public class Delete {
    MongoCollection<Document> fruits = new Connection().obtenerDB().getCollection("fruits");
    public boolean Delete(String id){
       DeleteResult answer = fruits.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }    
    
}
