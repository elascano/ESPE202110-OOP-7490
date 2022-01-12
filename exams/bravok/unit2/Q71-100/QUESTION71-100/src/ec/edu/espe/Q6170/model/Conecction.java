
package ec.edu.espe.Q6170.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


/**
 *
 * @author Katherin Bravo
 */
public class Conecction {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://kdbravo:<password>@cluster0.fzxbf.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Q71-100");   

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}

    
}
