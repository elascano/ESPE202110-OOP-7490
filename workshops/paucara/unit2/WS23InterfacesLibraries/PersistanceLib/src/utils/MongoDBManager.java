
package utils;

import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class MongoDBManager implements DataBase{

    @Override
    public void openConnection(String connectionString) {
        System.out.println("Open Connection ->" + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("Close Connection");
    }

    @Override
    public void generateConnectionString(String user, String password, String dataBase) {
        System.out.println("Generate Connection String ->" + user + "password ->" + password + "Data Base ->" + dataBase);
    }

    @Override
    public void add(String data, String table) {
        System.out.println("Data->" + data + "adding->" + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void updated(String table, String search, String data) {
         System.out.println("updating file ->" + table + " record ->" + search );
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("deleting from file ->" + table + "record ->" + search);
    }

    @Override
    public String find(String table, String search) {
        return "found";
    }
    
}
