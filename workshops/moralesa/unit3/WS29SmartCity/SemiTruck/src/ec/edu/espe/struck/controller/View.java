
package ec.edu.espe.struck.controller;

import java.util.ArrayList;
import org.bson.Document;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.struck.view.frmtruck;

/**
 *
 * @author Anthony Morales
 */
public class View extends frmtruck{
    MongoCursor<Document> consult = Truck.find().iterator();
        
        /*int total = tabla.getRowCount();
        for(int i = 0; i<total; i++){
            tabla.removeRow(0);
        }
        while(consult.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consult.next().values());
            tabla.addRow(doc.toArray());
        }*/
    
}
