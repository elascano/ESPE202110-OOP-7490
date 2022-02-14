
package utils;

import java.util.ArrayList;

/**
 *
 * @author Alexander Ruano
 */
public class MongoDBManager implements DataBase{

    @Override
    public void openConnection(String connectionString) {
     System.out.println("Open connection ->"+connectionString);

    }

    @Override
    public void closeConnection() {
        System.out.println("close connection ");
 
    }

    @Override
    public void generationConnection(String user, String password, String dataBase) {
      System.out.println("Generation Connection ->"+user+"the password ->"+password+"data base ->"+dataBase);
    }

    @Override
    public void add(String data, String table) {
     System.out.println("Add file ->"+data+"in the table ->"+table);
        
    }

    @Override
    public ArrayList<String> read(String table) {
     System.out.println("Read ->"+table);
        return null; 
    }

    @Override
    public void update(String table, String search, String data) {
     System.out.println("Update file ->"+table+"the record ->"+search+data);
    
    }

    @Override
    public void delete(String table, String search) {
      System.out.println("deleting from file ->"+table+"the record ->"+search);
        
    }

    @Override
    public String find(String table, String search) {
     
        return "found";
     
    }
    
    
}
