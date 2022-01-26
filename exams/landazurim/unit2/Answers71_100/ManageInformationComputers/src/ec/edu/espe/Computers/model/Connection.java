
<<<<<<< HEAD:exams/landazurim/unit2/Answers71_100/ManageInformationComputers/src/ec/edu/espe/Computers/model/Connection.java
package ec.edu.espe.Computers.model;
=======
package ec.edu.espe.Computer.model;
>>>>>>> 0ea249654e197ce4a651699a90c9d28d0daecd6a:exams/landazurim/unit2/Answers71_100/ManageInformationComputers/src/ec/edu/espe/Computer/model/Connection.java

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class Connection {
    
    
ConnectionString connectionString = new ConnectionString("mongodb+srv://jdlincango:jdlinango@cluster0.rk58t.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("ExamUnit2");

    
    public MongoDatabase obtenerDB(){
        return database;
    }

}