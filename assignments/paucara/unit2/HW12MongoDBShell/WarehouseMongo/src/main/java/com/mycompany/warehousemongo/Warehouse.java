
package com.mycompany.warehousemongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

/**
 *
 * @author Javier Paucar
 */
public class Warehouse {
    
    public static void main(String[] args) {
        
        Mongo mongo = createConexion();
        
        if(mongo != null){
            DB db = mongo.getDB("TEST");
                    
            System.out.println("DATASABE CREATED");
            
            insertWeapon(db, "weapon", "1", "1890","pistol","9mm");
            insertWeapon(db,"weapon","2","1990","pistol","9mm");
            insertWeapon(db,"weapon","3","2010","Ak-47","762mm");
            insertWeapon(db,"weapon", "4", "2000", "pistol", "10mm");
            
        }
        
    }
    
    public static Mongo createConexion(){
        System.out.println("MONGODB CONNECTION TEST");
        
        Mongo mongo = null;
        
        mongo = new Mongo("localhost" , 27017);
        
        return mongo;
    }

    public static void insertWeapon(DB db, String collection,Integer id, int yearFabrication,String name,String caliber){
        
        DBCollection colec = db.getCollection(collection);
        
        BasicDBObject document = new BasicDBObject();
        document.put("id",id);
        document.put("yearFabrication",yearFabrication);
        document.put("name",name);
        document.put("caliber",caliber);
        
        colec.insert(document);
    }
    
    
}
