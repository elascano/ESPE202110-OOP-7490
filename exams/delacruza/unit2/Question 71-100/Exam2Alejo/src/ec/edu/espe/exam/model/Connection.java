
package ec.edu.espe.exam.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author DELACRUZALEJANDRO
 */
public class Connection {
    
<<<<<<< HEAD
=======

>>>>>>> 6cc144153178c382f9eebcd761914ddea62ed9fa
ConnectionString connectionString = new ConnectionString("mongodb+srv://asde2:AlE_12AlE@clusteroop.ofume.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
<<<<<<< HEAD
MongoDatabase database = mongoClient.getDatabase("test");
=======
MongoDatabase database = mongoClient.getDatabase("Exam2");

>>>>>>> 6cc144153178c382f9eebcd761914ddea62ed9fa

    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
