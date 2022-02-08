
package ec.edu.espe.Truck.controller;

import com.mongodb.client.MongoCursor;
import ec.edu.espe.Truck.view.SemiTrucks;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Anthony Morales
 */
public class View extends SemiTrucks{
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
