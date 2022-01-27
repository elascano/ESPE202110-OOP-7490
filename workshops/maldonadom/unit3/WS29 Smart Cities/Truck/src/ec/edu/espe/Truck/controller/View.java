/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Truck.controller;

import com.mongodb.client.MongoCursor;
import ec.edu.espe.Truck.view.Trucks;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author andresmaldonado
 */
public class View extends Trucks{
    MongoCursor<Document> consult = Workshop29.find().iterator();
        
        /*int total = tabla.getRowCount();
        for(int i = 0; i<total; i++){
            tabla.removeRow(0);
        }
        while(consult.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consult.next().values());
            tabla.addRow(doc.toArray());
        }*/
}
