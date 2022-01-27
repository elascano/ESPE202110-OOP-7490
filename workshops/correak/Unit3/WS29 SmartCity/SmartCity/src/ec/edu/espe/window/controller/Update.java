/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.window.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.Connection;

/**
 *
 * @author USUARIO
 */
public class Update {
    MongoCollection<Document> windows = new Connection().obtenerDB().getCollection("windows");    
    DefaultTableModel tabla2 = new DefaultTableModel(){
    public void view(){
        
        MongoCursor<Document> consult = windows.find().iterator();
        
        int total = tabla2.getRowCount();
        for(int i = 0; i<total; i++){
            tabla2.removeRow(0);
        }
        while(consult.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consult.next().values());
            tabla2.addRow(doc.toArray());
        }
    }
     public boolean Delete(String id){
        DeleteResult answer = windows.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    } 
};
}

