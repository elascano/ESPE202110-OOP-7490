
package utils;

import java.util.ArrayList;

/**
 *
 * @author Christian Bravo
 */
public class MySQLDBManager implements DataBase{
    
    String connectionString;

    @Override
    public void openConnection(String connectionString) {
        System.out.println("The connections was established");
    }

    @Override
    public void closeConnection() {
        System.out.println("The connections was finished");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("The connections was generated throw the connection string");
    }

    @Override
    public void add(String data, String table) {
        System.out.println("Adding " + data + " in file -> " + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("Updating file -> " + table + " record -> " + search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("Deleting file -> " + table + " the record -> " + search);
    }

    @Override
    public String find(String table, String search) {
        return "Found";
    }
    

    
}
