package utils;

import java.util.ArrayList;

/**
 *
 * @author Melanie
 */
public class MongoDBManager implements DataBase{

    @Override
    public void openConnection(String connectionString) {
        System.out.println("Connection Opened" + connectionString);
    }

    @Override
    public void closConnection() {
        System.out.println("Connection Closed");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("Enter the user -> " + user + " Enter the password -> " + password);
    }

    @Override
    public void add(String data, String table) {
        System.out.println("Adding " + data + " in file " + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String tabel, String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String find(String table, String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
