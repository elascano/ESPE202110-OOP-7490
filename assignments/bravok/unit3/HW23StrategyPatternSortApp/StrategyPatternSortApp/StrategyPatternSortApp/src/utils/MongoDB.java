
package utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.awt.List;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katherin Bravo DEEL ESPE
 */
public class MongoDB implements MongoDBManager{

    DB dbMongo;
    DBCollection tableMongo;
    
    @Override
    public boolean create() {
        try {
            Mongo mongo = new Mongo("Localhost", 27017);
            dbMongo = mongo.getDB("Exam Unit 3");
            tableMongo = dbMongo.getCollection("Data");
        } catch (UnknownHostException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public int[] read(int[] data1, int[] data2) {
        BasicDBObject document = new BasicDBObject();
        document.put("Unordered", data1);
        document.put("Tidy", data2);
        tableMongo.insert(document);
        return null;
    }
    
}
